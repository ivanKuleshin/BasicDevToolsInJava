package EqualsAndHashCode;

import java.util.Objects;

public class Car {
    private String name;
    private String engine;
    private int price;

    public Car(String name, String engine, int price) {
        this.name = name;
        this.engine = engine;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getEngine() {
        return engine;
    }

    public int getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return price == car.price && Objects.equals(name, car.name) && Objects.equals(engine, car.engine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, engine, price);
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", engine='" + engine + '\'' +
                ", price=" + price +
                '}';
    }
}
