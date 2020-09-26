import java.util.Arrays;

public class Array {

    public static void main(String[] args) {
        int[] array = {5, 8, 7, 6, 1, 1, 4, 5, 10, 25};
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
        System.out.println("Sorted array: ");
        for (int i : array) {
            System.out.println(i);

        }
    }
}

