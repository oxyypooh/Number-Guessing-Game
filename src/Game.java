import java.util.*;

public class Game {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Number Guessing Game!" +
            "\nI'm thinking of a number between 1 and 100"+
            "\nYou have 5 chances to guess the correct number.");

        System.out.println();

        System.out.println("Please select the difficulty level: "
        + "\n1. Easy (10 chances)" +
        "\n2. Medium (5 chances)" + "\n3. Hard (3 Chances)"
        );
        
        System.out.println();
    
        int difficulty = input.nextInt();
        System.out.println("Enter your choice: " + difficulty);

        switch(difficulty) {
        case 1:
            System.out.println("Great! You have selected the Easy difficulty level!\nLet's start the game! ");
            int randomNum = (int) (Math.random() * 10) + 1;
            for(int i = 0; i < 10; i++) {
                System.out.println("Enter your guess: ");
                int guess = input.nextInt();
                if (guess == randomNum) {
                    System.out.println("Congratulations! You guessed it in " + i + " attempts.");
                    break;
                } else if(guess > randomNum) {
                    System.out.println("Incorrect! The number is less than " + guess);
                } else if(guess < randomNum) { 
                    System.out.println("Incorrect! The number is greater than " + guess);
                }
            }
            System.out.println("No more attempts, You lost Sorry!");
            break;
        case 2:
            System.out.println("Great! You have selected the Easy difficulty level!\nLet's start the game! ");
            int randomNum2 = (int) (Math.random() * 10) + 1;
            for(int i = 0; i < 5; i++) {
                System.out.println("Enter your guess: ");
                int guess = input.nextInt();
                if (guess == randomNum2) {
                    System.out.println("Congratulations! You guessed it in " + i + " attempts.");
                    break;
                } else if(guess > randomNum2) {
                    System.out.println("Incorrect! The number is less than " + guess);
                } else if(guess < randomNum2) { 
                    System.out.println("Incorrect! The number is greater than " + guess);
                }
            }
            System.out.println("No more attempts, You lost Sorry!");
            break;
        case 3:
            System.out.println("Great! You have selected the Hard difficulty level!\nLet's start the game! ");
            int randomNum3 = (int) (Math.random() * 100) + 1;
            for(int i = 0; i < 3; i++) {
                System.out.println("Enter your guess: ");
                int guess = input.nextInt();
                if (guess == randomNum3) {
                    System.out.println("Congratulations! You guessed it in " + i + " attempts.");
                    break;
                } else if(guess > randomNum3) {
                    System.out.println("Incorrect! The number is less than " + guess);
                } else if(guess < randomNum3) { 
                    System.out.println("Incorrect! The number is greater than " + guess);
                }
            }
            System.out.println("No more attempts, You lost Sorry!");
            break;
        }
    }
}

