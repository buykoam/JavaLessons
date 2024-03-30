package Lesson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Weather {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Введите количество дней:");

        int number = n.nextInt();
        for(int i = 1; i <= number;  i++) {
            Scanner a = new Scanner(System.in);
            System.out.println("Введите количество осадков за день:");
            int ocadki = a.nextInt();

        }


        System.out.println("Спасибо! Вы ввели число " + number);


    }
}
