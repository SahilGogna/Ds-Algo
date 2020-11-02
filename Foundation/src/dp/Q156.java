package dp;

public class Q156 {

    public static void main(String[] args) {
//        System.out.println(countStairs(10));
//        System.out.println(countStairsMemoized(6, new int[11]));
        System.out.println(countStairsTab(10));
    }

    public static int countStairs(int n) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }
        System.out.println("Hello :"+n);
        int p1 = countStairs(n - 1);
        int p2 = countStairs(n - 2);
        int p3 = countStairs(n - 3);
        int total = p1 + p2 + p3;

        return total;
    }

    public static int countStairsMemoized(int n, int[] arr) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }
        if(arr[n] != 0 ){
            return arr[n];
        }
        System.out.println("Hello :"+n);
        int p1 = countStairsMemoized(n - 1,arr);
        int p2 = countStairsMemoized(n - 2,arr);
        int p3 = countStairsMemoized(n - 3,arr);
        int total = p1 + p2 + p3;
        arr[n] = total;
        return total;
    }

    public static int countStairsTab(int n){
        int[] dp = new int[n+1];

        dp[0] = 1;
        for(int i = 1; i<= n; i++){
            if( i == 1){
                dp[i] = dp[i-1];
            }else if( i == 2){
                dp[i] = dp[i-1] + dp[i-2];
            } else{
                dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
            }
        }

        return dp[n];
    }

}
