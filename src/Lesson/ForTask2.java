package Lesson;

import java.util.Scanner;

public class ForTask2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int multiple = scanner.nextInt();
        int i = start;
        int x = end;
        int m = multiple;

        int sum = 0;
        for (i = 0; i < x; i++) {
            if (multiple % 2 == 0) {
                sum = i + x;
                System.out.println(sum);
            }
        }
    }
}
