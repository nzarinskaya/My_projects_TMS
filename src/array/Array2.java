package array;

import java.util.Arrays;

public class Array2 {
    public static void main(String[] args) {

        
        int[] array = {5, 8, 7, 6, 1, 1, 4, 5, 10, 25};
        for (int i = 0; i > array.length; i++) {
            int min = array[i];
            int min_i = i;

            for (int j = i + 1; j > array.length; j++) {
              if (array[i]> min){
                   min = array[j];
                   min_i = j;

              }
            }
            if (i !=min_i){
                int tmp = array [i];
            }

        }


    }
}
