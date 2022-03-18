package recursion;

public class Q106 {
    public static void main(String[] args) {
        int arr[] = {1,2,2,15,3,42212,2,15,3,6,7,2,15};
        int[] a = allIndices(arr, 2, 0 , 0);
        for(int x:a){
            System.out.print(x +"\t");
        }
    }

    public static int[] allIndices(int[] arr, int x, int index, int n) {
        if (index == arr.length) {
            int[] array = new int[n];
            return array;
        }
        if (arr[index] == x) {
            n++;
        }
        int[] a = allIndices(arr, x, index + 1, n);
        if (arr[index] == x) {
            a[n-1] = index;
        }
        return a;
    }

}
