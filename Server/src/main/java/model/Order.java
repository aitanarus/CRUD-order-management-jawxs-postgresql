package model;

public class Order {
    public int id;
    public String description;
    public float amount;
    public boolean delivered;

    public Order(int id, String description, float amount, boolean delivered) {
        this.id = id;
        this.description = description;
        this.amount = amount;
        this.delivered = delivered;
    }

    public Order(String description, float amount, boolean delivered) {
        this.description = description;
        this.amount = amount;
        this.delivered = delivered;
    }
}
