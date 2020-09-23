package POO.exemplos.comparator.application;

import POO.exemplos.comparator.entities.Product;

import java.util.Comparator;

public class MyComparator implements Comparator<Product> {  // Interface funcional
    @Override
    public int compare(Product p1, Product p2) {
        return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
    }
}
