import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

class Staff {
    private List<Employee> staffList;
    private PrintMenu printMenu;
    private Scanner scanner = new Scanner(System.in);

    public Staff() {
        this.staffList = new ArrayList<>();
        this.printMenu = new PrintMenu();
    }

    public void getStaffList() {
        System.out.println("--- STAFF LIST ---");
        for(Employee employee : staffList) {
            System.out.printf("ID: %s, Name: %s, Last name: %s, Phone number: %s%n",employee.getId(), employee.getName(), employee.getLastName(), employee.getPhone());
        }
    }

    public void addStaff(Employee employee) {
        staffList.add(employee);
    }

    public void removeStaff(String id) {
        for(int i = 0; i < staffList.size(); i++) {
            Employee employee = staffList.get(i);
            if(Objects.equals(employee.getId(), id)) {
                staffList.remove(i);
                break;
            }
        }
    }

    public void run() {
        printMenu.printStaffMenu();

        int staffChoice = scanner.nextInt();
        scanner.nextLine();

        if(staffChoice == 1) {
            getStaffList();
        } else if (staffChoice == 2) {
            getStaffList();
            System.out.println("Add id:");
            String id = scanner.nextLine();
            System.out.println("Add name:");
            String name = scanner.nextLine();
            System.out.println("Add last name");
            String lastName = scanner.nextLine();
            System.out.println("Add phone number:");
            String phone = scanner.nextLine();

            addStaff(new Employee(id, name, lastName, phone));
            getStaffList();
        }
    }
}
