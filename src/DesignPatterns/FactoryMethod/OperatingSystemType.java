package DesignPatterns.FactoryMethod;

import java.util.Random;

public enum OperatingSystemType {
    WINDOWS,
    LINUX,
    ANDROID,
    IOS;

    public static OperatingSystemType getRandomType() {
        return OperatingSystemType.values()[new Random().nextInt(OperatingSystemType.values().length)];
    }
}


