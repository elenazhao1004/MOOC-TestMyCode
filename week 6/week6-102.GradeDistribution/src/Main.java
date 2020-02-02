
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int[] grade = new int[6];
        int total = 0;
        
        System.out.println("Type exam scores, -1 completes:");
        while (true) {
            int score = reader.nextInt();
            //System.out.println(score);
            
            if (score >0 && score < 30) {
                grade[0]++;
            }
            if (score > 29 && score < 35) {
                grade[1]++;
            }
            if (score > 34 && score < 40) {
                grade[2]++;
            }
            if (score > 39 && score < 45) {
                grade[3]++;
            }
            if (score > 44 && score < 50) {
                grade[4]++;
            }
            if (score > 49 && score < 61) {
                grade[5]++;
            }
            if (score == -1){
                break;
            }
        }
        
        System.out.println("Grade distribution:");
        for (int i = 5; i > -1; i--) {
            System.out.print(i + ": ");
            for (int j = 0; j < grade[i]; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int g : grade) {
            total += g;
        }
        int pass = total - grade[0];
        double acceptance = (double) pass / total;
        System.out.println("Acceptance percentage: " + acceptance*100);
    }
}
