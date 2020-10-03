import java.util.Random;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {

        System.out.println("Введите число n>0 ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("Введите число l>0 и отличное от n");
        Scanner sc1 = new Scanner(System.in);
        int l = sc1.nextInt();


        int[][] array = new int[n][l];

        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                int d = random.nextInt();
                array[i][j] = d;


                System.out.println(array[i][j]);


            }
        }
    }
}



