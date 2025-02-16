import java.util.Scanner;

public class PrimeNumberChecker {

    public static void main(String[] args) {

        // Create a Scanner object to read input from the console.
        Scanner input = new Scanner(System.in);

        try {
            // Prompt the user to enter a positive integer.
            System.out.print("Enter a positive integer: ");
            // Read the integer from the user and store it in the 'number' variable.
            int number = input.nextInt();

            // Prime numbers are greater than 1.  Handle numbers less than 2.
            if (number < 2) {
                System.out.println(number + " is not a prime number.");
            } else {
                // Assume the number is prime initially.
                boolean isPrime = true;

                // Optimization: Check divisibility only up to the square root of the number.
                // If a number has a divisor greater than its square root, it must also have a divisor smaller than its square root.
                for (int i = 2; i <= Math.sqrt(number); i++) {
                    // Check if the number is divisible by any number from 2 up to its square root.
                    if (number % i == 0) {
                        // If it's divisible, it's not prime.
                        isPrime = false;
                        // Exit the loop since we've already determined it's not prime.
                        break;
                    }
                }

                // After the loop, check the value of isPrime.
                if (isPrime) {
                    System.out.println(number + " is a prime number.");
                } else {
                    System.out.println(number + " is not a prime number.");
                }
            }

        } finally {
            // This block ensures that the Scanner is closed even if an exception occurs.
            if (input != null) {
                input.close(); // Close the Scanner to release resources and prevent leaks.
            }
        }
    }
}
