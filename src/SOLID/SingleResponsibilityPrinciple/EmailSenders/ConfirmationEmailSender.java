package SOLID.SingleResponsibilityPrinciple.EmailSenders;

import SOLID.SingleResponsibilityPrinciple.Entities.Order;

public class ConfirmationEmailSender {
    public void sendConfirmationEmail(Order order) {
        String name = order.getRecipientName();
        String email = order.getEmail();
        System.out.printf("Confirmation letter was sent to %s via email: %s%n", name, email);
    }
}
