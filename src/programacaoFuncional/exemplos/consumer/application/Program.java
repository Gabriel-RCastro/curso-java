package programacaoFuncional.exemplos.consumer.application;

import programacaoFuncional.exemplos.consumer.entities.Product;
import programacaoFuncional.exemplos.consumer.util.PriceUpdate;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        list.forEach(new PriceUpdate()); // Implementação da interface

        list.forEach(Product::staticPriceUpdate); // Reference method com método estático

        list.forEach(Product::nonStaticPriceUpdate); // Reference method com método não estático

        Consumer<Product> consumer = product -> product.setPrice(product.getPrice() * 1.1);
        list.forEach(consumer); // Expressão lambda declarada

        list.forEach(product -> product.setPrice(product.getPrice() * 1.1)); // Expressão lambda inline

        list.forEach(System.out::println);
    }
}
