public class ArrayDemo {
    public static void bubble() {
        int[] array = {5, 2, 1, 4, 8, 6};
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]){
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
}

