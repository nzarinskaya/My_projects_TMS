package hw_14_10_2020.temperature;

public class CelsiusConverter implements Converter {
    @Override
    public void convert(double temperatureCelsius ) {
        System.out.println("В Мадриде "+temperatureCelsius+" градуса/ов по Цельсию");
    }
}
