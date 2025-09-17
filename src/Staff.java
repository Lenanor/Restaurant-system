import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

class Staff {
    private List<Employee> staffList;
    private InputHandler inputHandler;
    private Scanner scanner = new Scanner(System.in);

    public Staff() {
        this.staffList = new ArrayList<>();
        this.inputHandler = new InputHandler();
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

            if(employee.getId().equals(id)) {
                staffList.remove(i);
                break;
            }
        }
    }

    public void run() {
        System.out.println("--- STAFF MENU ---");
        System.out.println("1. Display staff list");
        System.out.println("2. Add employee");
        System.out.println("3. Remove employee");

        int staffChoice = inputHandler.getIntInput(1, 3);

        if(staffChoice == 1) {
            getStaffList();
        } else if (staffChoice == 2) {
            getStaffList();
            System.out.println("Add id:");
            String id = inputHandler.getStringInput();
            System.out.println("Add name:");
            String name = inputHandler.getStringInput();
            System.out.println("Add last name");
            String lastName = inputHandler.getStringInput();
            System.out.println("Add phone number:");
            String phone = inputHandler.getStringInput();

            addStaff(new Employee(id, name, lastName, phone));
            getStaffList();
        }
    }
}
