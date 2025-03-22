import java.util.Arrays;

public class HeapSort {
    public static void main(String[] args) {
        int[] arr = {2,1,3,4,7,5,9,6,3};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr){
        heapSort(arr);
    }

    public static void heapSort(int[] arr){
        int size = arr.length;

        for (int i = size / 2 - 1; i >= 0; i--) {
            heapify(arr, size, i);
        }

//        System.out.println(Arrays.toString(arr));

        for(int i = size - 1; i > 0; i--){
            BubbleSort.swap(arr,0,i);
            heapify(arr,i,0);
        }
    }

    public static void heapify(int[] arr, int size, int i){
        int largest = i;
        int left = i*2+1;
        int right = i*2+2;
        if(left < size && arr[left] > arr[largest]){
            largest = left;
        }
        if(right < size && arr[right] > arr[largest]){
            largest = right;
        }

        if(largest!=i){
            BubbleSort.swap(arr,largest,i);
            heapify(arr,size,largest);
        }
    }
}