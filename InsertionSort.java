import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {24,14,2,4,6,2,4,3,1,6,8,5,3};
        sort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void sort(int[] arr){
        int n = arr.length;
        for(int i=1;i<n;i++) {
            int num = arr[i];
            int j = i - 1;
            while (j >= 0 && num < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = num;
        }
    }
}