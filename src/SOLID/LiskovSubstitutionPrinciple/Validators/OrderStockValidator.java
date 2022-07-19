package SOLID.LiskovSubstitutionPrinciple.Validators;

import SOLID.SingleResponsibilityPrinciple.Entities.Order;

public class OrderStockValidator implements AbstractValidator{
    public boolean validate(Order order) {
        System.out.println("OrderStockValidator is starting");
        return order.isValid() && checkItemsInStock(order);
    }

    private boolean checkItemsInStock(Order order) {
        return !order.getItems().isEmpty();
    }
}
