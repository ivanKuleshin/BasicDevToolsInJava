package SOLID.DependencyInversionPrinciple.OrderProcessors;

import SOLID.DependencyInversionPrinciple.EmailSenders.MailSender;
import SOLID.DependencyInversionPrinciple.Repositories.OrderRepository;
import SOLID.SingleResponsibilityPrinciple.Entities.Order;

public class NewGoodOrderProcessor implements OrderProcessor{

    private final OrderRepository mySQLOrderRepository;
    private final MailSender confirmationEmailSender;

    public NewGoodOrderProcessor(OrderRepository mySQLOrderRepository, MailSender confirmationEmailSender) {
        this.mySQLOrderRepository = mySQLOrderRepository;
        this.confirmationEmailSender = confirmationEmailSender;
    }

    @Override
    public void process(Order order) {
        if (order.isValid() && mySQLOrderRepository.save(order)) {
            confirmationEmailSender.sendEmail(order);
        }
        System.out.printf("[NewGoodOrderProcessor] Order #%s was processed successfully\n", order.getOrderNumber());
    }
}
