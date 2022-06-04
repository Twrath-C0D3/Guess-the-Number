package guessthenumber;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        Random rando = new Random();

        String name = "";
        final int maxCount = 6;
        String cont = "Y";

        while( cont.equalsIgnoreCase("Y"))
            {
                System.out.println("Hello! What is your name?");
                if(scanner.hasNextLine())
                    {
                    name = scanner.nextLine();
                    }
                System.out.println("Well, " + name + " I am thinking of a number between 1 and 20.");
                int randomNum = rando.nextInt(20) + 1;
                int guessCount=0;
                boolean won = false;
                while (guessCount < maxCount) {
                    System.out.println("Take a guess.");
                    int guess = scanner.nextInt();
                    scanner.nextLine();
                    guessCount++;
                    if(guess == randomNum)
                    {
                        System.out.println("Congratulations, " + name + "! You guessed my number in " + guessCount + " guesses!");
                        won = true;
                        break;
                    }
                    if (guess < randomNum)
                    {
                        System.out.println("Your guess is too low!");
                    }
                    if (guess > randomNum)
                    {
                        System.out.println("Your guess is too high!");
                    }
                }

                if (!won)
                {
                      System.out.println("Too many guesses, You suck!");

                }

                System.out.println("Do you want to play again? [Y/N]");
                cont = scanner.nextLine();
            }

        System.out.println("Thanks for playing!");

    }


}
