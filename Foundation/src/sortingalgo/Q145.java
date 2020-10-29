package sortingalgo;

/**
 * we consider ith element to be min
 * then we loop from i+1th element
 * and find the index of min element
 *
 * at the end we swap the ith element with the min element index,
 * by this first i elements are always sorted
 */
public class Q145 {
    public static void main(String[] args) {
        int[] arr = {2,5,3,7,4,1,9,6};
        selectionSort(arr);
        for(int i: arr){
            System.out.print(i+"\t");
        }
    }

    public static int[] selectionSort(int[] arr){
        int length = arr.length;
        for(int i = 0; i< length-1; i++){
            int min = i;
            for(int j = i+1; j < length; j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        return arr;
    }
}
