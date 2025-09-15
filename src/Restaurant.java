import java.util.ArrayList;

public class Restaurant {
    boolean isOpen = false;
    ArrayList<String> orders = new ArrayList();

    public void handleOpenClose(String s) {
        if(s.equals("open")) {
            isOpen = true;
        } else if(s.equals("close")) {
            isOpen = false;
        } else {
            System.out.println("Wrong input!");
        }
    }

    // place order
    public void orderMeals(String... list) {
        ArrayList<String> orders = new ArrayList();

        for(int i = 0; i < list.length; i++) {
            orders.add(list[i]);
        }

        System.out.println("Your order is:");

        for(int i = 0; i < orders.size(); i++) {
            System.out.println(orders.get(i));
        }
    }
}
