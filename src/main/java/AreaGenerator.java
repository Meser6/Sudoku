import java.util.Random;

public class AreaGenerator {


    public static void areaGenerator(int difficultyLevel, int[][] area) {
        // TODO petla wykonuje ruch w przypadku gdy bedzie probowala wrzucic do zajetego pola
        Random random = new Random();
        ErrorChecker errorChecker = new ErrorChecker();

        int randomLine;
        int randomColumn;
        int randomNumber;

        for (int i = 0; i < difficultyLevel + 1; i++) {
            while (!errorChecker.isEverythingIsGoodInAreasGenerator) {
                randomLine = random.nextInt(9);
                randomColumn = random.nextInt(9);
                randomNumber = random.nextInt(9) + 1;
                errorChecker.errorCheckerInAreasGenerator(randomLine, randomColumn, randomNumber, area);
                if (errorChecker.isEverythingIsGoodInAreasGenerator) {
                    area[randomLine][randomColumn] = randomNumber;
                }
            }
            errorChecker.isEverythingIsGoodInAreasGenerator = false;
        }
    }
}
