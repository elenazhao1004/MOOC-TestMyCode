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

public class Container {
    private ArrayList<Suitcase> suitcases;
    private int weightLimit;
    
    public Container(int weightLimit){
        this.suitcases = new ArrayList<Suitcase>();
        this.weightLimit = weightLimit;
    }
    
    public int totalWeight(){
        int total = 0;
        
        for(Suitcase i : suitcases){
            total += i.totalWeight();
        }
        return total;
    }
    
    public void addSuitcase(Suitcase suitcase){
        if((totalWeight()+ suitcase.totalWeight()) <= weightLimit){
            this.suitcases.add(suitcase);
        }
    }
    
    public String toString(){
        return suitcases.size() + " suitcases (" + totalWeight() + " kg)";
    }
    
    public void printThings(){
        for(Suitcase i : suitcases){
            i.printThings(); //suitcase的method: printThings()打印的是things
        }
    }
}
