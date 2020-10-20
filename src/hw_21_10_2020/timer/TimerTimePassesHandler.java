package hw_21_10_2020.timer;

public class TimerTimePassesHandler implements EventHandler {

    @Override
    public void printMessage(int seconds) {
        System.out.println("Прошло "+seconds+" секунд!");
    }
}
