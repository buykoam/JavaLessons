import java.util.Scanner;

public class DateFormat {
    public static void main(String[] args) {

        Scanner d = new Scanner(System.in);
        System.out.print("Input a day: ");
        int day = d.nextInt();

        Scanner m = new Scanner(System.in);
        System.out.print("Input a month: ");
        int month = m.nextInt();

        Scanner y = new Scanner(System.in);
        System.out.print("Input a years: ");
        int years = y.nextInt();
        boolean flag = true;
        if (month == 12  && day == 31) {
            month = 1;
            day = 1;
            years++;
        }
        else {
            flag = false;
            if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) && day == 31) {
                month++;
                day = 1;
            } else if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) && day < 31){
                day++;
            }
            else if ((month == 2) && day < 28) {
                day++;

            } else if ((month == 2) && day == 28) {
                month++;
                day = 1;
            }
            else if ((month == 4 || month == 6 || month == 9 || month == 11) && day < 30) {
                day++;
            }

            else if ((month == 4 || month == 6 || month == 9 || month == 11) && day == 30) {
                month++;
                day = 1;
            }
            else if ((month == 12)  && day == 31) {
                month = 1;
                day = 1;
                years++;
            }
            else {
                flag = false;
            }

        }
        if (flag == true) {
            System.out.println(getformat(day,month,years));
        } else {
            System.out.println("Incorrect date");
        }
    }
    static String getformat(int day, int month, int years) {
        String strD = String.valueOf(day);
        String strM = String.valueOf(month);
        String strY = String.valueOf(years);
        if (strD.length() == 1) {
            strD = "0" +day;
        }
        if (strM.length() == 1) {
            strM = "0" +month;
        }
        return "Your date " + strD + "." + strM + "." + strY;
    }

}
