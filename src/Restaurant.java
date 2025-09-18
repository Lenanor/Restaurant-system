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
    }

    public void open() {
        this.isOpen = true;
        System.out.println("The restaurant is open!");
    }

    public void close() {
        this.isOpen = false;
        System.out.println("The restaurant is closed!");
    }

    public void restaurantStatus() {
        while (true) {
            System.out.printf("--- RESTAURANT (%s) ---%n", this.isOpen ? "OPEN" : "CLOSED");
            System.out.println("1. Open restaurant");
            System.out.println("2. Close restaurant");
            System.out.println("3. Back to main menu");

            int input = inputHandler.getIntInput(1, 3);

            if (input == 1) {
                this.isOpen = true;
                System.out.printf("The restaurant is now OPEN%n%n");
            } else if (input == 2) {
                this.isOpen = false;
                System.out.printf("The restaurant is now CLOSED%n%n");
                System.out.println();
            } else if(input == 3) {
                return;
            }
        }
    }

    public void run() {
        while(true) {
            System.out.println("--- MAIN MENU ---");
            System.out.println("1. Restaurant status");
            System.out.println("2. Manage kitchen");
            System.out.println("3. Manage staff");
            System.out.println("4. Manage menu");
            System.out.println("5. Exit");

            int choice = inputHandler.getIntInput(1, 5);

            switch(choice) {
                case 1:
                    restaurantStatus();
                    break;
                case 2:
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
