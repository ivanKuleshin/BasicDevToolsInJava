package DesignPatterns.FactoryMethod.Creators;

import DesignPatterns.FactoryMethod.Products.Button;
import DesignPatterns.FactoryMethod.Products.HtmlButton;

public class HtmlDialog extends Dialog {
    @Override
    Button createButton() {
        return new HtmlButton();
    }
}
