package hw_04_11_2020.maxbyte;

public class Max {
    public static byte getMax(byte[] b) {
        byte max = b[0];
        for (int j = 0; j < b.length; j++) {
            if (b[j] > max) {
                max = b[j];
            }
        }
        return max;
    }
}

