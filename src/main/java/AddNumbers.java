import java.util.InputMismatchException;
import java.util.Scanner;

public class AddNumbers {
    int columnNumber;
    int lineNumber;
    int userNumber;

    boolean isGoodChoiceColumnNumber;
    boolean isGoodChoiceLineNumber;
    boolean isGoodChoiceNumber;

    String wrongChoice = "Wrong choice. Please enter ones more";

    int[][] area = Areas.getArea();


    void addNumberToArea() {
        for (int i = 0; i < 20; i++) { // TODO zmienic ta petle bo jest improwizowana
            addNumberIfIsCorrect();
            area[columnNumber][lineNumber] = userNumber;

            Areas.printArea();
        }
    }

    private void addNumberIfIsCorrect() {
        while (!isGoodChoiceColumnNumber) {
            addColumnNumber();
        }
        while (!isGoodChoiceLineNumber) {
            addLineNumber();
        }
   // TODO sprawdzic czy miejsce jest puste, jesli nie to wywolac dodawanie jezcze raz
        while (!isGoodChoiceNumber) {
            addNumber();
        }
        isGoodChoiceColumnNumber = false;
        isGoodChoiceLineNumber = false;
        isGoodChoiceNumber = false;
    }

    private void addColumnNumber() {
        Scanner addNumber = new Scanner(System.in);
        try {
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
