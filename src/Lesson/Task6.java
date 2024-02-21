package Lesson;

public class Task6 {
    public static void main(String[] args) {
        int inputValue = 999;
        int result = 0;
        while (inputValue != 0) {
            int ostatok = inputValue % 10;
            result += ostatok;
            inputValue/= 10;
        }
        System.out.println(result);
    }
}
