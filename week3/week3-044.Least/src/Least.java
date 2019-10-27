
public class Least {

    public static int least(int number1, int number2) {
        int leastNum = number1;
        if(number2 < number1){
            leastNum = number2;
        }else if( number1 == number2)
        {
            leastNum = number1;
        }
        return leastNum;
    }

    public static void main(String[] args) {
        int result = least(2, 7);
        System.out.println("Least: " + result);
    }
}
