package sortingalgo;

/**
 * used when range of numbers is fixed i.e in this array it is 1 to 9
 * and length very big, like students in Jee exam but numbers will range from 0 to 340
 *
 * array should do stable sort i.e item order is maintained for similar items as
 * it was in the orignal array.
 */
public class Q150 {

    public static void main(String[] args) {
        int[] arr = {4,2,7,4,3,1,2,3,5,6,7,8,9,8,7,6,5,4,3,3,6,3,6,9};
        arr = countSort(arr,1,9);
        for(int i: arr){
            System.out.print(i+"\t");
        }

    }

    public static int[] countSort(int[] arr, int min, int max){
        int range = max - min +1;
        int[] freqArr = new int[range];

        // fill frequency of the numbers in the array
        for(int i = 0; i< arr.length; i++){
            int pos = arr[i] - min;
            freqArr[pos]++;
        }

        // get prefix sum array
        for(int i = 1; i< freqArr.length ; i++){
            freqArr[i] = freqArr[i] + freqArr[i-1];
        }

        int[] ans = new int[arr.length];

        for(int i = arr.length - 1; i >=0 ; i--){
            int pos = freqArr[arr[i] - min];
            ans[pos-1] = arr[i];
            freqArr[arr[i] - min]--;
        }
        return ans;

    }
}
