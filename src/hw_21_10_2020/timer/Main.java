package hw_21_10_2020.timer;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Timer timer = new Timer(new TimerTimePassesHandler());
        timer.timePasses();
    }
}