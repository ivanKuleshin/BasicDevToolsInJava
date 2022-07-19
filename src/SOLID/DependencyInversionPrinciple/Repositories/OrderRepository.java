package SOLID.DependencyInversionPrinciple.Repositories;

import SOLID.SingleResponsibilityPrinciple.Entities.Order;

public interface OrderRepository {
    boolean save(Order order);
}
