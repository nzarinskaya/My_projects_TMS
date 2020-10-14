package hw_14_10_2020.temperature;

public class FahrenheitConverter extends Temperature implements Converter {

    @Override
    public void convert(double temperatureCelsius) {
        temperatureCelsius = temperatureCelsius*(9.0/5.0)+32.0;
        System.out.println("В Мадриде "+temperatureCelsius+" градуса/ов по Фаренгейту");
    }
}
