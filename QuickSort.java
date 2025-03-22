import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {2,1,3,4,7,5,9,6,3};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr){
        quickSort(arr,0,arr.length-1);
    }

    public static void quickSort(int[] arr, int low, int high){
        if(low>=high){
            return ;
        }
        int partiotionIndex = partition(arr,low,high);
        quickSort(arr,low,partiotionIndex-1);
        quickSort(arr,partiotionIndex+1,high);
    }

    public static int partition(int[] arr, int low, int high){
        int pivot = arr[low];
        int i = low+1;
        for(int j=low+1;j<=high;j++){
            if(pivot>=arr[j]){
                BubbleSort.swap(arr,i,j);
                i++;
            }
        }
        BubbleSort.swap(arr,i-1,low);
        return i-1;
    }
}