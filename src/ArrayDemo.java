import java.util.Arrays;

public class ArrayDemo {
    public static void sort() {
        int[] array = {5, 2, 1, 4, 8, 6};
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        for (int value : array) {
            System.out.print(value + " ");
        }
    }

    public static void task1() {
        //Напишите программу, которая печатает массив сначала в обычном порядке, затем в обратном.
        char[] values = {'a', 't', '1', 'j', 'q'};
        for (char value : values) {
            System.out.print(value + " ");
        }
        System.out.println();
        for (int i = values.length - 1; i >= 0; i--) {
            System.out.print(values[i] + " ");
        }
    }

    public static void task2() {
        //Напишите программу, заносящую в массив первые 100 натуральных чисел, делящихся на 13 или на 17, и печатающую его.
        int[] values = new int[100];
        for (int i = 0, count = 13; i < values.length; i++) {
            while (true) {
                if (count % 13 == 0 || count % 17 == 0) {
                    values[i] = count++;
                    break;
                }
                count++;
            }
        }
        System.out.println(Arrays.toString(values));
    }
    public static void task3() {
        //Определить сумму элементов целочисленного массива, расположенных между минимальным и максимальным значениями.
        int[] values = {5, 2, 1, 4, 6, 8};

        int minValueIndex = minValue(values);
        int maxValueIndex = maxValue(values);
        int sum = sum(values, minValueIndex, maxValueIndex);
        System.out.println(sum);
    }
    private static int minValue(int[] values) {
        int minValueIndex = 0;
        for (int i = 1; i < values.length; i++) {
            if (values[minValueIndex] > values[i]) {
                minValueIndex = i;
            }
        }
        return minValueIndex;
    }
    private static int maxValue(int... values) {
        int maxValueIndex = 0;
        for (int i = 1; i < values.length; i++) {
            if (values[maxValueIndex] < values[i]) {
                maxValueIndex = i;
            }
        }
        return maxValueIndex;
    }
    private static int sum(int [] values, int minValueIndex, int maxValueIndex){
        int startIndex = minValueIndex < maxValueIndex ? minValueIndex : maxValueIndex;
        int endIndex = minValueIndex > maxValueIndex ? minValueIndex : maxValueIndex;

        int result = 0;
        for (int i = startIndex +1; i < endIndex; i++) {
            result += values[i];

        }
        return result;
    }
}

