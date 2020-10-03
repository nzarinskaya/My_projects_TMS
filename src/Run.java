public class Run {
    public static void main(String[] args) {

        float i = 0.0f;
        float distance = 10.0f;
        float sum = 0.0f;

        while (i < 7) {
            float ten_percent = (distance / 100) * 10;

            i++;
            sum = sum + distance;
            distance = distance + ten_percent;
        }
        System.out.println("Суммарно спортсмен пробежал за неделю " + sum + " км!");
    }
}



