import java.util.concurrent.TimeUnit;

public class Areas extends Difficulty {

    private static int[][] area = new int[9][9];

    private static void emptyAreaWithDifficulty() {
        if (getDifficultyLevel() == 1) {
            emptyAreaEasyLevel();
        } else if (getDifficultyLevel() == 2) {
            emptyAreaMediumLevel();
        } else if (getDifficultyLevel() == 3) {
            emptyAreaHardLevel();
        } else if (getDifficultyLevel() == 4) {
            emptyAreaVeryHardLevel();
        }
    }

    private static void emptyArea() throws InterruptedException {
        String instructionUpperArea = "It's your game area:";
        String instructionDownerArea = "Please enter coordinates. \nAt first number of column, next number of line." +
                "After that you can add your number.";

        emptyAreaWithDifficulty();

        System.out.println(instructionUpperArea);
        System.out.println("   0 1 2   3 4 5   6 7 8\n"
                + "0  " + area[0][0] + " " + area[0][1] + " " + area[0][2] + " | "
                + area[0][3] + " " + area[0][4] + " " + area[0][5] + " | "
                + area[0][6] + " " + area[0][7] + " " + area[0][8] + "\n"
                + "1  " + area[1][0] + " " + area[1][1] + " " + area[1][2] + " | "
                + area[1][3] + " " + area[1][4] + " " + area[1][5] + " | "
                + area[1][6] + " " + area[1][7] + " " + area[1][8] + "\n"
                + "2  " + area[2][0] + " " + area[2][1] + " " + area[2][2] + " | "
                + area[2][3] + " " + area[2][4] + " " + area[2][5] + " | "
                + area[2][6] + " " + area[2][7] + " " + area[2][8] + "\n" +
                "   ---------------------\n"
                + "3  " + area[3][0] + " " + area[3][1] + " " + area[3][2] + " | "
                + area[3][3] + " " + area[3][4] + " " + area[3][5] + " | "
                + area[3][6] + " " + area[3][7] + " " + area[3][8] + "\n"
                + "4  " + area[4][0] + " " + area[4][1] + " " + area[4][2] + " | "
                + area[4][3] + " " + area[4][4] + " " + area[4][5] + " | "
                + area[4][6] + " " + area[4][7] + " " + area[4][8] + "\n"
                + "5  " + area[5][0] + " " + area[5][1] + " " + area[5][2] + " | "
                + area[5][3] + " " + area[5][4] + " " + area[5][5] + " | "
                + area[5][6] + " " + area[5][7] + " " + area[5][8] + "\n" +
                "   ---------------------\n"
                + "6  " + area[6][0] + " " + area[6][1] + " " + area[6][2] + " | "
                + area[6][3] + " " + area[6][4] + " " + area[6][5] + " | "
                + area[6][6] + " " + area[6][7] + " " + area[6][8] + "\n"
                + "7  " + area[7][0] + " " + area[7][1] + " " + area[7][2] + " | "
                + area[7][3] + " " + area[7][4] + " " + area[7][5] + " | "
                + area[7][6] + " " + area[7][7] + " " + area[7][8] + "\n"
                + "8  " + area[8][0] + " " + area[8][1] + " " + area[8][2] + " | "
                + area[8][3] + " " + area[8][4] + " " + area[8][5] + " | "
                + area[8][6] + " " + area[8][7] + " " + area[8][8] + "\n");
        TimeUnit.SECONDS.sleep(3);
        System.out.println(instructionDownerArea);
    }


    protected static void emptyAreaEasyLevel() {
        area[0][1] = 8;
        area[0][2] = 3;
        area[0][5] = 2;
        area[0][6] = 4;
        area[0][7] = 1;
        area[1][0] = 2;
        area[1][2] = 4;
        area[1][5] = 5;
        area[2][1] = 1;
        area[2][4] = 4;
        area[2][7] = 2;
        area[2][8] = 8;
        area[3][0] = 3;
        area[3][3] = 4;
        area[3][4] = 9;
        area[3][6] = 1;
        area[3][7] = 5;
        area[4][2] = 7;
        area[4][4] = 1;
        area[4][8] = 6;
        area[5][0] = 9;
        area[5][3] = 7;
        area[5][4] = 5;
        area[5][5] = 3;
        area[5][7] = 8;
        area[6][0] = 8;
        area[6][1] = 4;
        area[6][6] = 6;
        area[7][0] = 5;
        area[7][4] = 4;
        area[7][7] = 3;
        area[7][8] = 1;
        area[8][0] = 1;
        area[8][1] = 3;
        area[8][2] = 6;
        area[8][4] = 2;
        area[8][6] = 5;
    }

    protected static void emptyAreaMediumLevel() {
        area[0][0] = 6;
        area[0][5] = 4;
        area[0][8] = 1;
        area[1][2] = 1;
        area[1][7] = 4;
        area[1][8] = 9;
        area[2][0] = 5;
        area[2][4] = 1;
        area[3][0] = 1;
        area[3][1] = 5;
        area[3][2] = 7;
        area[3][7] = 9;
        area[3][8] = 6;
        area[4][2] = 4;
        area[4][4] = 9;
        area[4][5] = 6;
        area[4][8] = 3;
        area[5][0] = 3;
        area[5][4] = 4;
        area[5][5] = 5;
        area[5][7] = 1;
        area[5][8] = 8;
        area[6][4] = 7;
        area[7][0] = 7;
        area[7][1] = 6;
        area[7][4] = 2;
        area[8][2] = 8;
        area[8][3] = 5;
        area[8][6] = 3;
        area[8][8] = 4;
    }

    protected static void emptyAreaHardLevel() {
        area[0][3] = 3;
        area[0][6] = 5;
        area[1][0] = 2;
        area[1][2] = 1;
        area[1][3] = 4;
        area[1][4] = 7;
        area[1][5] = 5;
        area[1][6] = 3;
        area[1][7] = 9;
        area[2][5] = 6;
        area[2][8] = 4;
        area[3][2] = 3;
        area[3][3] = 8;
        area[3][4] = 9;
        area[4][0] = 6;
        area[4][1] = 9;
        area[5][4] = 6;
        area[5][7] = 4;
        area[5][8] = 9;
        area[6][1] = 5;
        area[6][4] = 4;
        area[6][7] = 6;
        area[7][1] = 2;
        area[7][8] = 5;
        area[8][0] = 3;
        area[8][2] = 7;
        area[8][6] = 9;
        area[8][8] = 8;
    }

    protected static void emptyAreaVeryHardLevel() {
        area[0][4] = 9;
        area[0][7] = 1;
        area[1][0] = 2;
        area[1][7] = 5;
        area[2][0] = 6;
        area[2][1] = 8;
        area[3][1] = 6;
        area[3][3] = 4;
        area[3][6] = 1;
        area[3][8] = 3;
        area[4][3] = 9;
        area[4][5] = 5;
        area[4][6] = 8;
        area[5][0] = 1;
        area[5][2] = 7;
        area[5][8] = 4;
        area[6][3] = 8;
        area[6][6] = 4;
        area[7][3] = 3;
        area[7][8] = 6;
        area[8][0] = 4;
        area[8][4] = 5;
    }

    public int[][] getArea() {
        return area;
    }

    public void getEmptyArea() throws InterruptedException {
        emptyArea();
    }
}
