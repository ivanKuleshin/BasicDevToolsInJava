package SOLID.DependencyInversionPrinciple.Repositories;

import SOLID.SingleResponsibilityPrinciple.Entities.Order;

public class NewMySQLOrderRepository implements OrderRepository {
    public boolean save(Order order) {
        if (order.isValid()) {
            System.out.printf("[NewMySQLOrderRepository] Order #%s was successfully saved in DB\n", order.getOrderNumber());
            return true;
        } else {
            return false;
        }
    }
}
