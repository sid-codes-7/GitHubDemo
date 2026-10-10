import java.util.Scanner;

// Guess the randomly chosen number from 1 through 100.
public class NumGuess {
    public static void main(String[] args) {
        int numberToGuess = (int) (Math.random() * 100) + 1;

        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.print("Enter your guess (1-100): ");

                if (!scanner.hasNextInt()) {
                    System.out.println("Please enter a whole number.");
                    scanner.next();
                    continue;
                }

                int guess = scanner.nextInt();
                if (guess < numberToGuess) {
                    System.out.println("Your guess is lower than the actual number.");
                } else if (guess > numberToGuess) {
                    System.out.println("Your guess is higher than the actual number.");
                } else {
                    System.out.println("Good job! You guessed the number.");
                    break;
                }
            }
        }
    }
}
