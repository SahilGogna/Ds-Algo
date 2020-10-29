package sortingalgo;

public class Q147 {
    public static void main(String[] args) {
        int[] arr1 = {2,5,8,12,35};
        int[] arr2 = {1,9,11,34,56};

        int[] arr = mergeSortedArrays(arr1,arr2);
        for(int i: arr){
            System.out.print(i+"\t");
        }
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
