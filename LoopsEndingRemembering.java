import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type numbrs: ");
        int sum = 0;
        int count = 0;
        int evenCount = 0;
        int oddCount = 0;
        
        while(true){
            int num = reader.nextInt();
            if(num == -1){
                break;
            }
            sum += num;
            count++;
            if(num % 2 == 0){
                evenCount++;
            }else{
                oddCount++;
            }
        }
        System.out.println("Thank you and see you later!");
        System.out.print("The sum is "+sum+"\n");
        System.out.print("How many numbers: "+count+"\n");
        System.out.print("Average: "+ (double)sum/count+"\n");
        System.out.print("Even numbers: "+ evenCount+"\n");
        System.out.print("Odd numbers: "+ oddCount +"\n");

    }
}


