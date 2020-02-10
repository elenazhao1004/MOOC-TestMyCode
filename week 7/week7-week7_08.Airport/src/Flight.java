/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jing
 */
//import java.util.ArrayList;
public class Flight {
    private final String planeInfo;
    private final String depart;
    private final String dest;
    
    public Flight(String planeInfo, String depart, String dest){
        this.planeInfo = planeInfo;
        this.depart = depart;
        this.dest = dest;
    }
    
    
    public String toString(){
        return planeInfo + " (" + depart + "-" + dest + ")";
    }
    
}
