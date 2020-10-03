import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Введите число больше трёх");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        if (n <= 3) {
            System.out.println("Вы ввели неверное число.");
        }
        int[] array = new int[n];
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            int r = (int) (Math.random() * (n + 1));
            array[i] = r;

            if (r % 2 == 0 && r != 0) {
                index = index + 1;

            }
        }
        System.out.println("Массив из случайных чисел " + Arrays.toString(array));

        int[] array2 = new int[index];
        int ch = 0;
        for (int i = 0; i < array2.length; i++) {
            if (array[i] % 2 == 0 & array[i] != 0) {
                array2[ch] = array[i];
                ch = ch + 1;
            }
        }
        System.out.println("Массив из  " + Arrays.toString(array2));
    }
}























