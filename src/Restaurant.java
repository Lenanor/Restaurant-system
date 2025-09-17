import java.util.Scanner;

class Restaurant {
    private boolean isOpen;
    private Kitchen kitchen;
    private Menu menu;
    private Staff staff;
    private InputHandler inputHandler;
    private Scanner scanner = new Scanner(System.in);

    public Restaurant() {
        this.isOpen = false;
        this.kitchen = new Kitchen();
        this.menu = new Menu();
        this.staff = new Staff();
        this.inputHandler = new InputHandler();
        staff.addStaff(new Employee("100","Anna", "Dahl", "111-11111"));
        staff.addStaff(new Employee("101", "Olle", "Berg", "222-22222"));
        staff.addStaff(new Employee("102", "Kalle", "Borg", "333-333333"));
        menu.addToMenu(new MenuItem("Lasagna", 130));
        menu.addToMenu(new MenuItem("Chili", 120));
        menu.addToMenu(new MenuItem("Crispy Tofu", 150));
    }

    public void open() {
        this.isOpen = true;
        System.out.println("The restaurant is open!");
    }

    public void close() {
        this.isOpen = false;
        System.out.println("The restaurant is closed!");
    }

    public void handleRestaurantSystem() {
        System.out.printf("The restaurant is %s%n", this.isOpen ? "OPEN" : "CLOSED");

        while (true) {
            System.out.printf("--- RESTAURANT ---%n");
            System.out.printf("1. Open%n");
            System.out.printf("2. Close and exit%n");

            int input = inputHandler.getIntInput(1, 2);

            if (input == 1) {
                this.isOpen = true;
                System.out.println("The restaurant is now OPEN");
                handleRestaurant();
                break;
            } else if (input == 2) {
                this.isOpen = false;
                System.out.println("Exiting...");
                System.out.println("The restaurant is now CLOSED");
                break;
            } else {
                System.out.println("Invalid option. Try again.");
            }
        }
    }

    public void handleRestaurant() {
        System.out.println("--- CHOOSE AN OPTION ---");
        System.out.println("1. ");
        System.out.println("2. Order");
        System.out.println("3. Handle staff");
        System.out.println("4. Handle menu");
        System.out.println("5. Close restaurant");

        int choice = inputHandler.getIntInput(1, 5);

        switch(choice) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                staff.run();
                break;
            case 4:
                System.out.println("--- MENU ---");
                System.out.println("1. Add dish");
                System.out.println("2. Remove dish");
                System.out.println("3. Display menu");
                break;
            case 5:
                handleRestaurantSystem();
                break;
            default:
                break;
        }

    }



}
