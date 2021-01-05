import java.util.Scanner;

public class Difficulty {

    private static int difficultyLevel;

    private boolean difficultyLevelIsGoodChoice;

    private void difficulty() {
        String difficultyChecker = "How difficulty of game do You want? \n   E - easy, \n   M - medium \n   H - hard " +
                "\n   V - very hard";

        System.out.println(difficultyChecker);

        while (!difficultyLevelIsGoodChoice) {
            difficultyChecker();
        }
    }

    private void difficultyChecker() {
        String wrongChoiceDifficultyChecker = "Wrong choice. Please choice ones more";

        Scanner difficultyScanner = new Scanner(System.in);
        System.out.print("Difficulty: ");
        String userDifficultyLevel = difficultyScanner.nextLine().toLowerCase();

        switch (userDifficultyLevel) {
            case "e":
                difficultyLevel = 1;
                difficultyLevelIsGoodChoice = true;
                break;
            case "m":
                difficultyLevel = 2;
                difficultyLevelIsGoodChoice = true;
                break;
            case "h":
                difficultyLevel = 3;
                difficultyLevelIsGoodChoice = true;
                break;
            case "v":
                difficultyLevel = 4;
                difficultyLevelIsGoodChoice = true;
                break;
            default:
                System.out.println(wrongChoiceDifficultyChecker);
        }
    }

    public void getDifficulty() {
        difficulty();
    }

    public static int getDifficultyLevel() {
        return difficultyLevel;
    }
}

