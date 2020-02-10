/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jing
 */
public class Calculator {

    private Reader reader;
    private int time = 0;//位置放哪里？？while loop外

    public Calculator() {
        this.reader = new Reader();
    }

    public void start() {
        while (true) {
            System.out.print("command: ");
            String command = reader.readString();
            //time++; 不能放这里
            if (command.equals("end")) {
                break;
            }
            if (command.equals("sum")) {
                time++;
                sum();
            } else if (command.equals("difference")) {
                time++;
                difference();
            } else if (command.equals("product")) {
                time++;
                product();
            }
        }
        statistics();
    }

    private void sum() {
        System.out.print("value1: ");
        int value1 = reader.readInteger();
        System.out.print("value2: ");
        int value2 = reader.readInteger();
        int result = value1 + value2;
        System.out.println("sum of the values " + result);
        System.out.println("");
    }

    private void difference() {
        System.out.print("value1: ");
        int value1 = reader.readInteger();
        System.out.print("value2: ");
        int value2 = reader.readInteger();
        int result = value1 - value2;
        System.out.println("difference of the values " + result);
        System.out.println("");

    }

    private void product() {
        System.out.print("value1: ");
        int value1 = reader.readInteger();
        System.out.print("value2: ");
        int value2 = reader.readInteger();
        int result = value1 * value2;
        System.out.println("product of the values " + result);
        System.out.println("");

    }

    private void statistics() {
        System.out.println("Calculations done " + time);

    }

}
