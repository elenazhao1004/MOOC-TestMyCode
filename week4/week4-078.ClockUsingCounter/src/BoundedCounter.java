/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jing
 */
public class BoundedCounter {

    private int value;
    private int upperLimit;

    public BoundedCounter(int upperLimit) {
        this.upperLimit = upperLimit;
        this.value = 0;
    }

    public void next() {
        this.value++;
        if (this.value > upperLimit) {
            this.value = 0;
        }
    }

    @Override
    public String toString() {
        if (this.value < 10) {
            return String.format("0" + this.value);
        }else{
            return String.format("" + this.value);
        }
    }
    
    public int getValue(){
        return this.value;
    }
    
    public void setValue(int value){
        this.value = value;
        if (this.value < 0 || this.value > upperLimit){
            this.value = 0;
        }
    }
}
