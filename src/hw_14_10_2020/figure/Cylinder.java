package hw_14_10_2020.figure;

import java.util.Scanner;

public class Cylinder extends SolidOfRevolution {
    double height;

    public Cylinder(double radius, double height) {
        super(radius);
        super.volume = Math.PI * Math.pow(radius, 2) * height;
        this.height = height;
    }
}

