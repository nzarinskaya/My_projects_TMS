package hw_04_11_2020.minbyte;

public class Min {
    public static byte getMin(byte[] b) {
        byte min = b[0];
        for (int j = 0; j < b.length; j++) {
            if (b[j] < min) {
                min = b[j];
            }
        }
        return min;
    }
}

