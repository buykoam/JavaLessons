import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {

    }

    public static void signIn(String username){
        //напишите тут ваш код
        if (username.equals("user")){
            return;
        } else {
            System.out.println("Добро пожаловать " + username);
            System.out.println("Очень скучали по Вам, " + username);
        }
    }
}

