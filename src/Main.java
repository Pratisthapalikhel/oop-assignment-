import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter an integer between 0 and 1000
        System.out.print("Enter an integer between 0 and 1000: ");

        try {
            // Read the input as a string
            String input = scanner.nextLine();

            // Parse the input string to an integer
            int number = Integer.parseInt(input);

            // Validate if the input is within the specified range
            if (number >= 0 && number <= 1000) {
                // Calculate the sum of digits
                int sum = 0;
                int tempNumber = number;

                while (tempNumber > 0) {
                    sum += tempNumber % 10; // Add the last digit to the sum
                    tempNumber /= 10;       // Remove the last digit
                }

                // Display the result
                System.out.println("The sum of all digits in " + number + " is " + sum);
            } else {
                // Display an error message for invalid input
                System.out.println("Invalid input. Please enter an integer between 0 and 1000.");
            }
        } catch (NumberFormatException e) {
            // Handle the case where the input cannot be parsed to an integer
            System.out.println("Invalid input. Please enter a valid integer.");
        }

        // Close the Scanner object
        scanner.close();
    }
}
