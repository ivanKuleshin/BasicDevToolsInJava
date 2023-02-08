package DesignPatterns.FactoryMethod.Creators;

import DesignPatterns.FactoryMethod.Products.Button;
import DesignPatterns.FactoryMethod.Products.WindowsButton;

public class WindowsDialog extends Dialog {
    @Override
    Button createButton() {
        return new WindowsButton();
    }

    @Override
    public void renderWindow() {
        Button button = createButton();
        button.render();
        System.out.println("Different logic of window rendering...");
        button.onClick();
    }
}
