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

public class Bird {

    private String name;
    private String LatinName;
    private int observation;

    public Bird(String name, String LatinName) {
        this.name = name;
        this.LatinName = LatinName;
        this.observation = 0;
    }

    public void Observed() {
        this.observation++;
    }

    public String getName() {
        return this.name;
    }
    
    public String toString(){
        return "\n"+this.name+" ("+this.LatinName+"): " + this.observation + " observations";
    }
}
