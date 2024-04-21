package Lesson;

import java.util.Scanner;

public class MaxInputNumber {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int max = Integer.MIN_VALUE;

        while(console.hasNextInt()){
            int x = console.nextInt();
            if (((x%2)==0) && (x>max)){
                    max = x;
                }
            }
        System.out.println(max);
    }
}
