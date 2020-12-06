import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Greeting {


    private boolean mistakeCheckerScannerIsGoodChoice;
    private boolean mistakeChecker;

    private void greeting() throws InterruptedException {
        String aboutMe = "Hi! I'm Kuba and I just started learn Java. It's my second game, so please be understanding :)";
        String welcomeToTheGameText = "                       --- Welcome in Sudoku game! ---";
        String mistakeCheckerText = "Do you want automatically mistake's verification (Y/N)";

        System.out.println("\n" + aboutMe);
        TimeUnit.SECONDS.sleep(3);
        System.out.println("\n" + welcomeToTheGameText + "\n");
        TimeUnit.SECONDS.sleep(2);
        System.out.println(mistakeCheckerText);

        while (!mistakeCheckerScannerIsGoodChoice) {
            mistakeChecker();
        }
    }

    private void mistakeChecker() {
        String wrongChoiceMistakeChecker = "Wrong choice. Please chose ones more";

        Scanner mistakeCheckerScanner = new Scanner(System.in);
        String mistakeCheckerChoice = mistakeCheckerScanner.nextLine().toLowerCase();

        switch (mistakeCheckerChoice) {
            case "y":
                mistakeChecker = true;
                mistakeCheckerScannerIsGoodChoice = true;
                break;
            case "n":
                mistakeChecker = false;
                mistakeCheckerScannerIsGoodChoice = true;
                break;
            default:
                System.out.println(wrongChoiceMistakeChecker);
                break;
        }
    }

    public void getGreeting() throws InterruptedException {
        greeting();
    }

    public final boolean getMistakeChecker(){
        return mistakeChecker;
    }
}