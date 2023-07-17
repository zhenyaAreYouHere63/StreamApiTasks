package task3;

public class Goods {
    private final String name;
    private final int cost;
    private final int quantity;

    public Goods(String name, int cost, int quantity) {
        this.name = name;
        this.cost = cost;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public int getQuantity() {
        return quantity;
    }
}