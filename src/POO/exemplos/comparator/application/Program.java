package POO.exemplos.comparator.application;

import POO.exemplos.comparator.entities.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 450.00));

        // list.sort(new MyComparator());       // Criando outra Classe (interface funcional)

        /*Comparator<Product> comp = new Comparator<Product>() {        // Classe anônima: Sem expressão lambda
            @Override
            public int compare(Product p1, Product p2) {
                return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
            }
        };*/

        // Comparator<Product> comp = (p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());     // Classe anônima: Com expressão lambda

        // Comparator<Product> comp = Comparator.comparing(p -> p.getName().toUpperCase());     // Classe anônima: Através do .comparing e expressão lambda

        list.sort(Comparator.comparing(p -> p.getName().toUpperCase()));

        for (Product p : list) {
            System.out.println(p);
        }
    }
}
