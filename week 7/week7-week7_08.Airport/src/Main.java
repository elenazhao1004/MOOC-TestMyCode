
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Plane planes = new Plane();
        ArrayList<Flight> flights = new ArrayList<Flight>();
        
        UserInterface ui = new UserInterface(reader, planes, flights);
        ui.start();
        
    }
}
