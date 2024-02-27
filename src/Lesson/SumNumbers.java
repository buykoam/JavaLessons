package Lesson;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");

        int inputValue = sc.nextInt();
        System.out.println("Вы ввели число " + inputValue);

        int sum = 0;

        while (inputValue != 0) {
            int ostatok = inputValue % 10;
            sum += ostatok;
            inputValue /= 10;
        }
        System.out.println("Сумма чисел: " + sum);
    }
}

