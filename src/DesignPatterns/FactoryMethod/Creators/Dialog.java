package DesignPatterns.FactoryMethod.Creators;

import DesignPatterns.FactoryMethod.Products.Button;

/**
 * Базовый класс фабрики. Заметьте, что "фабрика" – это всего лишь
 * дополнительная роль для класса. Он уже имеет какую-то бизнес-логику, в
 * которой требуется создание разнообразных продуктов.
 */
public abstract class Dialog {

    public void renderWindow() {
//        do something...
        Button button = createButton();
        button.render();
        button.onClick();
    }

    /**
     * Фабричный метод
     */
    abstract Button createButton();
}
