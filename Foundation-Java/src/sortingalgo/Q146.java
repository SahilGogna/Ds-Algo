package sortingalgo;

/**
 * we consider first i elements to be sorted
 * then we try to fit i+1 th element in these sorted elements
 */
public class Q146 {

    public static void main(String[] args) {
        int[] arr = {2,5,3,7,4,1,9,6};
        insertionSort(arr);
        for(int i: arr){
            System.out.print(i+"\t");
        }
    }

    public static void insertionSort(int[] arr){
        for(int i = 1; i< arr.length; i++){
            for(int j = i-1; j >=0; j--){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }else{
                    break;
                }
            }
        }
    }
}
