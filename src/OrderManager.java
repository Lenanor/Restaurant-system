import java.util.ArrayList;
import java.util.List;

public class OrderManager {
    private List<Order> orders = new ArrayList<>();
    private int id = 0;

    public int getId() {
        id++;
        return id;
    }

    public List<Order> getOrders() {
        return new ArrayList<>(orders);
    }

    public Order getOrders(int id) {
        return orders.get(id);
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public void displayOrders() {
        for(Order order : orders) {
            System.out.println(order);
        }
    }
}
