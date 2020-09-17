package POO.exercicios.fixacao.exercicio9.application;

import POO.exemplos.testeEnums.entities.enums.OrderStatus;
import POO.exercicios.fixacao.exercicio9.entities.Client;
import POO.exercicios.fixacao.exercicio9.entities.Order;
import POO.exercicios.fixacao.exercicio9.entities.OrderItem;
import POO.exercicios.fixacao.exercicio9.entities.Product;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter cliente data:");
        System.out.print("Name: ");
        String name =  sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date date = sdf.parse(sc.nextLine());

        Client client = new Client(name, email, date);

        System.out.println("Enter order data:");
        System.out.print("Status: ");
        String status = sc.next();

        Order order = new Order(new Date(), OrderStatus.valueOf(status), client);

        System.out.print("How many items to this order? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter #" + (i+1) + " item data:");
            System.out.print("Product name: ");
            String productName = sc.next();
            System.out.print("Product price: ");
            Double productPrice = sc.nextDouble();
            System.out.print("Quantity: ");
            int quantity = sc.nextInt();

            Product product = new Product(productName, productPrice);

            OrderItem item = new OrderItem(quantity, product.getPrice(), product);
            order.addItem(item);
        }

        System.out.println("\nORDER SUMMARY:");
        System.out.println(order);

        sc.close();
    }
}