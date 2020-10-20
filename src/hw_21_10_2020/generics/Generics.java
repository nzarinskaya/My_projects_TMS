package hw_21_10_2020.generics;

public class Generics<T> {
    T[] array;

    public void setArray(T[] array) {
        this.array = array;
    }

    public <T> T getArray(int i) {
        return (T) array[i];
    }
}
