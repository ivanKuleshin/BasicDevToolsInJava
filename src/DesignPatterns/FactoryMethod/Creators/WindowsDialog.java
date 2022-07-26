package DesignPatterns.FactoryMethod.Creators;

import DesignPatterns.FactoryMethod.Products.Button;
import DesignPatterns.FactoryMethod.Products.WindowsButton;

public class WindowsDialog extends Dialog {
    @Override
    Button createButton() {
        return new WindowsButton();
    }
}
