package arrays;

import java.util.Arrays;
import java.util.Comparator;

/**
 * lexographical comparison is dictionary comparison
 *
 * 1 > 11 > 10 > 111 ...
 */
public class Q141 {
    public static void main(String[] args) {
        Integer[] array = lexoSort(15);
        for(int i : array){
            System.out.print(i+"\t");
        }
    }

    public static Integer[] lexoSort(int n){
        Integer[] arr = new Integer[n];
        for(int i=0; i<n ; i++){
            arr[i] = i+1;
        }

        Arrays.sort(arr, new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2) {
                return (o2+""+o1).compareTo(o1+""+o2);
            }
        });

        return arr;
    }
}
