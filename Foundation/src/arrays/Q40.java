package arrays;

import java.util.Scanner;

/**
 * difference of 2 arrays
 */
public class Q40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();

        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i] = scanner.nextInt();
        }

        int n2 = scanner.nextInt();

        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = scanner.nextInt();
        }

        int[] diff = new int[n2];
        int borrow = 0;

        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int k = diff.length - 1;

        while (k >= 0) {
            int d = 0;
            int d1 = i >= 0 ? arr1[i] : 0;

            if (arr2[j] + borrow >= d1) {
                d = arr2[j] + borrow - d1;
                borrow = 0;
            } else {
                d = arr2[j] + borrow + 10 - d1;
                borrow = -1;
            }
            diff[k] = d;
            i--;
            j--;
            k--;
        }
        int index = 0;
        while (index <= diff.length) {
            if (diff[index] == 0) index++;
            else break;
        }
        for (int p = index; p < diff.length; p++) {
            System.out.print(diff[index] + "\t");
        }
    }
}
