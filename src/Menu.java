import java.util.ArrayList;

public class Menu {
    ArrayList<String> menu = new ArrayList<>();
    ArrayList<Integer> prices = new ArrayList<>();

    public void addToMenu(String course, int price) {
        menu.add(course);
        prices.add(price); // int > Integer konverterar automatiskt (= autoboxing)
    }

    public void printMenu() {
        System.out.println("---MENY---");

        for(int i = 0; i < menu.size(); i++) {
            System.out.printf("%s  %d:-%n", menu.get(i), prices.get(i));
        }
    }
}
