public class SudokuTheGame {

    public static void main(String[] args) throws InterruptedException {
        Greeting greeting = new Greeting();
        greeting.getGreeting();
        // System.out.println("control: mistake checker = " + greeting.getMistakeChecker());

        Difficulty difficulty = new Difficulty();
        difficulty.getDifficulty();
        // System.out.println("control: difficulty checker = " + difficulty.getDifficultyLevel());

        Areas initialArea = new Areas();
        initialArea.getEmptyArea();



        AddNumbers addNumber = new AddNumbers();
        addNumber.addNumberToArea();

    }
}
