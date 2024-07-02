import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class ContagemDeVotos {
    public static void main(String[] args) {
        // Nome do arquivo de entrada contendo os registros de votação
        String arquivo = "/votacao.txt"; // Caminho relativo dentro do classpath

        // Mapa para armazenar os totais de votos por candidato
        Map<String, Integer> votosPorCandidato = new HashMap<>();

        // Obter o arquivo como um recurso do classpath
        InputStream inputStream = ContagemDeVotos.class.getResourceAsStream(arquivo);

        if (inputStream == null) {
            System.err.println("Arquivo não encontrado: " + arquivo);
            return;
        }

        // Bloco try-with-resources para garantir que o BufferedReader seja fechado automaticamente
        try (BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))) {
            String linha;

            // Ler o arquivo linha por linha
            while ((linha = br.readLine()) != null) {
                // Adicionar log para verificar a linha lida
                System.out.println("Linha lida: " + linha);

                // Dividir a linha em duas partes: nome do candidato e quantidade de votos
                String[] partes = linha.split(" ");

                // Verificar se a linha foi dividida corretamente
                if (partes.length != 2) {
                    System.err.println("Formato de linha inválido: " + linha);
                    continue;
                }

                String candidato = partes[0];
                int votos;

                // Tentar converter a quantidade de votos para inteiro
                try {
                    votos = Integer.parseInt(partes[1]);
                } catch (NumberFormatException e) {
                    System.err.println("Quantidade de votos inválida: " + partes[1]);
                    continue;
                }

                // Atualizar o total de votos do candidato no mapa
                votosPorCandidato.put(candidato, votosPorCandidato.getOrDefault(candidato, 0) + votos);
            }
        } catch (IOException e) {
            // Imprimir a pilha de exceção em caso de erro de I/O
            e.printStackTrace();
        }

        // Gerar o relatório de votos consolidados
        System.out.println("Relatório de Votos Consolidados:");
        for (Map.Entry<String, Integer> entry : votosPorCandidato.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
