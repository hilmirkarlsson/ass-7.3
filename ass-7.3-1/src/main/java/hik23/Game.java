package hik23;
class Game {
    private static final int STONE = 0;
    private static final int SCISSORS = 1;
    private static final int PAPER = 2;

    private static final String[] COMPUTER_CHOICES = {"stone", "scissors", "paper"};

    public int getRandomComputerChoice() {
        return (int) (Math.random() * 3);
    }

    public String getComputerChoiceString(int choice) {
        return COMPUTER_CHOICES[choice];
    }

    public int getGameResult(String userChoice, int computerChoice) {
        if (userChoice.equals("stone")) {
            if (computerChoice == STONE) {
                return 0; // Tie
            } else if (computerChoice == SCISSORS) {
                return 1; // User wins
            } else {
                return 2; // Computer wins
            }
        } else if (userChoice.equals("scissors")) {
            if (computerChoice == STONE) {
                return 2; // Computer wins
            } else if (computerChoice == SCISSORS) {
                return 0; // Tie
            } else {
                return 1; // User wins
            }
        } else if (userChoice.equals("paper")) {
            if (computerChoice == STONE) {
                return 1; // User wins
            } else if (computerChoice == SCISSORS) {
                return 2; // Computer wins
            } else {
                return 0; // Tie
            }
        } else {
            return -1; // Invalid choice
        }
    }

    public String getGameResultString(int result) {
        switch (result) {
            case 0:
                return "Tie";
            case 1:
                return "You win!";
            case 2:
                return "Computer wins!";
            default:
                return "Invalid choice";
        }
    }
}