package EqualsAndHashCode;

import java.util.Objects;

public class Boat {
    private int id;
    private String name;
    private double price;

    public Boat(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        return id == ((Boat) o).getId();
    }

    @Override
    public String toString() {
        return "Boat{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
