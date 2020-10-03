import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Введите число a");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

        System.out.println("Введите число b");
        Scanner i = new Scanner(System.in);
        int b = i.nextInt();

        System.out.println("Введите число r");
        Scanner n = new Scanner(System.in);
        int r = n.nextInt();


        if ((r * r) / 2 >= (a * a) + (b + b)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
