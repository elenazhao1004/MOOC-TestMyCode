public class BinarySearch {
    public static boolean search(int[] array, int searchedValue) {
        int beginning = 0;
        int end = array.length - 1;

        while (beginning <= end) {
            int middle = (beginning + end) / 2;
            if (array[middle] == searchedValue) {//case 1: 二分后，正好是中间值
                return true;
            }
            if(searchedValue > array[middle]){//case 2: 在中间值右边
                beginning = middle + 1; 
            }else{//case 3： 在中间值左边。
                end = middle - 1; //不是end = middle，因为case 1 已经包括middle，所以要-1。
                //使begin和end的值一直变化，以防死循环
            }
        }
        return false;  
    }
}
