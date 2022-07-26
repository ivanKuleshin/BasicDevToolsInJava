package DesignPatterns.FactoryMethod.Creators;

import DesignPatterns.FactoryMethod.Products.Button;
import DesignPatterns.FactoryMethod.Products.MobileButton;

public class MobileDialog extends Dialog{
    @Override
    Button createButton() {
        return new MobileButton();
    }
}
