import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Введите число n");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] array = new int[n];

        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            int a = rand.nextInt();

            array[i] = a;
        }

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                sum = sum + array[i];
            }
        }


        int min = 0;
        int index_min = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                min = array[i];
                index_min = i;
            }
        }

        int max = 0;
        int index_max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                max = array[i];
                index_max = i;


            }
        }
        int m = 1;
        for (int i = 0; i < array.length; i++) {
            if (index_min < i | i < index_max) {
                m = m * array[i];
            }
        }

        System.out.println("Сумма отрицательных элементов = " + sum);
        System.out.println("Произведение элементов между min и max = " + m);


    }
}







