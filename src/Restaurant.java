import java.util.Scanner;

class Restaurant {
    private boolean isOpen;
    private final Kitchen kitchen;
    private final Menu menu;
    private final Staff staff;
    private final InputHandler inputHandler;

    public Restaurant() {
        OrderManager orderManager = new OrderManager();
        this.isOpen = false;
        this.kitchen = new Kitchen(orderManager);
        this.menu = new Menu(orderManager);
        this.staff = new Staff();
        this.inputHandler = new InputHandler();
    }

    public void open() {
        this.isOpen = true;
        System.out.println("The restaurant is OPEN");
        System.out.println();
    }

    public void close() {
        this.isOpen = false;
        System.out.println("The restaurant is CLOSED");
        System.out.println();
    }

    public void restaurantStatus() {
        while (true) {
            System.out.printf("--- RESTAURANT %s ---%n", this.isOpen ? "🟢" : "🔴");
            System.out.println("1. Open restaurant");
            System.out.println("2. Close restaurant");
            System.out.println("3. Back to main menu");

            int input = inputHandler.getIntInput(1, 3);

            if (input == 1) {
                open();
            } else if (input == 2) {
                close();
            } else if(input == 3) {
                return;
            }
        }
    }

    public void run() {
        while(true) {
            System.out.println();
            System.out.println("--- MAIN MENU ---");
            System.out.printf("1. Restaurant status %s%n", this.isOpen ? "🟢" : "🔴");
            System.out.println("2. Kitchen");
            System.out.println("3. Staff");
            System.out.println("4. Waiter");
            System.out.println("5. Exit");

            int choice = inputHandler.getIntInput(1, 5);

            switch(choice) {
                case 1:
                    restaurantStatus();
                    break;
                case 2:
                    kitchen.run();
                    break;
                case 3:
                    staff.run();
                    break;
                case 4:
                    menu.run();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    break;
            }
        }
    }
}
