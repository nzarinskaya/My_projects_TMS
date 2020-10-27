package hw_28_10_2020.motorshow;

public class Car {
    private String brand;
    private String model;
    private int yearOfIssue;

    public Car(String brand, String model, int yearOfIssue) {
        this.brand = brand;
        this.model = model;
        this.yearOfIssue = yearOfIssue;
    }

    public Car() {
    }

    @Override
    public String toString() {
        return "Car(" +brand + ", " +
               model + ", " +yearOfIssue +
                ")";
    }

     String getBrand() {
        return brand;
    }

     String getModel() {
        return model;
    }

     int getYearOfIssue() {
        return yearOfIssue;
    }
}
