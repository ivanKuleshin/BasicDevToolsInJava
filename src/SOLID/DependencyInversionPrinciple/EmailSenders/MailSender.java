package SOLID.DependencyInversionPrinciple.EmailSenders;

import SOLID.SingleResponsibilityPrinciple.Entities.Order;

public interface MailSender {
    void sendEmail(Order order);
}
