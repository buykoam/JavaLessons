import java.util.concurrent.TimeUnit;

public class SetTimer {
    public static void setTimer( int seconds, int millis) throws InterruptedException {
        System.out.println("Таймер запущен!");
        //напишите тут ваш код

        TimeUnit.SECONDS.sleep(1);
        TimeUnit.MILLISECONDS.sleep(1);
        setTimer(1,1);
        System.out.println("♬ ♪ ♬♬♬♬ ♪♪♪♪");
    }

    public static void main(String[] args) throws InterruptedException {
        SetTimer.setTimer(1,1);
    }
}
