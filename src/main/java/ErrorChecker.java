import java.util.HashSet;
import java.util.Set;

public class ErrorChecker {

    public boolean everythingIsGood;
    public boolean isEverythingIsGoodInAreasGenerator;

    String illegalMovement = "Illegal movement. Please select the number again";

    public void errorCheckerInGame(boolean errorChecking, int lineNumber, int columnNumber, int userNumber, int[][] area) {
        if (errorChecking) {
            if (checkLine(lineNumber, columnNumber, userNumber, area)
                    && checkColumn(lineNumber, columnNumber, userNumber, area)
                    && checkSquare(lineNumber, columnNumber, userNumber, area)) {
                everythingIsGood = true;
            } else {
                System.out.println(illegalMovement);
            }
        }
    }

    public void errorCheckerInAreasGenerator(int lineNumber, int columnNumber, int number, int[][] area) {
        if (checkLine(lineNumber, columnNumber, number, area)
                && checkColumn(lineNumber, columnNumber, number, area)
                && checkSquare(lineNumber, columnNumber, number, area)
                && checkIsEmpty(lineNumber, columnNumber, area)) {
            isEverythingIsGoodInAreasGenerator = true;
        }
    }

    private boolean checkIsEmpty(int lineNumber, int columnNumber, int[][] area) {
        return area[lineNumber][columnNumber] == 0;

    }

    private boolean checkLine(int line, int column, int number, int[][] area) {
        area[line][column] = number;
        int amountOfEmptySpaces = 0;

        Set<Integer> lineSet = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            if (area[line][i] == 0) {
                amountOfEmptySpaces++;
            } else {
                lineSet.add(area[line][i]);
            }
        }
        area[line][column] = 0;
        return amountOfEmptySpaces + lineSet.size() == 9;
    }

    private boolean checkColumn(int line, int column, int number, int[][] area) {
        area[line][column] = number;
        int amountOfEmptySpaces = 0;

        Set<Integer> columnSet = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            if (area[i][column] == 0) {
                amountOfEmptySpaces++;
            } else {
                columnSet.add(area[i][column]);
            }
        }
        area[line][column] = 0;
        return amountOfEmptySpaces + columnSet.size() == 9;
    }

    private boolean checkSquare(int line, int column, int number, int[][] area) {
        area[line][column] = number;
        int firstLineNumber;
        int firstColumnNumber;
        int lastLineNumber;
        int lastColumnNumber;
        int amountOfEmptySpaces = 0;

        Set<Integer> squareSet = new HashSet<>();
        if (line < 3) {
            firstLineNumber = 0;
            lastLineNumber = 2;
        } else if (line < 6) {
            firstLineNumber = 3;
            lastLineNumber = 5;
        } else {
            firstLineNumber = 6;
            lastLineNumber = 8;
        }
        if (column < 3) {
            firstColumnNumber = 0;
            lastColumnNumber = 2;
        } else if (column < 6) {
            firstColumnNumber = 3;
            lastColumnNumber = 5;
        } else {
            firstColumnNumber = 6;
            lastColumnNumber = 8;
        }
        for (int i = firstLineNumber; i < lastLineNumber + 1; i++) {
            for (int j = firstColumnNumber; j < lastColumnNumber + 1; j++) {
                if (area[i][j] == 0) {
                    amountOfEmptySpaces++;
                } else {
                    squareSet.add(area[i][j]);
                }
            }
        }
        area[line][column] = 0;
        return amountOfEmptySpaces + squareSet.size() == 9;
    }
}
