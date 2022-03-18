package dp;

/**
 * when one task is done again and again we use DP
 */
public class Q155 {

    public static void main(String[] args) {
//        System.out.println(fibo(10));
        System.out.println(fiboMem(10, new int[11]));
    }

    public static int fibo(int n) {
        if (n == 1 || n == 0) {
            return n;
        }
        System.out.println("Hello "+n);
        int fibnm1 = fibo(n - 1);
        int fibnm2 = fibo(n - 2);
        return fibnm1 + fibnm2;
    }

    public static int fiboMem(int n, int[] arr){
        if (n == 1 || n == 0) {
            return n;
        }
        if(arr[n] != 0){
            return arr[n];
        }
        System.out.println("Hello "+n);
        int fibnm1 = fiboMem(n - 1, arr);
        int fibnm2 = fiboMem(n - 2, arr);
        int ans = fibnm1 + fibnm2;
        arr[n] = ans;
        return ans;
    }
}
