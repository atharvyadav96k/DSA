import java.util.*;

/**
 * SelectionSort
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {3, 9, 2, 8 , 4};
        int n = arr.length - 1;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(arr[j] < arr[i]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }   
        }
        System.out.println(Arrays.toString(arr));
    }
}