package recursion;

import java.util.Scanner;

public class Q98 {
    public static void main(String[] args) {
//        printDecInc(5);
        printIncDec(5,1);
    }

    public static void printDecInc(int n){
        if(n == 0) return;
        System.out.println(n);
        printDecInc(n-1);
        System.out.println(n);
    }

    public static void printIncDec(int n, int i){
        if(i > n) return;
        System.out.println(i);
        printIncDec(n, i+1);
        System.out.println(i);
    }
}
