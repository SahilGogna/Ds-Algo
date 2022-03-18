package recursion;

public class Q104 {
    public static int max = Integer.MIN_VALUE;

    public static void main(String[] args) {
        int arr[] = {1,2,2,3,42212,15,3,6,7,15};
        System.out.println(firstOccurrence(arr,0,2));
    }

    public static int firstOccurrence(int[] arr, int idx, int x){
        if(idx == arr.length){
            return -1;
        }
        if(arr[idx] == x) return idx;
        return firstOccurrence(arr, idx+1, x);
    }
}
