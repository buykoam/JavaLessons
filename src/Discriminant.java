import java.util.Scanner;

public class Discriminant {
    public static void main(String[] args) {
        double d;
        double x = 0;
        double x2 = 0;
        Scanner aInput = new Scanner(System.in);
        System.out.println("Input a number for a :");
        double a = aInput.nextDouble();

        Scanner bInput = new Scanner(System.in);
        System.out.println("Input a number for b :");
        double b = bInput.nextDouble();

        Scanner cInput = new Scanner(System.in);
        System.out.println("Input a number for b :");
        double c = cInput.nextDouble();

        d = Discriminant.discriminant(b, a, c);

        if (d > 0){
            Discriminant.isPositive(x,x2,b,a,d);
        }
        else if (d == 0){
            Discriminant.isZero(x,x2,b,a,d);
        }
        else {
            System.out.println("Не имеет решение!");
        }
    }
    static double discriminant(double b, double a, double c){
        return Math.pow(b, 2) - 4*a*c;
    }

    static void isPositive(double x, double x2, double b, double a, double d) {
        x = ((-b + Math.sqrt(d))/2*a);
        x2 = ((-b - Math.sqrt(d))/2*a);

        System.out.println("x = " +x +";" + "x2 = " +x2 );
    }
    static void isZero(double x, double x2, double b, double a, double d) {
        x = ((-b + Math.sqrt(d)) / 2 * a);
        x2 = ((-b - Math.sqrt(d)) / 2 * a);

        if (x == x2){
            System.out.println("x = " + x);
        }
        else {
            System.out.println("x = " + x + ";" + "x2 = " + x2);
        }
    }
}
