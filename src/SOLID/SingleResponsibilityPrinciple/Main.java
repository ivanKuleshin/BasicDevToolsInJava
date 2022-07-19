package SOLID.SingleResponsibilityPrinciple;

import SOLID.SingleResponsibilityPrinciple.Entities.Order;
import SOLID.SingleResponsibilityPrinciple.OrderProcessors.BadOrderProcessor;
import SOLID.SingleResponsibilityPrinciple.OrderProcessors.GoodOrderProcessor;

public class Main {
    public static void main(String[] args) {
        Order order1 = new Order(1, 1488, "Ivan Kuleshin", "my_mail1@gmail.com");
        BadOrderProcessor badOrderProcessor = new BadOrderProcessor();
        badOrderProcessor.process(order1);

        System.out.println("---------------------------------------------------------------------------");

        Order order2 = new Order(2, 1337, "Ivan Kuleshin", "my_mail2@gmail.com");
        GoodOrderProcessor goodOrderProcessor = new GoodOrderProcessor();
        goodOrderProcessor.process(order2);
    }
}
