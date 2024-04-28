package Lesson;

import java.util.Scanner;

public class DoWhile2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int   number = console.nextInt();
        String str = console.nextLine();
        do {
            System.out.println(str);
            number--;

        } while (number > 0&&number < 4);
    }
}
