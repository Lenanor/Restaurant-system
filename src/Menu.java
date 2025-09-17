import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class Menu {
    private List<MenuItem> menuList = new ArrayList<>();

    public Menu() {}

    public void addToMenu(MenuItem menuItem) {
        menuList.add(menuItem);
    }

    public void removeFromMenu(String dish) {
        for(int i = 0; i < menuList.size(); i++) {
            MenuItem menuItem = menuList.get(i);
            if(Objects.equals(menuItem.getDish(), dish)) {
                menuList.remove(i);
                break;
            } else {
                System.out.println("Menu item was not found");
            }
        }
        System.out.printf("%s was removed from the menu", dish);
    }

    public void getMenu() {
        System.out.println("--- MENU ---");
        for(MenuItem menuItem : menuList) {
            System.out.printf("%s___%s:-%n", menuItem.getDish(), menuItem.getPrice());
        }
    }

    public void placeOrder() {

    }
    public void getOrder() {}
    public void removeOrder() {}


}
