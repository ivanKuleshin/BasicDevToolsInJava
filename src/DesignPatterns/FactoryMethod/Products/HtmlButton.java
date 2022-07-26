package DesignPatterns.FactoryMethod.Products;

public class HtmlButton implements Button{
    @Override
    public void render() {
        System.out.println("The HtmlButton was rendered!");
    }

    @Override
    public void onClick() {
        System.out.println("The HtmlButton was clicked!");
    }
}
