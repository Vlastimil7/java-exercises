package com.amigoscode._3_oop._4_polymorphism;

public interface IPayment {

    boolean processPayment(double amount);

    String getPaymentMethod();

    default void printReceipt(double amount) {
        System.out.println("Receipt: " + amount + " paid via " + getPaymentMethod());
    }
}
