import java.util.InputMismatchException;
import java.util.Scanner;

public class AddNumbers {
    int columnNumber;
    int lineNumber;
    int userNumber;

    boolean isGoodChoiceColumnNumber;
    boolean isGoodChoiceLineNumber;
    boolean isAreaEmpty;
    boolean isGoodChoiceNumber;

    String wrongChoice = "Wrong choice. Please enter ones more";
    String areaIsNotEmpty = "Your pole is't empty. Please choose other coordinates.";

    int[][] area = Areas.getArea();

    int rounds;

    void howManyRounds() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (area[i][j] == 0) {
                    rounds++;
                }
            }
        }
    }

    void addNumberToArea() {
        howManyRounds();
        for (int i = 0; i < rounds; i++) {
            addNumberIfIsCorrect();
            area[lineNumber][columnNumber] = userNumber;

            Areas.printArea();
        }
    }

    private void addNumberIfIsCorrect() {
        while (!isAreaEmpty) { // TODO sprawdzić czemu niektóre pola oznacza jako zajęte skoro są puste
            while (!isGoodChoiceColumnNumber) {
                addColumnNumber();
            }
            while (!isGoodChoiceLineNumber) {
                addLineNumber();
            }
            if (area[columnNumber][lineNumber] == 0) {
                isAreaEmpty = true;
                isGoodChoiceColumnNumber = false;
                isGoodChoiceLineNumber = false;
            } else {
                isGoodChoiceColumnNumber = false;
                isGoodChoiceLineNumber = false;
                System.out.println(areaIsNotEmpty);
            }
        }
        while (!isGoodChoiceNumber) {
            addNumber();
            isAreaEmpty = false;
        }
        isGoodChoiceNumber = false;
    }

    private void addColumnNumber() {
        Scanner addNumber = new Scanner(System.in);
        try {
            System.out.print("Column: ");
            int number = addNumber.nextInt();

            if (number >= 0 && number < 9) {
                isGoodChoiceColumnNumber = true;
                columnNumber = number;
            } else {
                System.out.println(wrongChoice);
            }
        } catch (InputMismatchException e) {
            System.out.println(wrongChoice);
        }
    }

    private void addLineNumber() {
        Scanner addNumber = new Scanner(System.in);

        try {
            System.out.print("Line: ");
            int number = addNumber.nextInt();

            if (number >= 0 && number < 9) {
                isGoodChoiceLineNumber = true;
                lineNumber = number;
            } else {
                System.out.println(wrongChoice);
            }
        } catch (
                InputMismatchException e) {
            System.out.println(wrongChoice);
        }
    }

    private void addNumber() {
        Scanner addNumber = new Scanner(System.in);

        try {
            System.out.print("Number: ");
            int number = addNumber.nextInt();

            if (number > 0 && number < 10) {
                isGoodChoiceNumber = true;
                userNumber = number;
            } else {
                System.out.println(wrongChoice);
            }
        } catch (InputMismatchException e) {
            System.out.println(wrongChoice);
        }
    }

}
