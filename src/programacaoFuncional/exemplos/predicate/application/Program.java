package programacaoFuncional.exemplos.predicate.application;

import programacaoFuncional.exemplos.predicate.entities.Product;
import programacaoFuncional.exemplos.predicate.util.ProductPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        list.removeIf(new ProductPredicate()); // Implementação da interface

        list.removeIf(Product::staticProductPredicate); // Reference method com método estático

        list.removeIf(Product::nonStaticProductPredicate); // Reference method com método não estático

        Predicate<Product> predicate = product -> product.getPrice() >= 100.00;
        list.removeIf(predicate); // Expressão lambda declarada

        list.removeIf(product -> product.getPrice() >= 100.00); // Expressão lambda inline

        for (Product p : list) {
            System.out.println(p);
        }
    }
}
