package DesignPatterns.FactoryMethod.Products;

public class WindowsButton implements Button{
    @Override
    public void render() {
        System.out.println("The WindowsButton was rendered!");
    }

    @Override
    public void onClick() {
        System.out.println("The WindowsButton was clicked!");
    }
}
