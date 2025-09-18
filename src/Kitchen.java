import java.util.ArrayList;
import java.util.List;

class Kitchen {
    // private List<Order> orders = new ArrayList<>();
    private final OrderManager orderManager;
    private final InputHandler inputHandler = new InputHandler();

    Kitchen(OrderManager orderManager) {
        this.orderManager = orderManager;
    }

    public void cookOrder() {
        orderManager.displayOrders();
        System.out.println();
        System.out.println("Add the order number:");
        int num = inputHandler.getIntInput();

        System.out.println("Chef is cooking");
        System.out.println("Chef is cooking");
        System.out.println("Chef is cooking");
        System.out.println("Chef is cooking");
        System.out.println("Chef is cooking");
        System.out.println("DONE!");

        for(Order order : orderManager.getOrders()) {
            if(order.getId().equals(Integer.toString(num))) {
                order.setCooked(true);
                orderManager.displayOrders();
                System.out.println();
            }
        }
    }

    public void run() {
        boolean isRunning = true;
        while(isRunning) {
            System.out.println("--- MANAGE KITCHEN ---");
            System.out.println("1. Cook order");
            System.out.println("2. Display orders");
            System.out.println("3. To main menu");

            InputHandler inputHandler = new InputHandler();
            int choice = inputHandler.getIntInput(1, 3);

            switch (choice) {
                case 1:
                    cookOrder();
                    break;
                case 2:
                    orderManager.displayOrders();
                    break;
                case 3:
                    isRunning = false;
                    break;
                default:
                    break;
            }
        }
    }
}
