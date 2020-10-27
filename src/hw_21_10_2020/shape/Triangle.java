package hw_21_10_2020.shape;

public class Triangle extends Figure {
    int height;
    public Triangle(String nameFigure, int height) {
        super(nameFigure);
        this.height = height;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "height=" + height +
                ", nameFigure='" + nameFigure + '\'' +
                '}';
    }
}

