package application;

import entities.Product;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        // Criação de uma lista de produtos
        List<Product> list = new ArrayList<>();

        // Adição de produtos à lista
        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 450.00));

        // Ordenação da lista usando um lambda para comparar os nomes dos produtos em maiúsculas, quando é apenas uma linha utilizar um lambda reduzido
        list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));

        // Versão completa do sort usando lambda
        // list.sort((Product p1, Product p2) -> {
        //     return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
        // });

        // Versão sem usar lambda (usando uma classe anônima)
        // list.sort(new Comparator<Product>() {
        //     @Override
        //     public int compare(Product p1, Product p2) {
        //         return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
        //     }
        // });

        // Impressão da lista ordenada
        for (Product p : list) {
            System.out.println(p);
        }
    }
}
