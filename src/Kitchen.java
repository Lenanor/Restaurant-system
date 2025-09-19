import java.util.ArrayList;
import java.util.List;

class Kitchen {
    private final OrderManager orderManager;
    private final InputHandler inputHandler = new InputHandler();

    public Kitchen(OrderManager orderManager) {
        this.orderManager = orderManager;
    }

    public boolean checkIfOrders() {
        if(orderManager.getOrders().isEmpty()) {
            System.out.println("No orders at the moment!");
            System.out.println();
            return false;
        } else {
            orderManager.displayOrders();
            return true;
        }
    }

    public void displayOrders() {
        checkIfOrders();
    }

    public void cookOrder() {
        boolean hasOrders = checkIfOrders();

        if(hasOrders) {
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
                }
            }
        }
    }

    public void run() {
        boolean isRunning = true;
        while(isRunning) {
            System.out.println();
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
                    displayOrders();
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
