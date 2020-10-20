package hw_21_10_2020.shape;

public abstract class Figure {
    String nameFigure;

    public Figure(String nameFigure) {
        this.nameFigure = nameFigure;
    }

    public String getNameFigure() {
        return nameFigure;
    }

    @Override
    public String toString() {
        return "Figure{" +
                "nameFigure='" + nameFigure + '\'' +
                '}';
    }
}
