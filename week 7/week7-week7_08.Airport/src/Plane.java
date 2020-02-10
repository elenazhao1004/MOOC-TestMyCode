/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jing
 */
import java.util.HashMap;
import java.util.ArrayList;
public class Plane {
    private HashMap<String, Integer> planes;
    
    public Plane(){
        this.planes = new HashMap<String, Integer>();
    }
    
    public void addPlane(String planeID, int capacity){
        this.planes.put(planeID, capacity);
    }
    
    public String getInfo(String planeID){
        return planeID + " (" + planes.get(planeID) + " ppl)";
    }
    
    public ArrayList<String> printList(){
        ArrayList<String> result = new ArrayList<String>();
        for(String key : planes.keySet()){
            result.add(key + " (" + planes.get(key) + " ppl)");//ArrayList用add, String用 +=
        }
        return result;
    }
}
