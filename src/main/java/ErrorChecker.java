import java.util.HashSet;
import java.util.Set;

public class ErrorChecker {

    public boolean everythingIsGood;

    String illegalMovement = "Illegal movement. Please select the number again";

    public void errorChecker(boolean errorChecking, int lineNumber, int columnNumber, int[][] area) {
        if (errorChecking) {
            if (checkLine(lineNumber, area) && checkColumn(columnNumber, area) && checkSquare(lineNumber, columnNumber, area)) {
                everythingIsGood = true;
            } else {
                System.out.println(illegalMovement);
            }
        }
    }

    private boolean checkLine(int line, int[][] area) {
        int amountOfEmptySpaces = 0;

        HashSet lineSet = new HashSet();
        for (int i = 0; i < 9; i++) {
            if (area[line][i] == 0) {
                amountOfEmptySpaces++;
            } else {
                lineSet.add(i);
            }
        }
        return amountOfEmptySpaces + lineSet.size() == 9;
    }

    private boolean checkColumn(int column, int[][] area) {
        int amountOfEmptySpaces = 0;

        Set<Integer> columnSet = new HashSet();
        for (int i = 0; i < 9; i++) {
            if (area[i][column] == 0) {
                amountOfEmptySpaces++;
            } else {
                columnSet.add(i);
            }
        }
        return amountOfEmptySpaces + columnSet.size() == 9;
    }

    public boolean checkSquare(int line, int column, int[][] area) { // TODO każdy ruch wykrywa jako nielegalny. prawdopodobnie cos ze sprawdzaniem kwadratow
        int firstLineNumber;
        int firstColumnNumber;
        int amountOfEmptySpaces = 0;

        Set<Integer> squareSet = new HashSet();
        if (line < 3) {
            firstLineNumber = 0;
        } else if (line > 2 && line < 6) {
            firstLineNumber = 3;
        } else {
            firstLineNumber = 6;
        }
        if (column < 3) {
            firstColumnNumber = 0;
        } else if (line > 2 && line < 6) {
            firstColumnNumber = 3;
        } else {
            firstColumnNumber = 6;
        }
        for (int i = firstLineNumber; i == 2 || i == 5 || i == 8; i++) {
            for (int j = firstColumnNumber; i == 2 || i == 5 || i == 8; j++) {
                if (area[i][j] == 0) {
                    amountOfEmptySpaces++;
                } else {
                    squareSet.add(area[i][j]);
                }
            }
        }
        return amountOfEmptySpaces + squareSet.size() == 9;

    }
}
