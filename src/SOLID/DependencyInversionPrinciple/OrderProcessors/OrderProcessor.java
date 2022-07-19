package SOLID.DependencyInversionPrinciple.OrderProcessors;

import SOLID.SingleResponsibilityPrinciple.Entities.Order;

public interface OrderProcessor {
    void process(Order order);
}
