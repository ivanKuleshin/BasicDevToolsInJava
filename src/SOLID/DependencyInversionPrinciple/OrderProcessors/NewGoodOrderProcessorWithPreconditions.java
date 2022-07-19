package SOLID.DependencyInversionPrinciple.OrderProcessors;

import SOLID.DependencyInversionPrinciple.EmailSenders.MailSender;
import SOLID.DependencyInversionPrinciple.Repositories.OrderRepository;
import SOLID.SingleResponsibilityPrinciple.Entities.Order;

public class NewGoodOrderProcessorWithPreconditions implements OrderProcessor {

    private final OrderRepository mySQLOrderRepository;
    private final MailSender confirmationEmailSender;

    public NewGoodOrderProcessorWithPreconditions(OrderRepository mySQLOrderRepository, MailSender confirmationEmailSender) {
        this.mySQLOrderRepository = mySQLOrderRepository;
        this.confirmationEmailSender = confirmationEmailSender;
    }

    @Override
    public void process(Order order) {
        performPreconditions();

        if (order.isValid() && mySQLOrderRepository.save(order)) {
            confirmationEmailSender.sendEmail(order);
        }
        System.out.printf("[NewGoodOrderProcessorWithPreconditions] Order #%s was processed successfully\n", order.getOrderNumber());
    }

    private void performPreconditions() {
        System.out.println("Performing preconditions");
    }
}
