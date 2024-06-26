import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TotalAlunosInstrutor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<Integer> alunos = new HashSet<>();

        // Ler alunos do curso A
        System.out.println("Digite a quantidade de alunos do curso A:");
        int numAlunosA = scanner.nextInt();
        System.out.println("Digite os códigos dos alunos do curso A:");
        for (int i = 0; i < numAlunosA; i++) {
            int codigoAluno = scanner.nextInt();
            alunos.add(codigoAluno);
        }

        // Ler alunos do curso B
        System.out.println("Digite a quantidade de alunos do curso B:");
        int numAlunosB = scanner.nextInt();
        System.out.println("Digite os códigos dos alunos do curso B:");
        for (int i = 0; i < numAlunosB; i++) {
            int codigoAluno = scanner.nextInt();
            alunos.add(codigoAluno);
        }

        // Ler alunos do curso C
        System.out.println("Digite a quantidade de alunos do curso C:");
        int numAlunosC = scanner.nextInt();
        System.out.println("Digite os códigos dos alunos do curso C:");
        for (int i = 0; i < numAlunosC; i++) {
            int codigoAluno = scanner.nextInt();
            alunos.add(codigoAluno);
        }

        // Exibir o número total de alunos únicos
        System.out.println("O número total de alunos únicos do instrutor Alex é: " + alunos.size());

        scanner.close();
    }
}
