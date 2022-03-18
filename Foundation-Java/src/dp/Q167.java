package dp;

import java.util.Scanner;

public class Q167 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        long currBuild = 1;
        long currSpace = 1;

        long prevBuild = 1;
        long prevSpace = 1;

        for(int i = 2; i <= n; i++){
            currBuild = prevSpace;
            currSpace = prevSpace + prevBuild;

            prevSpace = currSpace;
            prevBuild = currBuild;
        }

        long total = (currSpace + currBuild) * (currSpace + currBuild);

        System.out.println(total);
    }
}
