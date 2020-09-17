package POO.exercicios.problemas.problema2.application;

import POO.exercicios.problemas.problema2.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();

        Product product = new Product(name, price);

        System.out.println("\nProduct data: " + product);

        System.out.print("\nEnter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);

        System.out.println("\nUpdated data: " + product);

        System.out.print("\nEnter the number of products to be removed in stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);

        System.out.println("\nUpdated data: " + product);

        sc.close();
    }
}