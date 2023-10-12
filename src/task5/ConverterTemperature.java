package task5;

public class ConverterTemperature {
    public static double celsiusToKelvin(double celsius) {
        // Формула для конвертації з Цельсієм в Кельвіни: K = C + 273.15
        return celsius + 273.15;
    }

    public static double celsiusToFahrenheit(double celsius) {
        // Формула для конвертації з Цельсієм в Фаренгейти: F = (C × 9/5) + 32
        return (celsius * 9 / 5) + 32;
    }
    public static void main(String[] args) {
        double celsius = 22.0;

        double kelvin = celsiusToKelvin(celsius);
        System.out.println(celsius + " градусів Цельсія = " + kelvin + " Келвін");
        System.out.println();

        double fahrenheit = celsiusToFahrenheit(celsius);
        System.out.println(celsius + " градусів Цельсія = " + fahrenheit + " Фаренгейт");
        System.out.println();
    }
}
