package recursion;

public class Q103 {

    public static void main(String[] args) {
        int arr[] = {1,2,3,42212,15,6,7};
        System.out.println(maxOfArr(arr,0));
    }
    public static int maxOfArr(int[] arr, int index){
        if(index == arr.length){
            return Integer.MIN_VALUE;
        }
        int n = maxOfArr(arr, index+1);
        if(n > arr[index]){
            return n;
        }else {
            return arr[index];
        }
    }
}
