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
            System.out.printf("ID: %s, Name: %s, Last name: %s, Phone number: %s%n",
                    employee.getId(), employee.getName(), employee.getLastName(), employee.getPhone());
        }
    }

    public void addStaff(Employee employee) {
        staffList.add(employee);
    }

    public void removeStaff(String id) {
        for(int i = 0; i < staffList.size(); i++) {
            Employee employee = staffList.get(i);

            if(employee.getId().equals(id)) {
                System.out.printf("id: %s, %s %s is removed from staff list%n",
                        employee.getId(), employee.getName(), employee.getLastName());
                staffList.remove(i);
                break;
            }
        }
    }

    public void run() {
        while(true) {
            System.out.println("--- MANAGE STAFF ---");
            System.out.println("1. Display staff list");
            System.out.println("2. Add employee");
            System.out.println("3. Remove employee");
            System.out.println("4. Back to main menu");

            int staffChoice = inputHandler.getIntInput(1, 4);

            if(staffChoice == 1) {
                getStaffList();
                System.out.println();
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
                System.out.println();
            } else if(staffChoice == 3) {
                System.out.println("Add id of employee to remove:");
                String s = inputHandler.getStringInput();
                removeStaff(s);
                System.out.println();
            } else if (staffChoice == 4) {
                return;
            }
        }
    }
}
