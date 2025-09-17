import java.util.ArrayList;
import java.util.Scanner;

class DisplayMenu {
//    Scanner scanner = new Scanner(System.in);
//
//    public int displayMainMenu() {
//        System.out.println("--- CHOOSE AN OPTION ---");
//        System.out.println("1. Open or close restaurant");
//        System.out.println("2. Get order");
//        System.out.println("3. Cook food");
//        System.out.println("4. Handle staff");
//        System.out.println("5. Handle menu");
//        System.out.println("0. Exit");
//
//        return scanner.nextInt();
//    }
//
//    public int displayOpenOrCloseMenu(Restaurant r) {
//        String condition = r.isOpen() ? "open" : "closed";
//
//        System.out.printf("The restaurant is %s%n", condition.toUpperCase());
//        System.out.println("--- CHOOSE AN OPTION ---!");
//        System.out.println("1. Open restaurant");
//        System.out.println("2. Close restaurant");
//
//        return scanner.nextInt();
//    }
//
//    public ArrayList<Integer> displayMenu(Menu m) {
//        System.out.println("--- MENU ---");
//        m.getMenu();
//        ArrayList<Integer> order = new ArrayList<>();
//
//        int i = 1;
//        while(i != 0) {
//            System.out.println("🍝Choose a dish from the menu:");
//            int choice = scanner.nextInt();
//            scanner.nextLine();
//            order.add(choice);
//
//            System.out.println("👀Anything else (Y/N)?");
//            String j = scanner.nextLine();
//
//            if(j.equals("Y")) {
//                i = 1;
//            } else if(j.equals("N")) {
//                i = 0;
//            }
//        }
//
//        return order;
//    }
//
//    public int displayStaffMenu() {
//        System.out.println("--- CHOOSE AN OPTION ---");
//        System.out.println("1. Add staff");
//        System.out.println("2. Remove staff");
//
//        return scanner.nextInt();
//    }
//
//    public void handleStaffList(int i, Staff s) {
//        if(i == 1) {
//            System.out.println("Add first name");
//            String name = scanner.nextLine();
//            System.out.println("Add last name");
//            String lastName = scanner.nextLine();
//            System.out.println("Add phone number");
//            String phoneNum = scanner.nextLine();
//            System.out.println("Add ID");
//            String staffID = scanner.nextLine();
//
//            s.addStaff(name, lastName,staffID, phoneNum);
//        }
//
//        if(i == 2) {
//            System.out.println("Add id of the person to remove:");
//            String id = scanner.nextLine();
//            s.removeStaff(id);
//        }
//    }
}
