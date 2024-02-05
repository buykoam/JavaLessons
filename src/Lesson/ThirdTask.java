package Lesson;

public class ThirdTask {
    //Написать программу, определяющую, является ли введённое целое число простым,  т.е. делится без остатка только на 1 и само на себя.
    public static void main(String[] args) {
        System.out.println(check(55));
    }
    static boolean check (int b) {
        boolean result = true;
        for (int i=2; i<=b / 2; i++) {
            if (b % i == 0) {
                result =false;
                break;
            }
            System.out.println();
        }
        return result;
    }
}
