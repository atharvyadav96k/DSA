import java.util.*;;
public class BubbleSortInc {
    public static void main(String[] args) {
        int [] arr = {4, 6, 2, 9, 2, 10, 3};
        int [] result = sort(arr);
        System.out.println(Arrays.toString(result));
    }
    static int[] sort(int[] arr){
        int n = arr.length-1;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                if(arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
}
