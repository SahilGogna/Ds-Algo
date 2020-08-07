package recursion;

public class Q105 {
    public static void main(String[] args) {
        int arr[] = {1,2,2,15,3,42212,15,3,6,7,15};
        System.out.println(getLastOccurrence(arr,0,15));
    }

    public static int getLastOccurrence(int[] arr, int index, int x) {
        if (index == arr.length) {
            return -1;
        }
        int occ = getLastOccurrence(arr, index+1, x);
        if(occ == -1){
            if(arr[index] == x) {
                return index;
            }else {
                return -1;
            }
        }else {
            return occ;
        }
    }
}