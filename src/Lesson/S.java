package Lesson;

import java.util.Scanner;

public class S {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double radius = console.nextDouble();
        double pi = 3.14;
        double s = pi * radius * radius;
        int result = (int)s;
        System.out.println(result);

    }

}
