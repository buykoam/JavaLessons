package Lesson;

import java.util.Scanner;

public class SecondMinValue {

    // считывать с клавиатуры только числа до тех пор пока будет != число
    // пользователем введено минимум 2 числа, если меньше, то выдавать сообщение об ошибке
    // Вывесвти на экран второе по величине целое число после минимального из введенных

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        while (console.hasNextInt()) {
            int x = console.nextInt();
            if (x < min) {
                min = min2;
                min = x;
            } else if (x < min2 && x != min) {
                min2 = x;
            }
        }
        System.out.println(min2);
    }
}
