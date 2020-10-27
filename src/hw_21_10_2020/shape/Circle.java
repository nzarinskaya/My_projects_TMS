package hw_21_10_2020.shape;

public class Circle extends Figure {
    int diameter;

    public Circle(String nameFigure, int diameter) {
        super(nameFigure);
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "diameter=" + diameter +
                ", nameFigure='" + nameFigure + '\'' +
                '}';
    }
}

