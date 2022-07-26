package DesignPatterns.FactoryMethod.Products;

public class MobileButton implements Button{
    @Override
    public void render() {
        System.out.println("The MobileButton was rendered!");
    }

    @Override
    public void onClick() {
        System.out.println("The MobileButton was clicked!");
    }
}
