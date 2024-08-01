import java.util.*;

public class LeetCodeDay3 {
    public static void main(String[] args) {
        int[] arr = {3,30,34,5,9};
        int[] ref = new int[arr.length];
        int n = arr.length - 1;
        for(int i=0;i<n+1;i++){
            if(arr[i] > 9){
                ref[i] = arr[i] / 10;   
            }else{
                ref[i] = arr[i];
            }
        }
        for(int i=0;i<n+1;i++){
            for(int j=i;j<n+1;j++){
                if(ref[j] > ref[i]){
                    int t1 = ref[j];
                    ref[j] = ref[i];
                    ref[i] = t1;
                    int t2 = arr[j];
                    arr[j] = arr[i];
                    arr[i] = t2;
                }
            }
        }
        String str = "";
        for(int i=0;i<=n;i++){
            str += arr[i];
        }
        System.out.println(str);
    }
}
