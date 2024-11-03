package com.gmail.maximakyla.homework_2_1;

public class OrderFormating {
    public static void main(String[] args) {
//      Order No.1
        int orderNumber = 1;
        String clientName = "Alice";
        String currencyInUse = "EUR ";
        String productName = "Iphone 15 Pro";
        double productPrice = 999.99;
        String deliveryStreetAddress = "Shevchenko";
        int deliveryHouseNumber = 10;
        String deliveryCityName = "Kharkiv";
        String deliveryCountryName = "Ukraine";

        System.out.println("Order No." + orderNumber + " Client: " + clientName + ".");
        System.out.println("Product: " + productName + ".");
        System.out.println("Price: " + currencyInUse + productPrice + ".");
        System.out.println("Delivery Address: " + deliveryStreetAddress + " str, " + deliveryHouseNumber + ", " + deliveryCityName + ", " + deliveryCountryName + ".");

//      Order No.2
        orderNumber = 2;
        clientName = "Tom";
        currencyInUse = "USD ";
        productName = "S.T.A.L.K.E.R. 2: Heart of Chornobyl";
        productPrice = 109.99;
        deliveryStreetAddress = "Didrihsona";
        deliveryHouseNumber = 129;
        deliveryCityName = "Odesa";
        deliveryCountryName = "Ukraine";

        System.out.println("\nOrder No." + orderNumber + " Client: " + clientName + ".");
        System.out.println("Product: " + productName + ".");
        System.out.println("Price: " + currencyInUse + productPrice + ".");
        System.out.println("Delivery Address: " + deliveryStreetAddress + " str, " + deliveryHouseNumber + ", " + deliveryCityName + ", " + deliveryCountryName + ".");

    }
}
