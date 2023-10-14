package task5;

public class ConverterTemperature {
    public static double convert (double celsius, String targetUnit) {
        double result = 0.0;

        if (targetUnit == "Kelvin"){
            // Формула для конвертації з Цельсієм в Кельвіни: K = C + 273.15
            result = celsius + 273.15;
        } else if (targetUnit == "Fahrenheit"){
            // Формула для конвертації з Цельсієм в Фаренгейти: F = (C × 9/5) + 32
            result = (celsius * 9 / 5) + 32;
        }
        return result;
    }

    public static void main(String[] args) {
        double celsius = 22.0;

        double kelvin = convert(celsius, "Kelvin");
        System.out.println(celsius + " градусів Цельсія = " + kelvin + " Келвін");
        System.out.println();

        double fahrenheit = convert(celsius, "Fahrenheit");
        System.out.println(celsius + " градусів Цельсія = " + fahrenheit + " Фаренгейт");
        System.out.println();
    }
}
