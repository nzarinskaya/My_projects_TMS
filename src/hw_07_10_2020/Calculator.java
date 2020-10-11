package hw_07_10_2020;

import static java.lang.Math.getExponent;
import static java.lang.Math.sqrt;


public class Calculator {

    private int a;
    private int b;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Calculator() {

    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public static void main(String[] args) {
        Calculator numeral = new Calculator(3, 1);
        int numeralA = numeral.getA();
        int numeralB = numeral.getB();

        System.out.println(numeral.sum(numeralA, numeralB));
        System.out.println(numeral.sqrt(numeralA, numeralB));
        System.out.println(numeral.pow(numeralA, numeralB));
    }
    private static int sum(int numeralA, int numeralB) {
        return numeralA + numeralB;
    }
    private static int sqrt(int numeralA, int numeralB) {
        return (int) Math.sqrt(numeralA + numeralB);
    }
    private static int pow(int numeralA, int numeralB) {
        return (int) Math.pow(numeralA, numeralB);
    }
}



