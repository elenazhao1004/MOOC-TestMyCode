
import java.util.Scanner;

public class Accounts {

    public static void main(String[] args) {
        Account jingAccount = new Account("Jing's account", 100);
       
        
        System.out.println("\nInitial state");
        System.out.println(jingAccount);
        
        jingAccount.deposit(20);
        
        System.out.println("\nFinal state");
        System.out.println(jingAccount);
        
        
        
    }

}
