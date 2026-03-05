package hik23;

import java.util.Scanner;

public class StoneScissorsPaperGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Game game = new Game();

        while (true) {
            System.out.println("Enter your choice (stone/scissors/paper):");
            String userChoice = scanner.nextLine().toLowerCase();

            if (userChoice.equals("exit")) {
                break;
            }

            int computerChoice = game.getRandomComputerChoice();
            String computerChoiceString = game.getComputerChoiceString(computerChoice);

            int gameResult = game.getGameResult(userChoice, computerChoice);
            String gameResultString = game.getGameResultString(gameResult);

            System.out.println("You chose: " + userChoice);
            System.out.println("Computer chose: " + computerChoiceString);
            System.out.println("Game result: " + gameResultString);

            System.out.println("Do you want to continue? (yes/no):");
            String continueChoice = scanner.nextLine().toLowerCase();

            if (!continueChoice.equals("yes")) {
                break;
            }
        }

        scanner.close();
    }
}

