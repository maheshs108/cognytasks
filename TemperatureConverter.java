import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter 'C' to give value in Celsius and 'F' to give value in Fahrenheit: ");
        String userInput = scanner.nextLine();

        if (userInput.equalsIgnoreCase("C")) {
            System.out.print("Enter the Temp Value in Celsius: ");
            // Using nextDouble() to handle decimal values
            double temp = scanner.nextDouble();
            // Clear the newline character
            scanner.nextLine(); 
            double fahrenheit = (9.0 / 5.0) * temp + 32;
            System.out.println("The Given Temp in Celsius is: " + temp + " After Conversion to Fahrenheit is: " + fahrenheit);
        } 
        else if (userInput.equalsIgnoreCase("F")) {
            System.out.print("Enter the Temp Value in Fahrenheit: ");
            // Using nextDouble() to handle decimal values
            double temp = scanner.nextDouble();
            // Clear the newline character
            scanner.nextLine(); 
            double celsius = (temp - 32) * (5.0 / 9.0);
            System.out.println("The Given Temp in Fahrenheit is: " + temp + " After Conversion to Celsius is: " + celsius);
        } 
        else {
            System.out.println("Wrong Input");
        }

        scanner.close();
    }
}
