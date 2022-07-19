package SOLID.DependencyInversionPrinciple.Repositories;

import SOLID.SingleResponsibilityPrinciple.Entities.Order;

public class NewMongodbOrderRepository implements OrderRepository{
    @Override
    public boolean save(Order order) {
        if (order.isValid()) {
            System.out.printf("[NewMongodbOrderRepository] Order #%s was successfully saved in DB\n", order.getOrderNumber());
            return true;
        } else {
            return false;
        }
    }
}
