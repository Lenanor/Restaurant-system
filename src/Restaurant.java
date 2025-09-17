import java.util.Scanner;

class Restaurant {
    private boolean isOpen;
    private Kitchen kitchen;
    private Menu menu = new Menu();
    private Staff staff = new Staff();
    private Employee employee;
    private PrintMenu printMenu = new PrintMenu();
    private Scanner scanner = new Scanner(System.in);

    public Restaurant() {
        this.isOpen = false;
        this.kitchen = new Kitchen();
        //this.menu = new Menu();
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
        staff.addStaff(new Employee("100","Anna", "Dahl", "111-11111"));
        staff.addStaff(new Employee("101", "Olle", "Berg", "222-22222"));
        staff.addStaff(new Employee("102", "Kalle", "Borg", "333-333333"));
        menu.addToMenu(new MenuItem("Lasagna", 130));
        menu.addToMenu(new MenuItem("Chili", 120));
        menu.addToMenu(new MenuItem("Crispy Tofu", 150));

        System.out.printf("The restaurant is %s%n", this.isOpen ? "OPEN" : "CLOSED");

        while (true) {
            System.out.printf("--- RESTAURANT ---%n");
            System.out.printf("1. Open%n");
            System.out.printf("2. Close and exit%n");

            // Check if there is a line to read
            if (!scanner.hasNextInt()) {
                System.out.println("No input. Try again.");
                scanner.nextLine();
                continue;
            }

            int input = scanner.nextInt();
            scanner.nextLine();


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
        System.out.println("2. Get order");
        System.out.println("3. Handle staff");
        System.out.println("4. Close restaurant");

        int choice = scanner.nextInt();

        switch(choice) {
            case 3:
                staff.run();
//                printMenu.printStaffMenu();
//
//                int staffChoice = scanner.nextInt();
//                scanner.nextLine();
//
//                if(staffChoice == 1) {
//                    staff.getStaffList();
//                } else if (staffChoice == 2) {
//                    staff.getStaffList();
//                    System.out.println("Add id:");
//                    String id = scanner.nextLine();
//                    System.out.println("Add name:");
//                    String name = scanner.nextLine();
//                    System.out.println("Add last name");
//                    String lastName = scanner.nextLine();
//                    System.out.println("Add phone number:");
//                    String phone = scanner.nextLine();
//                    staff.addStaff(new Employee(id, name, lastName, phone));
//                    staff.getStaffList();
//                }
                break;
            case 4:
                handleRestaurantSystem();
                break;
        }

    }



}
