package hw_21_10_2020.exception;

import java.util.Random;
import java.util.Scanner;

public class Car {
    String brand;
    int cost;
    int speed;

    public Car(String brand, int cost, int speed) {
        this.brand = brand;
        this.cost = cost;
        this.speed = speed;
    }

    public Car() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    int a = 0;
    int b = 20;
    int random = a + (int) (Math.random() * b);

    public int getRandom() {
        return random;
    }
    protected void start() throws DoesNotStartException {
        int random = a + (int) (Math.random() * b);
        if (random % 2 != 0) {
            System.out.println("Автомобиль марки " + brand + " завелся!");
        } else {
            throw new DoesNotStartException("Автомобиль марки " + brand + " не завелся!");
        }

    }
}
