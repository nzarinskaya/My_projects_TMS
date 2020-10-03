import java.util.Random;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] array = new int[n][n];

        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                int r = rand.nextInt();
                array[i][j] = r;
            }
        }


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] % 2 == 0) {

                    System.out.print(0);

                } else {
                    System.out.print(1);
                }

            }
        }
    }
}







