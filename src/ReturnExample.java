public class ReturnExample {
    public static void main(String[] args) {
        System.out.println(ninthDegree(3));
    }
    public static long ninthDegree(long a){
        return cube(cube(a));
    }
    public static long cube(long a){
        return a*a*a;
    }
}
