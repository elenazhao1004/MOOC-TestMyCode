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

public class Changer {
    private ArrayList<Change> changes;
    
    public Changer(){
        this.changes = new ArrayList<Change>();
    }
    
    public void addChange(Change change){
        changes.add(change);
    }
    
    public String change(String characterString){
        //String replacement = "";// += 的方法不对
        for(Change Chan : changes){
            characterString = Chan.change(characterString); 
      // characterString与括号里名字一定要一致， 因为在for循环中，不能用replacement +=方法
        }
        return characterString;
    }
    
}
