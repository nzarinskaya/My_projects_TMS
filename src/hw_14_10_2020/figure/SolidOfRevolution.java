package hw_14_10_2020.figure;

import java.sql.ShardingKey;

public class SolidOfRevolution extends Shape {
    double radius;

    public SolidOfRevolution(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
}
