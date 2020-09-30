import java.sql.SQLOutput;
import java.util.Scanner;

public class Task5 {
    public static boolean recursion(int n, int i) {

        if (n < 2) {
            return false;
        } else if (n == 2) {
            return true;
        } else if (n % i == 0) {
            return false;
        } else if (i < n / 2) {
            return recursion(n, i + 1);
        } else {
            return true;
        }
    }

    public static void main(String[] args) {

        System.out.println("Введите число n ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.println("Введите число i ");
        Scanner input = new Scanner(System.in);
        int i = input.nextInt();

        boolean result = recursion(n, i);

        if (result == true) {


            System.out.printf("Is number %d simple - YES\n", n);
        } else {

            System.out.printf("Is number %d simple - NO\n", n);

        }
    }
}









