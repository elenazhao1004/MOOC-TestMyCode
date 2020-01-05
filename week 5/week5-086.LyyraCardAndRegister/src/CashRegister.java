
public class CashRegister {

    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;
    private final double eco = 2.5;
    private final double gou = 4.0;

    public CashRegister() {
        this.cashInRegister = 1000;// at start the register has 1000 euros 
        //this.economicalSold = 0; // optional
        //this.gourmetSold = 0;
    }

    public double payEconomical(double cashGiven) {
        if(cashGiven < eco){
            return cashGiven;
        }    
        cashInRegister += eco;
        economicalSold++;
        return cashGiven-eco;
    }

    public double payGourmet(double cashGiven) {
        if(cashGiven < gou){
            return cashGiven;
        }    
        cashInRegister += gou;
        gourmetSold++;
        return cashGiven-gou;
    }


    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }
    
    public boolean payEconomical(LyyraCard card){
        if(card.balance() < eco){
            return false;
        }    
        economicalSold++;
        card.pay(eco);;
        return true;
    }
    public boolean payGourmet(LyyraCard card){
        if(card.balance() < gou){
            return false;
        }    
        gourmetSold++;
        card.pay(gou);
        return true;
    }
    
    public void loadMoneyToCard(LyyraCard card, double sum){
        if(sum < 0)
            return;
        card.loadMoney(sum);
        cashInRegister += sum;
        
    }
}
