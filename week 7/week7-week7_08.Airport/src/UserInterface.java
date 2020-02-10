


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jing
 */
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    private Scanner reader;
    private Plane planes;
    private ArrayList<Flight> flights;

    public UserInterface(Scanner reader, Plane planes, ArrayList<Flight> flights) {//别忘写数据类型
        this.reader = reader;
        this.planes = planes;
        this.flights = flights;
    }

    public void start() {
        System.out.println("Airport panel\n"
                + "--------------------");

        while (true) {
            printPanel1();
            String command = "";
            while (command.isEmpty()) {
                command = reader.nextLine();//以防读空
            }
            if (command.equals("x")) {
                System.out.println("");
                break;
            }
            handleCommand1(command);
            System.out.println("");
        }

        System.out.println("Flight service\n"
                + "------------");

        while (true) {
            printPanel2();
            String command = "";
            while (command.isEmpty()) {
                command = reader.nextLine();
            }
            if (command.equals("x")) {
                System.out.println("");
                break;
            }
            handleCommand2(command);
            System.out.println("");
        }

    }

    public void handleCommand1(String command) {
        if (command.equals("1")) {
            System.out.print("Give plane ID: ");
            String planeID = reader.nextLine();
            System.out.print("Give plane capacity: ");
            int capacity = reader.nextInt();
            planes.addPlane(planeID, capacity);
        } else if (command.equals("2")) {
            System.out.print("Give plane ID: ");
            String planeID = reader.nextLine();
            System.out.print("Give departure airport code: ");
            String depart = reader.nextLine();
            System.out.print("Give destination airport code: ");
            String dest = reader.nextLine();
            
            Flight flight = new Flight(planes.getInfo(planeID), depart,dest);
            flights.add(flight);
        }
    }
    
    public void handleCommand2(String command) {
        if(command.equals("1")) {
            ArrayList<String> lists = planes.printList();
            for(String list : lists){
                System.out.println(list);
            }
        }else if (command.equals("2")) {
            for(Flight list : flights){
                System.out.println(list);
            }
            
        }else if (command.equals("3")) {
            System.out.print("Give plane ID: ");
            String planeID = reader.nextLine();
            System.out.println(planes.getInfo(planeID));
        }
    }

    public void printPanel1() {
        System.out.print("Choose operation:\n"
                + "[1] Add airplane\n"
                + "[2] Add flight\n"
                + "[x] Exit\n"
                + "> ");
    }
    
    public void printPanel2() {
        System.out.print("Choose operation:\n"
                + "[1] Print planes\n"
                + "[2] Print flights\n"
                + "[3] Print plane info\n"
                + "[x] Quit\n"
                + "> ");
    }
}
