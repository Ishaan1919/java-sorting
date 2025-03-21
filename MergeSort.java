import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,1,2,3};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr){
        int n = arr.length;
        mergeSort(arr,0,n-1);
    }
    public static void mergeSort(int[] arr, int s, int e){
        if(s>=e) return ;
        int mid = (s+e)/2;
        mergeSort(arr,s,mid);
        mergeSort(arr,mid+1,e);
        mergeArrays(arr,s,e);
    }

    public static void mergeArrays(int[] arr, int s, int e){
        int mid = (s+e)/2;
        int i = s;
        int j = mid+1;
        int k = 0;
        int[] temp = new int[e-s+1];
        while(i<=mid && j<=e){
            if(arr[i] <= arr[j]){
                temp[k] = arr[i];
                i++;
            }
            else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        while(i<=mid){
            temp[k++] = arr[i++];
        }
        while(j<=e){
            temp[k++] = arr[j++];
        }

        k=0;
        for(int a=s;a<=e;a++){
            arr[a] = temp[k++];
        }
    }
}