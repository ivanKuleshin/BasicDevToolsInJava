package DesignPatterns.Strategy;

public class ProductVariantsExtendStrategy implements ExtendStrategy{
    @Override
    public String getResponse() {
        return "Response with ProductVariants";
    }
}
