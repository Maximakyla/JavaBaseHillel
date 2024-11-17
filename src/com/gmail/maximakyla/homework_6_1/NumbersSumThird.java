package com.gmail.maximakyla.homework_6_1;

import java.util.Scanner;

public class NumbersSumThird {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input maximum value ");
        int maximumLimit = scanner.nextInt();
        int a = 0;
        int b = 1;
        int c;
        do {
            c = a + b;
            System.out.printf("%d) Num is %d, sum is %d\n ", b, b, c);
            a = c;
            b++;
            if (b > maximumLimit) {
                System.out.println("------------------------ \n Sum of numbers is " + c);
            }
        } while (b <= maximumLimit);
    }
}
