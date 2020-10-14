package hw_14_10_2020.figure;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Shape> array = new ArrayList<>();
        array.add(new Ball(1.3));
        array.add(new Cylinder(1.5, 2.3));
        array.add(new Pyramid(1.7, 2.0));
        array.add(new Ball(1.7));
        array.add(new Cylinder(1.3, 2.1));
        array.add(new Pyramid(2.4, 2.5));

        Box box = new Box(52.0);
        fill(array, box);
    }
    private static void fill(ArrayList<Shape> array, Box box) {
        for (int i = 0; i < array.size(); i++) {
            if (!box.add(array.get(i))) {
                break;
            }
        }
    }
}



