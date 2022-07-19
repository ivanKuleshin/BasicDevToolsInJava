package SOLID.LiskovSubstitutionPrinciple;

import SOLID.LiskovSubstitutionPrinciple.Validators.AbstractValidator;
import SOLID.LiskovSubstitutionPrinciple.Validators.OrderStockAndPackValidator;
import SOLID.LiskovSubstitutionPrinciple.Validators.OrderStockValidator;
import SOLID.OpenClosedPrinciple.CustomOrderProcessors.OrderProcessorWithPreAndPostProcessing;
import SOLID.SingleResponsibilityPrinciple.Entities.Order;
import SOLID.SingleResponsibilityPrinciple.OrderProcessors.BadOrderProcessor;
import SOLID.SingleResponsibilityPrinciple.OrderProcessors.GoodOrderProcessor;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final AbstractValidator orderStockValidator = new OrderStockValidator();
    private static final AbstractValidator orderStockAndPackValidator = new OrderStockAndPackValidator();
    private static final GoodOrderProcessor orderProcessor = new GoodOrderProcessor();
    private static final OrderProcessorWithPreAndPostProcessing orderProcessorWithPreAndPostProcessing = new OrderProcessorWithPreAndPostProcessing();

    public static void main(String[] args) {
        Order myNewOrder1 = new Order(1, 148218.9821, "Ivan Ivanov", "not_my_mail@gmail.com");
        myNewOrder1.setItems(List.of("Book-packed", "Laptop-packed"));

        Order myNewOrder2 = new Order(2, 148.9821, "Ivan Belov", "not_my_mail@gmail.com");
        myNewOrder2.setItems(List.of("Book-packed", "Laptop"));

        List<Order> orderList = new ArrayList<>();
        orderList.add(myNewOrder1);
        orderList.add(myNewOrder2);

        orderList.forEach(order -> {
//            orderStockValidator.validate(order);
            orderStockAndPackValidator.validate(order);

            orderProcessor.process(order);
            orderProcessorWithPreAndPostProcessing.process(order);
            System.out.println("---------------------------------------------------------------------------");
        });
    }
}
