package SOLID.DependencyInversionPrinciple.EmailSenders;

import SOLID.DependencyInversionPrinciple.EmailSenders.MailSender;
import SOLID.SingleResponsibilityPrinciple.Entities.Order;

public class NewConfirmationEmailSender implements MailSender {
    public void sendEmail(Order order) {
        String name = order.getRecipientName();
        String email = order.getEmail();
        System.out.printf("[NewConfirmationEmailSender] Confirmation letter was sent to %s via email: %s%n", name, email);
    }
}
