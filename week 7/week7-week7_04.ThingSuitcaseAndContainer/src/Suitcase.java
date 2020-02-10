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

public class Suitcase {

    private final int weightLimit;
    private ArrayList<Thing> things; //as global variable

    public Suitcase(int weightLimit) {
        this.weightLimit = weightLimit;
        this.things = new ArrayList<Thing>();
    }

    public int totalWeight() {
        int total = 0;

        for (Thing i : this.things) {
            total += i.getWeight();
        }
        return total;
    }

    public void addThing(Thing thing) {
        if ((totalWeight() + thing.getWeight()) <= weightLimit) {
            things.add(thing);
        }
    }
    public String toString(){
        if(things.size() == 0){
            return "empty (0 kg)";
        }else if(things.size() == 1){
            return "1 thing ("+ totalWeight() +"kg)";
        }
        return things.size() + " things ("+ totalWeight() +"kg)";
    }
    
    public void printThings(){
        for(Thing i : things){
            System.out.println(i);
        }                          
    }
    
    public Thing heaviestThing(){
        if(things.size() == 0){
            return null;
        }
        
        int heaviest = things.get(0).getWeight();
        Thing target = null;
        for(Thing i : things){
            if(i.getWeight() > heaviest){
                heaviest = i.getWeight();
                target = i;// 不能在这里直接return i;还在loop中
            }
        }
        return target;
    }
    
}
