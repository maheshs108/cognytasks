import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter 'C' for Celsius or 'F' for Fahrenheit: ");
        String userInput = scanner.nextLine().toUpperCase(); // Convert input to uppercase for easier comparison

        if (userInput.equals("C")) {
            System.out.print("Enter the temperature in Celsius: ");
            if (scanner.hasNextInt()) { // Check if the next input is an integer
                int temp = scanner.nextInt();
                double fahrenheit = (9.0 / 5.0) * temp + 32;
                System.out.println(temp + " Celsius is equal to " + fahrenheit + " Fahrenheit.");
            } else {
                System.out.println("Invalid input. Please enter an integer temperature.");
            }
        } else if (userInput.equals("F")) {
            System.out.print("Enter the temperature in Fahrenheit: ");
            if (scanner.hasNextInt()) { // Check if the next input is an integer
                int temp = scanner.nextInt();
                double celsius = (temp - 32) * (5.0 / 9.0);
                System.out.println(temp + " Fahrenheit is equal to " + celsius + " Celsius.");
            } else {
                System.out.println("Invalid input. Please enter an integer temperature.");
            }
        } else {
            System.out.println("Invalid input. Please enter 'C' or 'F'.");
        }
        scanner.close();
    }
}

