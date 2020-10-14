package hw_14_10_2020.temperature;

public class Temperature {
    public static void main(String[] args) {
        CelsiusConverter celsiusConverter = new CelsiusConverter();
        celsiusConverter.convert(32.0);

        FahrenheitConverter fahrenheitConverter = new FahrenheitConverter();
        fahrenheitConverter.convert(32.0);

        KelvinConverter kelvinConverter = new KelvinConverter();
        kelvinConverter.convert(32.0);
    }
}
