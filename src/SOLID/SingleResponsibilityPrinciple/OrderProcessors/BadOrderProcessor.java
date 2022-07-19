package SOLID.SingleResponsibilityPrinciple.OrderProcessors;

import SOLID.SingleResponsibilityPrinciple.Entities.Order;

public class BadOrderProcessor {

    public void process(Order order) {
        if (order.isValid() && save(order)) {
            sendConfirmationEmail(order);
        }
        System.out.printf("Order #%s was processed successfully\n", order.getOrderNumber());
    }

    private boolean save(Order order) {
        if (order.isValid()) {
            System.out.printf("Order #%s was successfully saved in DB\n", order.getOrderNumber());
            return true;
        } else {
            return false;
        }
    }

    private void sendConfirmationEmail(Order order) {
        String name = order.getRecipientName();
        String email = order.getEmail();
        System.out.printf("Confirmation letter was sent to %s via email: %s%n", name, email);
    }
}