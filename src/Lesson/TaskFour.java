package Lesson;

public class TaskFour {
    //Написать программу, которая проходит циклом по английскому алфавиту, начиная с буквы ‘b’, и выводит каждую букву до тех пор, пока не встретит гласную (т.е. вывести согласные на консоль).
    public static void main(String[] args) {
        for(char value ='b'; !isVowel(value); value++) {
            System.out.println(value);
        }

    }
    private  static boolean isVowel(char value){
        return value == 'a' || value == 'e' || value == 'u' || value == 'i' || value == 'o' || value == 'y';
    }

}
