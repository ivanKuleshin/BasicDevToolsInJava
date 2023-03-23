package DesignPatterns.Strategy;

public class Main {
    public static void main(String[] args) {
        ExtendStrategy extendStrategy = StrategyFactory.getStrategy("products");
        System.out.println(extendStrategy.getResponse());
    }
}
