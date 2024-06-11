
/*
Работаем с элементами массива
*/

public class Elements {

    public static int[] array = new int[]{-1, 2, 3, -4, -5};

    public static void main(String[] args) {
        for (int i = 0; i < array.length; i++) {

            if (array.length % 2 == 0) {
                array = array - 1;
            }
        }
                //напишите тут ваш код
                System.out.println(array[0]);
                System.out.println(array[1]);
                System.out.println(array[2]);
                System.out.println(array[3]);
                System.out.println(array[4]);
    }
}






























