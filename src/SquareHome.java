import java.util.Scanner;

public class SquareHome {
    public static void main(String[] args) {
        Scanner inputA = new Scanner(System.in);
        System.out.print("Input the length of the first house : ");
        double a = inputA.nextDouble();

        Scanner inputB = new Scanner(System.in);
        System.out.print("Input the width of the first house : ");
        double b = inputB.nextDouble();


        Scanner inputC = new Scanner(System.in);
        System.out.print("Input the length of the second house : ");
        double c = inputC.nextDouble();

        Scanner inputD = new Scanner(System.in);
        System.out.print("Input the width of the second house : ");
        double d = inputD.nextDouble();

        double e = 10;
        double f = 10;
        double sArea = 10 * 10;
        double home1 = a * b;
        double home2 = c * d;
        double sumHome = home1 + home2;

        if(sumHome <= sArea){
            System.out.println("The houses are placed on the area");
        }
        else {
            System.out.println("The houses aren't placed on the area");
        }
    }

}
