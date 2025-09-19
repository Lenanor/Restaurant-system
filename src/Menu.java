
import java.util.ArrayList;
import java.util.List;

class Menu {
    private final List<MenuItem> menuList = new ArrayList<>();
    private final InputHandler inputHandler = new InputHandler();
    private final OrderManager orderManager;


    public Menu(OrderManager orderManager) {
        this.orderManager = orderManager;
        menuList.add(new MenuItem("Lasagna", 130));
        menuList.add(new MenuItem("Chili", 120));
        menuList.add(new MenuItem("Tofu", 150));
    }

    public String capitalize(String s) {
        String capitalize = s.substring(0, 1).toUpperCase();
        String remaining = s.substring(1);

        return capitalize + remaining;
    }

    public void displayMenu() {
        System.out.println();
        System.out.println("--- RESTAURANT MENU ---");

        if(menuList.isEmpty()) {
            System.out.println("No dishes are added yet!");
            return;
        }

        int count = 1;
        for(MenuItem menuItem : menuList) {
            System.out.println(count++ + ". " + menuItem);
        }
    }

    public void addDishToMenu() {
        System.out.println("Add a dish:");
        String dish = inputHandler.getStringInput();
        String formattedDish = capitalize(dish);

        System.out.println("Add a price:");
        int price = inputHandler.getIntInput();

        MenuItem item = new MenuItem(formattedDish, price);
        menuList.add(item);
        System.out.println(item + " was added to the menu");
        System.out.println();
    }

    public void removeDishFromMenu() {
        System.out.println("Add the dish´s name:");
        String dish = inputHandler.getStringInput();

        MenuItem itemRemoved = null;

        for(MenuItem item : menuList) {
            String current = item.getDish().toLowerCase();

            if(current.equals(dish.toLowerCase())) {
                itemRemoved = item;
                menuList.remove(item);
                System.out.println(itemRemoved + " was removed from the menu");
                System.out.println();
                break;
            }
        }

        if (itemRemoved == null) {
            System.out.println("The dish was not found in the menu!");
            System.out.println();
        }
    }

    public void takeOrder() {
        String idString = Integer.toString(orderManager.getId());
        int totalSum = 0;
        List<String> orderList = new ArrayList<>();

        displayMenu();

        boolean isRunning = true;
        while(isRunning) {
            System.out.println("Add name of dish (x = finish):");
            String dish = inputHandler.getStringInput();

            if(dish.equalsIgnoreCase("x")) {
                isRunning = false;
                System.out.println();
            } else {
                String formattedDish = capitalize(dish);
                orderList.add(formattedDish);

                for(MenuItem item: menuList) {
                    if(item.getDish().equalsIgnoreCase(dish)) {
                        totalSum += item.getPrice();
                    }
                }
            }
        }

        String order = String.join(", ", orderList);
        Order orderToAdd = new Order(idString, order, totalSum);
        orderManager.addOrder(orderToAdd);
        System.out.println(orderManager.getOrders(Integer.parseInt(idString) - 1));
        System.out.println();
    }

    public void serveOrder() {
        orderManager.displayOrders();
        System.out.println("Add number of order to serve:");
        int num = inputHandler.getIntInput();
        System.out.println();

        for(Order order : orderManager.getOrders()) {
            if(order.getId().equals(Integer.toString(num))) {
                order.setServed(true);
                orderManager.displayOrders();
                System.out.println();
            }
        }
    }

    public void payOrder() {
        orderManager.displayOrders();
        System.out.println("Add number of order to pay:");
        int num = inputHandler.getIntInput();
        System.out.println();

        for(Order order : orderManager.getOrders()) {
            if(order.getId().equals(Integer.toString(num))) {
                order.setPayed(true);
                orderManager.displayOrders();
                System.out.println();
            }
        }
    }

    public void run() {
        boolean running = true;
        while(running) {
            System.out.println();
            System.out.println("--- WAITER MENU ---");
            System.out.println("1. Display restaurant menu");
            System.out.println("2. Add dish");
            System.out.println("3. Remove dish");
            System.out.println("4. Take order");
            System.out.println("5. Ready for service");
            System.out.println("6. Take payment");
            System.out.println("7. Back to main menu");

            InputHandler inputHandler = new InputHandler();
            int choice = inputHandler.getIntInput(1, 7);

            switch (choice) {
                case 1:
                    displayMenu();
                    break;
                case 2:
                    addDishToMenu();
                    break;
                case 3:
                    removeDishFromMenu();
                    break;
                case 4:
                    takeOrder();
                    break;
                case 5:
                    serveOrder();
                    break;
                case 6:
                    payOrder();
                    break;
                case 7:
                    running = false;
                    break;
                default:
                    break;
            }
        }
    }
}
