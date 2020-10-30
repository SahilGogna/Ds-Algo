package sortingalgo;

public class Q154 {
    public static void main(String[] args) {
        int[] arr = {7,15,3,18,6,4,19,2,12,11,9};

        // 1. sort the array using merge sort nlog(n) complexity
        int [] sortedArray = {2,3,4,6,7,9,11,12,15,18,19};
        int target = 15;
        int i = 0;
        int j = sortedArray.length-1;
        while( i < j){
            if(sortedArray[i] + sortedArray[j] > target){
                j--;
            }else if(sortedArray[i] + sortedArray[j] < target){
                i++;
            }else {
                System.out.println(sortedArray[i] + "-" + sortedArray[j]);
                i++;
                j--;
            }
        }
    }
}
