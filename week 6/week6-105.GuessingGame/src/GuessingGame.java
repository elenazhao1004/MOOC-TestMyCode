import java.util.Scanner;
public class GuessingGame {
    private Scanner reader;

    public GuessingGame() {
        this.reader = new Scanner(System.in);
    }

    public void play(int lowerLimit, int upperLimit) {
        instructions(lowerLimit, upperLimit);
        int times = howManyTimesHalvable(upperLimit - lowerLimit);
        while(true){ // 或者 for (int i = 0; i < times; i++) {
            int middle = average(lowerLimit, upperLimit);
            if(lowerLimit == upperLimit) {
                break;
            }
            if (isGreaterThan(middle)) {
                lowerLimit = middle + 1;
            } else {
                upperLimit = middle;
            }
        }
        System.out.println("The number you're thinking of is "+ lowerLimit);
    }

    public boolean isGreaterThan(int value) {
        System.out.println("Is your number greater than " + value + "? (y/n)");
        String answer = reader.nextLine();
        return answer.equals("y");
    }

    public int average(int firstNumber, int secondNumber) {
        int avg = (firstNumber + secondNumber) / 2;
        return avg;
    }

    public void instructions(int lowerLimit, int upperLimit) {
        int maxQuestions = howManyTimesHalvable(upperLimit - lowerLimit);

        System.out.println("Think of a number between " + lowerLimit + "..." + upperLimit + ".");

        System.out.println("I promise you that I can guess the number you are thinking with " + maxQuestions + " questions.");
        System.out.println("");
        System.out.println("Next I'll present you a series of questions. Answer them honestly.");
        System.out.println("");
    }

    public static int howManyTimesHalvable(int number) {
        return (int) (Math.log(number) / Math.log(2)) + 1;
    }
}
