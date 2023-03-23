package DesignPatterns.Strategy;

public class StrategyFactory {

    public static ExtendStrategy getStrategy(String parameter) {
        switch (parameter) {
            case "accounts" -> {
                return new AccountsExtendStrategy();
            }
            case "products" -> {
                return new ProductVariantsExtendStrategy();
            }
            default -> throw new RuntimeException("Invalid extend parameter: " + parameter);
        }
    }
}
