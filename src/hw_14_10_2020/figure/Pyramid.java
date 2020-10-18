package hw_14_10_2020.figure;

public class Pyramid extends Shape {
    double s;
    double h;

    public Pyramid(double s, double h) {
        this.s = s;
        this.h = h;
        super.volume = (s*h)*(1/3);
    }
}
