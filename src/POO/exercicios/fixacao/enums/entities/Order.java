package POO.exercicios.fixacao.enums.entities;

import POO.exemplos.enums.entities.enums.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private Date moment;
    private OrderStatus status;

    Client client = new Client();
    List<OrderItem> orderItens = new ArrayList<>();

    public Order() {}

    public Order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public Date getMoment() {
        return moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<OrderItem> getOrderItens() {
        return orderItens;
    }

    public void addItem(OrderItem orderItem) {
        orderItens.add(orderItem);
    }

    public void removeItem(OrderItem orderItem) {
        orderItens.remove(orderItem);
    }

    public Double total() {
        Double sum = 0.00;
        for (OrderItem o : orderItens) {
            sum += o.subTotal();
        }
        return sum;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order moment: ");
        sb.append(sdf.format(moment)).append("\n");
        sb.append("Order status: ");
        sb.append(status).append("\n");
        sb.append("Client: ");
        sb.append(client).append("\n");
        sb.append("Order items:\n");
        for (OrderItem item : orderItens) {
            sb.append(item).append("\n");
        }
        sb.append("Total price: $");
        sb.append(String.format("%.2f", total()));
        return sb.toString();
    }
}