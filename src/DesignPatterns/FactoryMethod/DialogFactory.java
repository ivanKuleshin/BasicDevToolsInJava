package DesignPatterns.FactoryMethod;

import DesignPatterns.FactoryMethod.Creators.Dialog;
import DesignPatterns.FactoryMethod.Creators.HtmlDialog;
import DesignPatterns.FactoryMethod.Creators.MobileDialog;
import DesignPatterns.FactoryMethod.Creators.WindowsDialog;

public class DialogFactory {
    public static Dialog getDialog(OperatingSystemType systemType) {

        return switch (systemType) {
            case WINDOWS -> new WindowsDialog();
            case ANDROID, IOS -> new MobileDialog();
            case LINUX -> new HtmlDialog();
        };
    }
}
