package hashmapsheaps;

import java.util.PriorityQueue;

public class Q121 {

    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 4, 6, 7, 5, 8, 9};

        int n = 3;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i =0; i<=n;i++){
            pq.add(arr[i]);
        }

        for(int i = n+1; i< arr.length; i++){
            System.out.print(pq.remove() + "\t");
            pq.add(arr[i]);
        }

        while(pq.size() > 0){
            System.out.print(pq.remove() + "\t");
        }
    }
}
