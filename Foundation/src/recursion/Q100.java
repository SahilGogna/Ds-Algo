package recursion;

public class Q100 {
    public static void main(String[] args) {
        System.out.println(power(2,10));
    }

    public static int power(int x, int n){
        if(n == 0) {
            return 1;
        }
        return x * power(x, n-1);
    }

    public static int powerLog(int x, int n){
        if(n == 0) {
            return 1;
        }

        int xn2 = power(x, n/2);
        int xn = xn2 * xn2;

        if(n%2 == 1){
            xn = xn * x;
        }

        return xn;
    }
}
