import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args){
        int[] arr = {1,3,5,1,24,2,78,3,2};
        sort(arr);
        System.out.println(Arrays.toString(arr));

//        [1, 1, 2, 2, 3, 3, 5, 24, 78]
    }

    public static void sort(int[] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i] > arr[j]){
                    BubbleSort.swap(arr,i,j);
                }
            }
        }
    }
}