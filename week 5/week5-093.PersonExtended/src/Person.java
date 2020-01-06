
import java.util.Calendar;

public class Person {

    private String name;
    private MyDate birthday;
    private MyDate today;

    public Person(String name, int pp, int kk, int vv) {
        this.name = name;
        this.birthday = new MyDate(pp, kk, vv);
    }
    
    public Person(String name, MyDate birthday){
        this.name = name;
        this.birthday = birthday;
    }
    
    public Person(String name){
        this.name = name;
        int todayDate = Calendar.getInstance().get(Calendar.DATE);
        int todayMonth = Calendar.getInstance().get(Calendar.MONTH) + 1; // January is 0 so we add one
        int todayYear = Calendar.getInstance().get(Calendar.YEAR);
        this.today = new MyDate(todayDate, todayMonth, todayYear);
        this.birthday = today;
    }

    public int age() {
// calculate the age based on the birthday and the current day
        // you get the current day as follows: 
        int todayDate = Calendar.getInstance().get(Calendar.DATE);
        int todayMonth = Calendar.getInstance().get(Calendar.MONTH) + 1; // January is 0 so we add one
        int todayYear = Calendar.getInstance().get(Calendar.YEAR);
        this.today = new MyDate(todayDate, todayMonth, todayYear);
        int age = today.differenceInYears(birthday);

        return age;
    }

    public boolean olderThan(Person compared) {
        return this.birthday.earlier(compared.birthday);   
    }


    public String getName() {
        return this.name;
    }

    public String toString() {
        return this.name + ", born " + this.birthday;
    }
}
