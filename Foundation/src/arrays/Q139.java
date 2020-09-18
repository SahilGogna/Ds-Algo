package arrays;

public class Q139 {
    public static void main(String[] args) {
        int[] a1 = {1,0,0,0,0,0,1};
        int[] a2 = {9,9,9,9,9};
        sub(a1, a2);
    }

    private static void sub(int[] a1, int[] a2) {
        int i = a1.length - 1;
        int j = a2.length - 1;

        int[] diff = new int[a1.length];
        int k = diff.length - 1;
        int carry = 0;
        while (k >= 0) {
            int digit = 0;

            if (j >= 0) {
                a1[i] = carry + a1[i];
                if (a1[i] >= a2[j]) {
                    carry = 0;
                } else {
                    a1[i] = 10 + a1[i];
                    carry = -1;
                }
                digit = a1[i] - a2[j];
                diff[k] = digit;
            } else {
                a1[i] = carry + a1[i];
                if (a1[i] >= 0) {
                    carry = 0;
                    diff[k] = a1[i];
                } else {
                    a1[i] = a1[i] + 10;
                    diff[k] = a1[i];
                    carry = -1;
                }
            }
            i--;
            j--;
            k--;
        }

        for (int l = 0; l < diff.length; l++) {
            System.out.print(diff[l] + "\t");
        }

    }
}
