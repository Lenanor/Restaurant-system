import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Restaurant r = new Restaurant();
//
//        Scanner scanner = new Scanner(System.in);
//        int optionChoice = displayMenu(scanner);
//
//       // System.out.println(optionChoice);
//
//        switch (optionChoice) {
//            case 1:
//                boolean condition = r.isOpen ? "";
//                System.out.printf("The restaurant is %b ", condition, );
//
//                break;
//            case 2:
//                break;
//            case 3:
//                break;
//            case 4:
//                break;
//            case 5:
//                break;
//            case 0:
//                System.out.println("Closes options menu");
//                System.exit(0);
//                break;
//        }


//        // RESTAURANT
//        Restaurant r1 = new Restaurant();
//        r1.handleOpenClose("open");
//        System.out.printf("%b%n", r1.isOpen);
//        r1.orderMeals("Lasagna", "Chilli");
//
//
//
//        // MENU
//        Menu m1 = new Menu();
//        m1.addToMenu("Lasagna", 120);
//        m1.addToMenu("Chilli", 130);
//        m1.addToMenu("Tofu", 150);
//
//        m1.printMenu();
//
//        // STAFF
//        Staff s1 = new Staff();
//        s1.addStaff("Lotta", "Boll", "1", "070111111");
//        s1.addStaff("Kalle", "Bull", "2", "070222222");
//        s1.addStaff("Lisa", "Bill", "3", "070333333");
//
//        s1.printStaffList();
    }

    static int displayMenu(Scanner scanner) {

        System.out.println("--- CHOOSE AN OPTION ---");
        System.out.println("1. Open or close restaurant");
        System.out.println("2. Take order");
        System.out.println("3. Cook food");
        System.out.println("4. Handle staff");
        System.out.println("5. Handle menu");
        System.out.println("0. Avsluta");

        return scanner.nextInt();
    }
}
