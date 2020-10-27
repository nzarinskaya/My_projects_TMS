package hw_21_10_2020.exception;

public class Main {
    public static void main(String[] args) throws DoesNotStartException {
        Car car1 = new Car("Mercedes", 10000, 180);
        Car car2 = new Car("Lamborghini", 112000, 300);
        Car car3 = new Car("Lexus", 45000, 220);

        try {
            car1.start();
            car2.start();
            car3.start();

        } catch (DoesNotStartException e) {
            System.out.println(e.getMessage());
        }
        try {
            car2.start();
        } catch (DoesNotStartException e) {
            System.out.println(e.getMessage());
        }
        try {
            car3.start();
        } catch (DoesNotStartException e) {
            System.out.println(e.getMessage());
        }
    }
}

