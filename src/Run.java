public class Run {
    public static void main(String[] args) {

        int i = 0;
        int day = 10;

        int sum = 0;
        int percent = 10 / 10;//10 %- посчитано так,чтобы не менять на float;


        while (i < 7) {
            i++;
            sum = sum + day;
            day = day + percent;

        }
        System.out.println("Суммарно спортсмен пробежал за неделю " + sum + " км!");

    }
}



