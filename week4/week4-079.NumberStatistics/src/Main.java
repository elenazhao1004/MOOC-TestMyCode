
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        NumberStatistics sum = new NumberStatistics();
        NumberStatistics even = new NumberStatistics();
        NumberStatistics odd = new NumberStatistics();
        
        Scanner reader = new Scanner(System.in);
        int num = 0;

        System.out.println("Type numbers: ");
        while (num != -1) {
            num = reader.nextInt();
            if (num == -1) {
                break;
            }
            sum.addNumber(num);
            if(num % 2 == 0){
                even.addNumber(num);
            }else{
                odd.addNumber(num);
            }
        }
        System.out.println("sum: " + sum.sum());
        System.out.println("sum of even: " + even.sum());
        System.out.println("sum of odd: " + odd.sum());

    }
}
