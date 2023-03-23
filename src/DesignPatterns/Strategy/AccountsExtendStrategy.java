package DesignPatterns.Strategy;

public class AccountsExtendStrategy implements ExtendStrategy {
    @Override
    public String getResponse() {
        return "Response with Accounts";
    }
}
