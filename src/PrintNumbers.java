public class PrintNumbers {
    public static void main(String[] args) throws InterruptedException {
        printNumbers();
    }

    public static void printNumbers() throws InterruptedException {
        //напишите тут ваш код
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
            if(i<10) {
                Thread.sleep(1,300000);
            }
        }
    }
}
