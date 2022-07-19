package SOLID.OpenClosedPrinciple.CustomOrderProcessors;

import SOLID.SingleResponsibilityPrinciple.Entities.Order;
import SOLID.SingleResponsibilityPrinciple.OrderProcessors.GoodOrderProcessor;

public class OrderProcessorWithPreAndPostProcessing extends GoodOrderProcessor {

    @Override
    public void process(Order order) {
        beforeProcess();
        super.process(order);
        afterProcess();
    }

    private void beforeProcess() {
        System.out.println("Action before the process of the order");
    }

    private void afterProcess() {
        System.out.println("Action after the process of the order");
    }
}
