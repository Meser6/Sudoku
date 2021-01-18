import java.util.concurrent.TimeUnit;

public class Areas {

    private static int[][] area = new int[9][9];

    private static void emptyAreaWithDifficulty() {
    AreaGenerator.areaGenerator(Difficulty.getDifficultyLevel(), area);
    }

    private static void emptyArea() throws InterruptedException {
        String instructionUpperArea = "It's your game area:";
        String instructionDownerArea = "Please enter coordinates. \nAt first number of column, next number of line." +
                "After that you can add your number.";

        emptyAreaWithDifficulty();

        System.out.println(instructionUpperArea);
        printArea();
        TimeUnit.SECONDS.sleep(1);
        System.out.println(instructionDownerArea);
    }


    public static void printArea(){
        for (int i = 0; i < 9; i++) {
            if (i == 0) {
                System.out.println("    0 1 2   3 4 5   6 7 8");
                System.out.println("    _____   _____   _____");
            }
            if (i % 3 == 0 && i != 0) {
                System.out.println("    _____   _____   _____");
            }
            for (int j = 0; j < 9; j++) {
                if (j == 0) {
                    System.out.print(i + " ");
                }
                if (j % 3 == 0)
                    System.out.print("| ");
                if (area[i][j] == 0) {
                    System.out.print("  ");
                    continue;
                }
                System.out.print(area[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] getArea() {
        return area;
    }

    public void getEmptyArea() throws InterruptedException {
        emptyArea();
    }
}
