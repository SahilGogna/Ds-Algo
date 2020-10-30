package sortingalgo;

import java.util.Arrays;

public class Q149 {

    public static void main(String[] args) {
        int[] arr = {4,6,3,5,2,8,1};
        quickSort(arr,0,arr.length-1);
        Arrays.stream(arr).forEach(value -> System.out.print(value + "\t"));
    }

    public static void quickSort(int[] arr, int lo, int hi){
        if( lo >= hi){
            return;
        }
        int pivot = arr[hi];
        int pi = partitionArray(arr, pivot, lo, hi);
        quickSort(arr, lo, pi-1);
        quickSort(arr, pi,hi);
    }

    public static int partitionArray(int[] arr, int pivot, int lo, int hi) {
        int i = lo;
        int j = lo;
        while (i <= hi) {
            if (arr[i] <= pivot) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
            i++;
        }
        return j - 1;
    }
}
