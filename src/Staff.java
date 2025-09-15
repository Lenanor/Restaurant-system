import java.util.ArrayList;

public class Staff {
    ArrayList<String> fname = new ArrayList<>();
    ArrayList<String> lname = new ArrayList<>();
    ArrayList<String> id = new ArrayList<>();
    ArrayList<String> phone = new ArrayList<>();

    public void addStaff(String firstName, String lastName, String staffId, String staffPhone) {
        fname.add(firstName);
        lname.add(lastName);
        id.add(staffId);
        phone.add(staffPhone);
    }

    public void printStaffList() {
        System.out.println("---STAFF LIST---");

        if(fname.isEmpty()) {
            System.out.println("No staff is added");
            return;
        }

        for(int i = 0; i < fname.size(); i++) {
            System.out.printf("ID: %s,%nFirst name: %s,%nLast name: %s,%nPhone:%s%n", id.get(i), fname.get(i), lname.get(i), phone.get(i));
        }
    }
}
