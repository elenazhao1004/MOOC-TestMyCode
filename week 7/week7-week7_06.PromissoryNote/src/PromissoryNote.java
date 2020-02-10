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

public class PromissoryNote {

    private HashMap<String, Double> notes;

    public PromissoryNote() {
        notes = new HashMap<String, Double>();
    }

    public void setLoan(String toWhom, double value) {
        notes.put(toWhom, value);
    }

    public double howMuchIsTheDebt(String whose) {
        if (this.notes.containsKey(whose)) {
            return notes.get(whose);
        }
        return 0;
    }
}
