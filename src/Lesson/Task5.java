package Lesson;

import java.util.Random;

public class Task5 {
    public static void main(String[] args) {
        Random random = new Random();
        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < 10; i++) {
            int randomValue = random.nextInt(100);
            System.out.println(randomValue);
            if (maxValue < randomValue) {
                maxValue = randomValue;
            }
        }
        System.out.println("Максимальное число: " + maxValue);
    }
}
