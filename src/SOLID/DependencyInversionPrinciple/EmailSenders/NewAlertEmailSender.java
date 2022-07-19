package SOLID.DependencyInversionPrinciple.EmailSenders;

import SOLID.SingleResponsibilityPrinciple.Entities.Order;

public class NewAlertEmailSender implements MailSender{
    @Override
    public void sendEmail(Order order) {
        String name = order.getRecipientName();
        String email = order.getEmail();
        System.out.printf("[NewAlertEmailSender] Alert letter was sent to %s via email: %s%n", name, email);
    }
}
