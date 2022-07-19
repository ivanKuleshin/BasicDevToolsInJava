package SOLID.SingleResponsibilityPrinciple.OrderProcessors;

import SOLID.SingleResponsibilityPrinciple.EmailSenders.ConfirmationEmailSender;
import SOLID.SingleResponsibilityPrinciple.Repositories.MySQLOrderRepository;
import SOLID.SingleResponsibilityPrinciple.Entities.Order;

public class GoodOrderProcessor {

    private final MySQLOrderRepository mySQLOrderRepository = new MySQLOrderRepository();
    private final ConfirmationEmailSender confirmationEmailSender = new ConfirmationEmailSender();

    public void process(Order order) {
        if (order.isValid() && mySQLOrderRepository.save(order)) {
            confirmationEmailSender.sendConfirmationEmail(order);
        }
        System.out.printf("Order #%s was processed successfully\n", order.getOrderNumber());
    }
}
