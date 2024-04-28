package Lesson;

import java.util.Scanner;

public class Glass {
    public static void main(String[] args) {

        double glass = 0.5;
        boolean optim = true;
        Scanner console = new Scanner(System.in);
        boolean result = console.nextBoolean();
        if (optim == result){
            glass= Math.ceil(glass);
            System.out.println((int) glass);
        } else {
            glass= Math.floor(glass);
            System.out.println((int) glass);
        }
    }
}
