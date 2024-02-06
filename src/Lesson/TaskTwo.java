package Lesson;

public class TaskTwo {
    // Написать программу высчитывающую факториал введённого целого числа.
    public static void main(String[] args) {
        int inputValue = 6;
        int result = 1;
        for (int i = 1; i <= inputValue ; i++) {
            result = result * i;
        }
        System.out.println(result);
    }
}
