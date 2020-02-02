
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {
        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }
        this.euros = euros;
        this.cents = cents;
    }
    public int euros() {
        return euros;
    }
    public int cents() {
        return cents;
    }
    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

    public Money plus(Money added) {
        Money sum = new Money(this.euros + added.euros, this.cents + added.cents); // better solution 综合起来步骤 
        return sum;
    }
    /* 分开步骤
        int centsAdd = this.cents() + added.cents();
        int eurosAdd = this.euros() + added.euros();
        
        Money sum = new Money(eurosAdd, centsAdd);
        return sum;
     */
    public boolean less(Money compared) {
        return (this.euros * 100 + this.cents()) < (compared.euros() * 100 + compared.cents()); // better solution

//return this.euros() < compared.euros() || (this.euros() == compared.euros() && this.cents() < compared.cents());   逻辑复杂了一些
    }

    public Money minus(Money decremented) {
        int buffer = (this.euros * 100 + this.cents()) - (decremented.euros() * 100 + decremented.cents()); // 不要忘了括号

        if (buffer < 0) {
            buffer = 0;
        }
        Money subtraction = new Money(buffer / 100, buffer % 100);
        return subtraction;
    }

}
