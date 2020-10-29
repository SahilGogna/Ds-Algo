package sortingalgo;

public class Q148 {
    public static void main(String[] args) {
        int[] arr = {2,5,3,7,4,1,9,6};
        int[] sortedArr = mergeSortArray(arr,0,arr.length-1);
        for(int i: sortedArr){
            System.out.print(i+"\t");
        }
    }

    private static int[] mergeSortArray(int[] arr, int low, int high){
        if(low == high){
            int[] ba = new int[1];
            ba[0] = arr[low];
            return ba;
        }
        int mid = (low + high)/2;
        int[] arr1 = mergeSortArray(arr, low, mid);
        int[] arr2 = mergeSortArray(arr,mid+1,high);
        int[] sortedArr =  mergeSortedArrays(arr1,arr2);
        return sortedArr;
    }

    private static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        int l1 = arr1.length;
        int l2 = arr2.length;

        int[] arr = new int[l1 + l2];
        int i = 0; // array 1 pointer
        int j = 0; // array 2 pointer
        int k = 0; // array 3 pointer

        while (i < l1 && j < l2){
            if(arr1[i] < arr2[j]){
                arr[k] = arr1[i];
                i++;
            }else{
                arr[k] = arr2[j];
                j++;
            }
            k++;
        }

        while(i < l1){
            arr[k] = arr1[i];
            i++;
            k++;
        }

        while(j < l2){
            arr[k] = arr2[j];
            j++;
            k++;
        }
        return arr;
    }
}
