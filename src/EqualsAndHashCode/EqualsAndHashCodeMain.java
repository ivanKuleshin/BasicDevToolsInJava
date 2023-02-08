package EqualsAndHashCode;

import java.util.HashMap;
import java.util.Map;

public class EqualsAndHashCodeMain {
    public static void main(String[] args) {
        Car car1 = new Car("Porsche", "JZ2000", 200000);
        Car car2 = new Car("Porsche", "JZ2000", 200000);
        System.out.println("Equals and hashCode are implemented: " + car1.equals(car2));

        Plane plane1 = new Plane("Boeing737", 900.0, 100);
        Plane plane2 = new Plane("Boeing737", 900.0, 100);
        System.out.println("Equals and hashCode are NOT implemented: " + plane1.equals(plane2));

        mapCollisionExample();
    }

    private static void mapCollisionExample() {
        Boat boat1 = new Boat(1, "MyBoat1", 230000.0);
        Boat boat2 = new Boat(2, "MyBoat2", 340000.0);
        Boat boat3 = new Boat(2, "MyBoat3", 120000.1);

//        Map<Boat, String> boatMap = Map.of(boat1, "FirstBoat", boat2, "SecondBoat", boat3, "ThirdBoat");
        Map<Boat, String> boatMap = new HashMap<>();
        boatMap.put(boat1, "FirstBoat");
        boatMap.put(boat2, "SecondBoat");
        boatMap.put(boat3, "ThirdBoat");
        System.out.println("SecondBoat vs ThirdBoat: " + boat2.equals(boat3));

        String v1 = boatMap.get(boat1);
        String v2 = boatMap.get(boat2);
        String v3 = boatMap.get(boat3);

        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);

        System.out.println(boatMap);
        System.out.println(boatMap.entrySet());
    }
}
