import java.util.*;

/**
 * InsertationSort
 */
public class InsertationSort {
    public static void main(String[] args) {
        int[] arr = {9, 3, 5, 3, 7};
        int s = arr.length - 1;
        for(int i=1;i<s;i++){
            int j = i - 1;
            int key = arr[i];
            while(j>=0 && arr[j] > key){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        System.out.println(Arrays.toString(arr));
    }
}