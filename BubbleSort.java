import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1,3,5,2,35,63,2,3,33,5,53};
        sort(arr);
        System.out.println(Arrays.toString(arr));

//        [1, 2, 2, 3, 3, 5, 5, 33, 35, 53, 63]
    }

    public static void swap(int[] arr, int a, int b){
        int c = arr[a];
        arr[a] = arr[b];
        arr[b] = c;
    }

    public static void sort(int[] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j] > arr[j+1]){
                    swap(arr, j,j+1);
                }
            }
        }
    }
}