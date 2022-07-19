package SOLID.OpenClosedPrinciple;

import SOLID.OpenClosedPrinciple.OrderProcessors.OrderProcessorWithPreAndPostProcessing;
import SOLID.SingleResponsibilityPrinciple.Entities.Order;

public class Main {
    public static void main(String[] args) {
        Order myOrder = new Order(12, 14884.99, "Ivan Kuleshin", "my_mail1@gmail.com");
        OrderProcessorWithPreAndPostProcessing oderProcessor = new OrderProcessorWithPreAndPostProcessing();
        oderProcessor.process(myOrder);
    }
}
