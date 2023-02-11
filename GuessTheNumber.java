import java.util.Scanner;

//! This code generates a random Number between 1 and 100
//! and prompts the user to Guess the Number.
class GuessTheNumber {
    public static void main(String[] args) {
        int Range = 100;
        int Number = (int) (Math.random() * Range) + 1;

        try (Scanner scanner = new Scanner(System.in)) {
            int Attempts = 0;
            int Score = 0;
            int Guess = -1;
            System.out.println("Guess the Number between 1 and " + Range + ":");

            while (Guess != Number && Attempts <= 7) {
                // ! No. of Attempts = 7
                Guess = scanner.nextInt();
                Attempts++;

                if (Guess < Number) {
                    System.out.println("The Number is higher.\n Guess again:");
                } else if (Guess > Number) {
                    System.out.println("The Number is lower.\n Guess again:");
                }
            }
            if (Guess == Number) {
                System.out.println("You got it!\n The Number was " + Number);
                Score = Range - Attempts;
                System.out.println("Your Score is: " + Score);
            } else {
                System.out.println("You exceeded the maximum Number of Attempts.\n The Number was " + Number);
            }
        }
    }
}
