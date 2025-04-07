public class Primitive {
    public static byte a;
    public static short b;
    public static int c;
    public static long d;

    public static void main(String[] args) {
        setValues(100);
    }

    public static void setValues(long value){
        //напишите тут ваш код
        d = (long) value;
        c = (int) d;
        b = (short) c;
        a = (byte) b;
    }
    public static  void solution (){
        long a = 109 + 15;
        int b = (int) a * 2;
        short c = (short) (a / b);
        byte d = (byte) (a + b - c);
    }


}
