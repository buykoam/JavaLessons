package Lesson;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        int fib1 = 1;
        int fib2 = 1;
        int fib_sum;
        System.out.print(fib1 + " " + fib2 + " ");

        for (int i = 3; i <= 11; i++) {

            fib_sum = fib1 + fib2;
            System.out.print(fib_sum + " ");
            fib1 = fib2;
            fib2 = fib_sum;
        }
    }
}
