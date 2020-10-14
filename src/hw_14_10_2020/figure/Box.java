package hw_14_10_2020.figure;

public class Box extends Shape {
    public Box(double volume) {
        super.volume = volume;
    }
    public static void main(String[] args) {
    }
    boolean add(Shape shape) {
        if (shape.volume < this.volume) {
            this.volume -= shape.volume;
            System.out.println("Добавлена в контейнер фигура");
            return true;
        } else {
            System.out.println("Контейнер заполнен - добавление новой фигуры невозможно");
            return false;
        }
    }
}


