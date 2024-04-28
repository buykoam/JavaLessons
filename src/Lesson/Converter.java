package Lesson;

import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double s = console.nextDouble();

        double h = (s/1000) * 3600;
        System.out.println(Math.round(h));
    }
}
