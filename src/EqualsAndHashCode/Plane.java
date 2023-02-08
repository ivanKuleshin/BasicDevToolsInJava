package EqualsAndHashCode;

public class Plane {
    private String name;
    private double flyingDistance;
    private int ticketCost;

    public Plane(String name, double flyingDistance, int ticketCost) {
        this.name = name;
        this.flyingDistance = flyingDistance;
        this.ticketCost = ticketCost;
    }

    public String getName() {
        return name;
    }

    public double getFlyingDistance() {
        return flyingDistance;
    }

    public int getTicketCost() {
        return ticketCost;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFlyingDistance(double flyingDistance) {
        this.flyingDistance = flyingDistance;
    }

    public void setTicketCost(int ticketCost) {
        this.ticketCost = ticketCost;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "name='" + name + '\'' +
                ", flyingDistance=" + flyingDistance +
                ", ticketCost=" + ticketCost +
                '}';
    }
}
