package Lesson;

import java.util.Scanner;

public class ShareACoke {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        int amountCoke = console.nextInt();
        int person = console.nextInt();

        double result = (double) amountCoke / person;
        System.out.println(result);
    }
}
