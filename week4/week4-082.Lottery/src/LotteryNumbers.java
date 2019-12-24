import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;
    private Random random = new Random();

    public LotteryNumbers() {
        // Draw numbers as LotteryNumbers is created
        this.drawNumbers();
        //this.numbers = new ArrayList<Integer>();//?
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        this.numbers = new ArrayList<Integer>();
        int i = 0;
        while (i < 7){
            int buffer = this.random.nextInt(39)+1;
            if(!this.containsNumber(buffer)){
                this.numbers.add(buffer);
                i++;
            }
        }
        
    }

    public boolean containsNumber(int number) {
        if(this.numbers.contains(number)){
            return true;
        }else{
            return false;
        }
    }
}
