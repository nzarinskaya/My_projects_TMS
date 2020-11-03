package hw_04_11_2020.read_reverse;

public class Reverse {

    public static String front(String str) {
        String[] array = str.split(" ");
        StringBuilder strBuild = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            strBuild.append(array[i] + " ");
        }
        return strBuild.toString();
    }

    public static String reverse(String str) {
        String[] s = str.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = s.length - 1; i >= 0; i--) {
            stringBuilder.append(s[i] + " ");
        }
        return stringBuilder.toString();
    }
}
