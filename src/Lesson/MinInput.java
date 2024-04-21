package Lesson;

import java.util.Scanner;

public class MinInput {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);

        int min = Integer.MAX_VALUE;;

        while(console.hasNextInt()){
            int n = console.nextInt();
            if(n<min){
                min=n;
            }
        }
        System.out.println(min);
    }
}
