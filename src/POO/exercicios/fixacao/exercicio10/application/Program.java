package POO.exercicios.fixacao.exercicio10.application;

import POO.exemplos.testeComposicao.exercicio2.entities.Post;
import POO.exercicios.fixacao.exercicio10.entities.ImportedProduct;
import POO.exercicios.fixacao.exercicio10.entities.Product;
import POO.exercicios.fixacao.exercicio10.entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> listProducts = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Product #" + (i+1) + " data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            char response = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String productName = sc.nextLine();
            System.out.print("Price: ");
            double productPrice = sc.nextDouble();

            if (response == 'c') {
                listProducts.add(new Product(productName, productPrice));
            } else if (response == 'u') {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                Date date = sdf.parse(sc.next());
                listProducts.add(new UsedProduct(productName, productPrice, date));
            } else if (response == 'i'){
                System.out.print("Customs fee: ");
                double customs = sc.nextDouble();
                listProducts.add(new ImportedProduct(productName, productPrice, customs));
            }
        }

        System.out.println("\nPRICE TAGS:");
        for (Product p : listProducts) {
            System.out.println(p.priceTag());
        }

        sc.close();
    }
}
