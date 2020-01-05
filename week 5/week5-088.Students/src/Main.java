
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<Student>();
        String name;
        String studentNumber;
        String search;
        
        while(true){ //the student info has been entered 
            System.out.print("name: ");
            name = reader.nextLine();
            if(name.isEmpty()){
                break;
            }
            
            System.out.print("studentnumber: ");
            studentNumber = reader.nextLine();
            
            Student student1 = new Student(name, studentNumber);
            list.add(student1);
        }
        //students printed
        for (Student i : list){
            System.out.println(i.toString());
        }
        
        //search the student list based on a given search term
        System.out.print("Give search term: ");
        search = reader.nextLine();
        
        System.out.println("Result:");
        
        for(Student i : list){
            if(i.getName().contains(search)){
                System.out.println(i); // or System.out.println(i.toString());
            }
        }
        
    }
}
  