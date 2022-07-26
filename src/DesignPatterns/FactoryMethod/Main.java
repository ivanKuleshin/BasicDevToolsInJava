package DesignPatterns.FactoryMethod;

import DesignPatterns.FactoryMethod.Creators.Dialog;

import static DesignPatterns.FactoryMethod.OperatingSystemType.getRandomType;

public class Main {
    private static Dialog dialog;

    public static void main(String[] args) {
        /*
          Приложение создаёт определённую фабрику в зависимости от конфигурации или
          окружения.
         */
        dialog = DialogFactory.getDialog(getRandomType());

        runBusinessLogic();
    }

    /**
     * Весь остальной клиентский код работает с фабрикой и продуктами только
     * через общий интерфейс, поэтому для него неважно какая фабрика была
     * создана.
     */
    private static void runBusinessLogic() {
        dialog.renderWindow();
    }
}
