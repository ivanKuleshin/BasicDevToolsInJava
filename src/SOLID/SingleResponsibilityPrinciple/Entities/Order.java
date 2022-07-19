package SOLID.SingleResponsibilityPrinciple.Entities;

public class Order {
    private long orderNumber;
    private double price;
    private String recipientName;
    private final String email;

    public Order(long number, double price, String recipientName, String email) {
        this.orderNumber = number;
        this.price = price;
        this.recipientName = recipientName;
        this.email = email;
    }

    public boolean isValid() {
        return orderNumber > 0 && price > 0 && !recipientName.isEmpty();
    }

    public long getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(long orderNumber) {
        this.orderNumber = orderNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getRecipientName() {
        return recipientName;
    }

    public void setRecipientName(String recipientName) {
        this.recipientName = recipientName;
    }

    public String getEmail() {
        return this.email;
    }
}
