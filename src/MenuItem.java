public class MenuItem {
    private String dish;
    private int price;

    public MenuItem(String dish, int price) {
        this.dish = dish;
        this.price = price;
    }

    public String getDish() {
        return dish;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return dish + "___" + price + ":-";
    }
}
