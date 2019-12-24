import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;


public class SmartCombining {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        Collections.addAll(list1, 4, 3);

        Collections.addAll(list2, 5, 10, 4, 3, 7);

        smartCombine(list1, list2);
        System.out.println(list1);
        System.out.println(list2);
    }
    public static void smartCombine(ArrayList<Integer> list1, ArrayList<Integer> list2){
        list1.addAll(list2);
        HashSet hs = new HashSet();
        
        hs.addAll(list1);
        list1.clear();
        list1.addAll(hs);
    }

}
