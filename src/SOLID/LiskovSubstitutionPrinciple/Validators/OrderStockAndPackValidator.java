package SOLID.LiskovSubstitutionPrinciple.Validators;

import SOLID.SingleResponsibilityPrinciple.Entities.Order;

public class OrderStockAndPackValidator extends OrderStockValidator implements AbstractValidator {
    @Override
    public boolean validate(Order order) {
        System.out.println("OrderStockAndPackValidator is starting");
        return super.validate(order) && checkItemsIsPacked(order);
    }

    private boolean checkItemsIsPacked(Order order) {
        return order.getItems().stream().allMatch(x -> x.contains("packed"));
    }
}
