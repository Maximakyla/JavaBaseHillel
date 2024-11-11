package com.gmail.maximakyla.homework_5_1;

import java.util.Scanner;

public class IncomeTax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your total income value for tax calculation in EUR");
        int income = scanner.nextInt();
        String currency = "EUR";

        if (income <= 10000){
            System.out.printf("Income tax %.2f %s" , income * 0.025 , currency);
        } else if (income <= 25000){
            System.out.printf("Income tax %.2f %s", income * 0.043 , currency);
        } else {
            System.out.printf("Income tax %.2f %s", income * 0.067 , currency);
        }
    }
}
