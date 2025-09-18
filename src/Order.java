import java.sql.Array;

public class Order {
    private String id;
    private String order;
    private int totalSum;
    private boolean isCooked;
    private boolean isServed;
    private boolean isPayed;

    public Order(String id, String order, int totalSum) {
        this.id = id;
        this.order = order;
        this.totalSum = totalSum;
        this.isCooked = false;
        this.isServed = false;
        this.isPayed = false;
    }

    public String getId() { return id;}
    public String getOrder() { return order;}
    public int getTotalSum() { return totalSum; }
    public boolean isCooked() { return isCooked; }
    public boolean isServed() { return isServed; }
    public boolean isPayed() { return isPayed; }

    public void setCooked(boolean cooked) { isCooked = cooked; }
    public void setServed(boolean served) { isServed = served; }
    public void setPayed(boolean payed) { isPayed = payed; }

    @Override
    public String toString() {
        return "#" + id + " | Order: " + order + " | Total " + totalSum + ":- | Cooked: " + (isCooked ? " 🟢" : " 🔴") + " | Served: " + (isServed ? " 🟢" : " 🔴") + " | Paid: " + (isPayed ? " 🟢" : " 🔴");
    }
}
