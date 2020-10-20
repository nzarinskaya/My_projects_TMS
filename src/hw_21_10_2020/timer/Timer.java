package hw_21_10_2020.timer;

public class Timer {
    EventHandler handler;

    public Timer(EventHandler action) {
        this.handler = action;
    }

    public void timePasses() throws InterruptedException {
        int seconds = 0;
        while (true) {
            Thread.sleep(10 * 1000);
            seconds = seconds + 10;
            handler.printMessage(seconds);
        }
    }
}

