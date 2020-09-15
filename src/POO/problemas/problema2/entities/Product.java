package POO.problemas.problema2.entities;

public class Product {

    public String name;
    public double price;
    public int quantity;

    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProducts(int _quantity) {
        this.quantity += _quantity;
    }

    public void removeProducts(int _quantity) {
        this.quantity -= _quantity;
    }
}