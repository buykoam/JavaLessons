package Lesson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Weather {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Введите количество дней:");

        int number = n.nextInt();
        ArrayList<String> list = new ArrayList<>();
        list.addAll(list);
        int ocadki = 0;
        for (int i = 1; i <= number; i++) {
            Scanner a = new Scanner(System.in);
            System.out.println("Введите количество осадков за день:");
            ocadki = a.nextInt();
            list.add(String.valueOf(ocadki));

        }
        int total = IntStream.of(list).sum();
        System.out.println("Количество дней" + number);
        System.out.println("Количество осдаков" + total);
    }
}
