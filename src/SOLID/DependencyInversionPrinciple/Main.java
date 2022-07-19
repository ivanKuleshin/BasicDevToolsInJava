package SOLID.DependencyInversionPrinciple;

import SOLID.DependencyInversionPrinciple.EmailSenders.NewAlertEmailSender;
import SOLID.DependencyInversionPrinciple.EmailSenders.NewConfirmationEmailSender;
import SOLID.DependencyInversionPrinciple.OrderProcessors.NewGoodOrderProcessor;
import SOLID.DependencyInversionPrinciple.OrderProcessors.NewGoodOrderProcessorWithPreconditions;
import SOLID.DependencyInversionPrinciple.OrderProcessors.OrderProcessor;
import SOLID.DependencyInversionPrinciple.Repositories.NewMongodbOrderRepository;
import SOLID.DependencyInversionPrinciple.Repositories.NewMySQLOrderRepository;
import SOLID.SingleResponsibilityPrinciple.Entities.Order;

public class Main {
    public static void main(String[] args) {
        Order order1 = new Order(1, 1488, "Ivan Kuleshin", "my_mail1@gmail.com");
        OrderProcessor goodOrderProcessor1 = new NewGoodOrderProcessor(new NewMySQLOrderRepository(), new NewConfirmationEmailSender());
        goodOrderProcessor1.process(order1);

        System.out.println("---------------------------------------------------------------------------");

        Order order2 = new Order(2, 1337, "Ivan Kuleshin", "my_mail2@gmail.com");
        OrderProcessor goodOrderProcessor2 = new NewGoodOrderProcessor(new NewMongodbOrderRepository(), new NewAlertEmailSender());
        goodOrderProcessor2.process(order2);

        System.out.println("---------------------------------------------------------------------------");

        Order order3 = new Order(3, 1333, "Ivan Kuleshin", "my_mail3@gmail.com");
        OrderProcessor orderProcessor3 = new NewGoodOrderProcessorWithPreconditions(new NewMySQLOrderRepository(), new NewAlertEmailSender());
        orderProcessor3.process(order3);
    }
}
