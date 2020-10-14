package hw_14_10_2020.figure;

public class Ball extends SolidOfRevolution {

    public Ball(double radius) {
        super(radius);
        super.volume = Math.PI * Math.pow(radius, 3) * 4 / 3;
    }
}





