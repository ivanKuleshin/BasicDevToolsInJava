package SOLID.LiskovSubstitutionPrinciple.Validators;

import SOLID.SingleResponsibilityPrinciple.Entities.Order;

public interface AbstractValidator {
    boolean validate(Order order);
}
