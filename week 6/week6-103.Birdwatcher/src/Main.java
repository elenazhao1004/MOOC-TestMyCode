import java.util.Scanner;
import java.util.ArrayList;

public class Main {  
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<Bird> birds = new ArrayList<Bird>();
        
        while(true){
            System.out.print("?");
            String command = reader.nextLine();
            
            if(command.equals("Add")){
                System.out.print("Name: ");
                String name = reader.nextLine();
                System.out.print("Latin Name: ");
                String LatinName = reader.nextLine();
                Bird buffer = new Bird(name, LatinName);
                birds.add(buffer);
            }
            
            if(command.equals("Observation")){
                System.out.print("What was observed:? ");
                String name = reader.nextLine();
                
                for(Bird bird : birds){
                    if(bird.getName().equals(name)){
                        bird.Observed();
                    }else{
                        System.out.println("Is not a bird!");
                    }
                }
            }
            
            if(command.equals("Statistics")){
                for(Bird bird : birds){
                    System.out.println(bird);
                }
            }
            
            if(command.equals("Show")){
                System.out.print("What?");
                String name = reader.nextLine();
                for(Bird bird : birds){
                    if(bird.getName().equals(name)){
                        System.out.println(bird);
                    }
                }
            }
            
            if (command.equals("Quit")){
                break;
            }  
        }
    }
}
