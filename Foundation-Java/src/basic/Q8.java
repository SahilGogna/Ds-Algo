package basic;

import java.util.Scanner;

/**
 * rotate a number
 * positive and negative rotations allowed
 */
public class Q8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int rotations = scan.nextInt();
        int length = 0;
        int copy = number;
        while (copy != 0) {
            copy = copy / 10;
            length++;
        }
        rotations = rotations % length;
        if(rotations < 0) rotations = length + rotations;
        int divFactor = (int) Math.pow(10,rotations);
        int mulFactor = (int) Math.pow(10,length-rotations);
        int temp1 = number / divFactor;
        int temp2 = number % divFactor;
        temp2 = temp2 * mulFactor;
        number = temp2 + temp1;
        System.out.println(number);
    }
}
