import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] values = {8, 3, 7, 9, 1, 2, 4};
        sort(values);
    }

    public static int smallest(int[] array) {
        int small = array[0];
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] < small) {
                small = array[i];
            }
        }
        return small;
    }

    public static int indexOfTheSmallest(int[] array) {
        int small = smallest(array);
        int idx = 0;
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] == small) {
                idx = i;
            }
        }
        return idx;
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        int idx = index;
      //int small = array[idx];
        
        for(int i = index; i < array.length; i++){
            if(array[i] < array[idx]){
                idx = i;
            }
        }
        return idx;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        int buffer = array[index1];
        array[index1] = array[index2];
        array[index2] = buffer;
    }
    
    public static void sort(int[] array) {
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length-1; i++) {
            int small_idx = indexOfTheSmallestStartingFrom(array,i);
            swap(array,small_idx,i);
            System.out.println(Arrays.toString(array));

        }
    }

}
