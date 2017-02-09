package com.company;

import java.time.ZonedDateTime;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        // Problems 6&7. Variables and Print on console

        String name = "Pesho";
        int age = 28;
        double height = 1.84;

        System.out.printf("My name is %s.\n", name);

     // Problem 8. Sum two variables and print on console

        int x = 2365;
        int y = 45632189;

        int result = x + y;

        System.out.printf("The result is %d.\n", result);

     // Problem 9. *More complex tasks
        // 9.1 Print the current date
        ZonedDateTime zdt = ZonedDateTime.now();
        System.out.println(zdt);

        // 9.2 Date after 20 hour
        System.out.println(zdt.plusHours(20));

        // 9.3 Product of two double variables
        double n = 1.2356997889;
        double m = 23659.23;
        double product = n * m;
        System.out.println(product);

        // 9.4 Read numeric user input. Sum it with 10 and print
        int a = Integer.parseInt(console.nextLine());
        int b = 10;
        int sum1 = a + b;
        System.out.println(sum1);

        // 9.5 Read two numbers. Print their product
        int c = Integer.parseInt(console.nextLine());
        int d = Integer.parseInt(console.nextLine());
        int product1 = c * d;
        System.out.println(product1);

        // 9.6 Print numbers from 1 to 1000
        for (int i = 1; i <= 1000 ; i++) {
            System.out.println(i);
        }
    }
}
