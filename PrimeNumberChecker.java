import java.util.Scanner;

public class PrimeNumberChecker {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Enter a positive integer: ");
            int number = input.nextInt();

            if (number < 2) {
                System.out.println(number + " is not a prime number.");
            } else {
                boolean isPrime = true;
                for (int i = 2; i <= Math.sqrt(number); i++) {
                    if (number % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    System.out.println(number + " is a prime number.");
                } else {
                    System.out.println(number + " is not a prime number.");
                }
            }

        } finally {
            if (input != null) {
                input.close();
            }
        }
    }
}
