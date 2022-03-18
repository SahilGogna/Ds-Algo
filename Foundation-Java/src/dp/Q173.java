package dp;

import java.util.Scanner;

public class Q173 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        int k = scanner.nextInt();

        long same = k*1;
        long diff = k * (k-1);
        long total = same + diff;

        for(int i= 3; i<=n; i++){
            same = diff;
            diff = total * (k-1);
            total = same + diff;
        }

        System.out.println(total);
    }
}
