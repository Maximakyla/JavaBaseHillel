package com.gmail.maximakyla.homework_4_1;

public class PriceCalculation {
    public static void main(String[] args) {

//      Product No.1
        String product = "smartphone";
        String currency = "EUR";
        byte productNum = 1;
        double price = 999.99;
        int totalPcs = 66;
        int salePeriod = 5;
        double totalSale = totalPcs * price;
        double averageSale = totalSale / salePeriod;

        System.out.println("Product No." + productNum + ": " + product);
        System.out.println("Total sales for " + salePeriod + " days is " + currency + " " + totalSale);
        System.out.printf("Sales by day is " + currency + " %.2f", averageSale);

//      Product No.2
        product = "laptop";
        currency = "USD";
        productNum = 2;
        price = 1458.32;
        totalPcs = 12;
        salePeriod = 7;
        totalSale = totalPcs * price;
        averageSale = totalSale / salePeriod;

        System.out.println("\n\nProduct No." + productNum + ": " + product);
        System.out.println("Total sales for " + salePeriod + " days is " + currency + " " + totalSale);
        System.out.printf("Sales by day is " + currency + " %.2f", averageSale);
    }
}
