
import java.util.ArrayList;
import java.util.List;

class Menu {
    private final List<MenuItem> menuList = new ArrayList<>();
    private final InputHandler inputHandler = new InputHandler();

    public Menu() {
        menuList.add(new MenuItem("Lasagna", 130));
        menuList.add(new MenuItem("Chili", 120));
        menuList.add(new MenuItem("Crispy Tofu", 150));
    }

    public void addDishToMenu() {
        System.out.println("Add a dish:");
        String dish = inputHandler.getStringInput();
        System.out.println("Add a price:");
        int price = inputHandler.getIntInput();

        MenuItem item = new MenuItem(dish, price);
        menuList.add(item);
        System.out.println(item + " was added to the menu");
        System.out.println();
    }

    public void removeDishFromMenu() {
        InputHandler inputHandler = new InputHandler();
        System.out.println("Add the dish´s name:");
        String dish = inputHandler.getStringInput().toLowerCase();

        MenuItem itemRemoved = null;

        for(MenuItem item : menuList) {
            String current = item.getDish().toLowerCase();
            if(current.equals(dish)) {
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

    public void displayMenu() {
        System.out.println("--- RESTAURANT MENU ---");

        if(menuList.isEmpty()) {
            System.out.println("No dishes are added yet!");
            return;
        }

        int count = 1;
        for(MenuItem menuItem : menuList) {
            System.out.println(count++ + ". " + menuItem);
        }
        System.out.println();
    }

    public void run() {
        boolean running = true;
        while(running) {
            System.out.println("--- MANAGE MENU ---");
            System.out.println("1. Display restaurant menu");
            System.out.println("2. Add dish");
            System.out.println("3. Remove dish");
            System.out.println("4. Take order"); // <-- Kitchen: orderList(id, order, sum, isPayed, isServed, isCooked)
            System.out.println("5. Take payment"); // <--- Kitchen orderList + mark as payed + remove
            System.out.println("6. Ready for service"); // <--- Kitchen orderList + mark as served
            System.out.println("7. Back to main menu");

            InputHandler inputHandler = new InputHandler();
            int choice = inputHandler.getIntInput(1, 6);

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
                    break;
                case 5:
                    break;
                case 6:
                    running = false;
                    break;
                default:
                    break;
            }
        }
    }
}
