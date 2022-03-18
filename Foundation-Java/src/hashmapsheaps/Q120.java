package hashmapsheaps;

import java.util.PriorityQueue;

public class Q120 {
    public static void main(String[] args) {
        int[] arr = {34, 1, 4, 6, 13, 56, 12, 75, 23};
        int n= 3;

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i = 0; i < n; i++){
            pq.add(arr[i]);
        }

        for(int i = n; i< arr.length; i++){
            if(pq.peek() < arr[i]){
                pq.remove();
                pq.add(arr[i]);
            }
        }

        for(int i =0; i<n; i++){
            System.out.println(pq.remove());
        }
    }
}
