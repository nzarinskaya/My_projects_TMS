package hw_21_10_2020.shape;

public class Square extends Figure {
    int area;

    public Square(String nameFigure, int area) {
        super(nameFigure);
        this.area = area;
    }

    @Override
    public String toString() {
        return "Square{" +
                "area=" + area +
                ", nameFigure='" + nameFigure + '\'' +
                '}';
    }
}

