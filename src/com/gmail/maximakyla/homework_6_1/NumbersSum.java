package com.gmail.maximakyla.homework_6_1;

import java.util.Scanner;

public class NumbersSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input maximum value ");
        int maximumLimit = scanner.nextInt();
        for (int a = 0, b = 1; b <= maximumLimit; b++) {
            int c = a + b;
            a = c;
            System.out.printf("%d) Num is %d, sum is %d\n ", b, b, c);
            if (b == maximumLimit) {
                System.out.println("------------------------ \n Sum of numbers is " + c);
            }
        }
    }
}
