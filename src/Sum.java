import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int i=0; i<10; i++){
            int number = sc.nextInt();
            System.out.println("value: " + number + ";" + " Sum of digits = " + sumDigits(number));
        }
    }

    private static int sumDigits(int number) {
        if (number<10) return number;
        return number % 10 + sumDigits(number / 10);
    }
}



