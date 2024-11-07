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


    }
}
