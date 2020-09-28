import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Введите число меньше 10");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        switch (n){
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Воскресенье");
                break;
            case 8:
                System.out.println("Понедельник");
                break;
            case 9:
                System.out.println("Вторник");
                break;
            default:
                System.out.println("Вы ввели неверное число");

        }

    }
}
