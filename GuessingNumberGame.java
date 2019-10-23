
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();
        int numberGuessed = 0;
        int count = 0;
        
        while(numberGuessed != numberDrawn){
            System.out.print("Guess a number: ");
            numberGuessed = reader.nextInt();
            if (numberGuessed > numberDrawn) {
                System.out.print("The number is lesser, ");
            } else if (numberGuessed < numberDrawn) {
                System.out.print("The number is greater, ");
            } else {
                System.out.println("Congratulations, your guess is correct!");
            }
            count++; // Tip!!! count++(or ++count)先写， 不要在赋值语句里写
                     //（比如initialize var/sout, 不然count++的值有问题， count++ => 0, 而不是1）。
                     //int count = 0;
                     //count++/++count  => (count always =1);
                     //result = count++ => result = 0;(count = 0 先赋值给result, 然后count自己再+1);
                     //result = ++count => result = 1;(count自己先+1， 然后再赋值给result);
            System.out.print("guesses made: " + count +"\n");
        }      
    }
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
