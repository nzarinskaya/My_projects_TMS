package hw_21_10_2020.shape;

public abstract class Figure {
     protected String nameFigure;

     Figure(String nameFigure) {
        this.nameFigure = nameFigure;
    }

    protected String getNameFigure() {
        return nameFigure;
    }

    @Override
    public String toString() {
        return "Figure{" +
                "nameFigure='" + nameFigure + '\'' +
                '}';
    }
}
