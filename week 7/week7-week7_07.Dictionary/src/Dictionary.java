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

public class Dictionary {
    private HashMap<String, String> dictionaries;
    
    public Dictionary(){
        dictionaries = new HashMap<String, String>();
    }
    
    public void add(String word, String translation){
        this.dictionaries.put(word, translation);
    }
    
    public String translate(String word){
        if(dictionaries.containsKey(word)){
            return dictionaries.get(word);
        }
        return null;
    }
    
    public int amountOfWords(){
        return dictionaries.size();
    }
    
    public ArrayList<String> translationList(){
        ArrayList<String> result = new ArrayList<String>();//不可以result =null
        for(String key : dictionaries.keySet()){
            result.add(key + " = " + dictionaries.get(key));
        }
        return result;
    }
}
