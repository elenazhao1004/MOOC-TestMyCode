import java.util.Scanner;

public class FirstCharacters {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = reader.nextLine();
        
        if ( name.length() < 3){
            return;
        }
        for(int i = 0; i < 3; i++){
            System.out.println((i+1) + ". chracter: " + name.charAt(i));
        }
    }
}
