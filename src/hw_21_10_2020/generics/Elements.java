package hw_21_10_2020.generics;

import java.util.ArrayList;

public class Elements {
    public static <T> Object getElement(T[] array, int i) {
        Generics generics = new Generics();
        generics.setArray(array);
        return generics.getArray(i);
    }
}