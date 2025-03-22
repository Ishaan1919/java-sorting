import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {
        int[] arr = {1,4,1,2,7,5,2};
        int[] ans = sort(arr);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] sort(int[] arr){
        int n = arr.length;
        int max = arr[0];

        for(int i=1;i<n;i++){
            max = Math.max(max,arr[i]);
        }
        int[] sum = new int[max+1];

        for(int i=0;i<n;i++){
            sum[arr[i]]++;
        }

//        System.out.println(Arrays.toString(sum));

        for(int i=1;i<max+1;i++){
            sum[i]+=sum[i-1];
        }

        int[] ans = new int[n];
        for(int i=0;i<n;i++){
            ans[--sum[arr[i]]] = arr[i];
        }
        return ans;
    }
}