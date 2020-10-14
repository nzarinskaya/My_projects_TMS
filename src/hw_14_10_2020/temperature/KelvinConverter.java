package hw_14_10_2020.temperature;

public class KelvinConverter extends Temperature implements Converter {

    @Override
    public void convert(double temperatureCelsius) {
        temperatureCelsius = temperatureCelsius+273.15;
        System.out.println("В Мадриде "+temperatureCelsius+" градуса/ов по Кельвину");
    }
}
