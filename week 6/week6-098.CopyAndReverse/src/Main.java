
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4};
        int[] copied = copy(original);
        int[] reverse = reverseCopy(original);

        // print both
        System.out.println("original: " + Arrays.toString(original));
        System.out.println("reversed: " + Arrays.toString(reverse));

        // change the copied
        copied[0] = 99;

        // print both
        System.out.println("original: " + Arrays.toString(original));
        System.out.println("copied: " + Arrays.toString(copied));
    }

    public static int[] copy(int[] array) {
        //int[] copied = array; 
        //不能直接赋值！！output应该是 original: [1, 2, 3, 4]，却变成 original: [99, 2, 3, 4]
        int[] copied = new int[array.length];
        for(int i = 0; i < array.length; i++){
            copied[i] = array[i];
        }
        return copied;
    }

    public static int[] reverseCopy(int[] array) {
        int[] reverse = new int[array.length];
        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            reverse[j] = array[i];
            j++; // ⚠️注意： 这里不能用嵌套j的for loop 
        }
        return reverse ;
    }
    
}


