import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

        int[] array = new int[a];



        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            int r = rand.nextInt();
            array[i] = r;
        }

        System.out.println("Not sorted array: ");
        System.out.println(Arrays.toString(array));

        for (int i = array.length - 1; i > 0; i--) {

            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }

            }
        }
        System.out.println("Sorted array:");
        for (int i : array) {
            System.out.println(i);
        }


    }
}
