package com.gmail.maximakyla.homework_5_1;

import java.util.Scanner;

public class IncomeTax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your total income value for tax calculation");
        int income = scanner.nextInt();

        if (income <= 10000) {
            System.out.println("Income tax = " + (income * 0.025));
        } else if (income <= 25000){
            System.out.println("Income tax = " + (income * 0.043));
        } else {
            System.out.println("Income tax = " + (income * 0.067));
        }
    }
}
