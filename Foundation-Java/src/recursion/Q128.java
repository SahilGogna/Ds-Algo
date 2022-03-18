package recursion;

public class Q128 {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60};
        printTargetSumSubset(arr,0,"",0,60);

    }

    public static void printTargetSumSubset(int[] arr, int idx, String set, int sos, int tar){
        if(idx == arr.length-1){
            if(sos == tar){
              System.out.println(set);
            }
            return;
        }
        // number added in subset
        printTargetSumSubset(arr,idx+1,set+arr[idx]+"\t", sos+arr[idx], tar);

        // number not added in subset
        printTargetSumSubset(arr,idx+1,set, sos, tar);
    }
}
