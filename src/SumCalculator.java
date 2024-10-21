import java.util.Scanner;

public class SumCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1 = 0;
        double num2 = 0;

        // Input for the first number with error handling
        while (true) {
            try {
                System.out.print("Enter the first number: ");
                num1 = scanner.nextDouble(); // Attempt to read a double
                break; // Break the loop if successful
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next(); // Clear the invalid input
            }
        }

        // Input for the second number with error handling
        while (true) {
            try {
                System.out.print("Enter the second number: ");
                num2 = scanner.nextDouble(); // Attempt to read a double
                break; // Break the loop if successful
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next(); // Clear the invalid input
            }
        }

        // Calculate the sum of the two numbers
        double sum = num1 + num2;

        // Display the sum
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}
