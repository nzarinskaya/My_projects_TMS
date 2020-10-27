package hw_21_10_2020.generics;

public class Main {

    public static void main(String[] args) {
        String[] arrayString = new String[]{"ONE", "tWO", "THREE"};
        Double[] arrayDouble = new Double[]{1.0, 3.0, 7.0, 2.0, 4.0, 5.0, 6.0};
        Integer[] arrayInt = new Integer[]{1, 3, 7, 2, 4, 5, 6};
        System.out.println(Elements.getElement(arrayString, 2).toString());
        System.out.println(Elements.getElement(arrayDouble, 5).toString());
        System.out.println(Elements.getElement(arrayInt, 3).toString());
    }
}