import java.util.Scanner;

public class task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter temperature value:");
        double temp = scanner.nextDouble();
        System.out.println("Enter unit (C for Celsius, F for Fahrenheit, K for Kelvin):");
        String unit = scanner.next().toUpperCase();

        switch (unit) {
            case "C":
                convertFromCelsius(temp);
                break;
            case "F":
                convertFromFahrenheit(temp);
                break;
            case "K":
                convertFromKelvin(temp);
                break;
            default:
                System.out.println("Invalid unit. Please enter C, F, or K.");
        }

        scanner.close();
    }

    public static void convertFromCelsius(double celsius) {
        double fahrenheit = (celsius * 9 / 5) + 32;
        double kelvin = celsius + 273.15;
        System.out.printf("Fahrenheit: %.2f°F\n", fahrenheit);
        System.out.printf("Kelvin: %.2fK\n", kelvin);
    }

    public static void convertFromFahrenheit(double fahrenheit) {
        double celsius = (fahrenheit - 32) * 5 / 9;
        double kelvin = celsius + 273.15;
        System.out.printf("Celsius: %.2f°C\n", celsius);
        System.out.printf("Kelvin: %.2fK\n", kelvin);
    }

    public static void convertFromKelvin(double kelvin) {
        double celsius = kelvin - 273.15;
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.printf("Celsius: %.2f°C\n", celsius);
        System.out.printf("Fahrenheit: %.2f°F\n", fahrenheit);
    }
}
