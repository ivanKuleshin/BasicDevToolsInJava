package SOLID.SingleResponsibilityPrinciple.Repositories;

import SOLID.SingleResponsibilityPrinciple.Entities.Order;

public class MySQLOrderRepository {
    public boolean save(Order order) {
        if (order.isValid()) {
            System.out.printf("Order #%s was successfully saved in DB\n", order.getOrderNumber());
            return true;
        } else {
            return false;
        }
    }
}
