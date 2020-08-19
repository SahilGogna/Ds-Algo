package hashmapsheaps;

import java.util.ArrayList;

public class Q124 {

    public static void main(String[] args) {

        PriorityQueue pq = new PriorityQueue();
        pq.add(10);
        pq.add(20);
        pq.add(30);
        pq.add(40);
        System.out.println(pq.peek());
        pq.add(50);
        System.out.println(pq.peek());
        System.out.println(pq.remove());
        System.out.println(pq.peek());
        System.out.println(pq.remove());
        System.out.println(pq.peek());
        System.out.println(pq.remove());
        System.out.println(pq.peek());
        System.out.println(pq.remove());
        System.out.println(pq.peek());

    }

    public static class PriorityQueue {
        ArrayList<Integer> data;

        public PriorityQueue() {
            data = new ArrayList<>();
        }

        public void add(int val) {
            data.add(val);
            upheapify(data.size() - 1);
        }

        private void upheapify(int i) {
            if( i == 0){
                return;
            }
            int pi = (i - 1)/2;
            if(data.get(i) < data.get(pi)){
                swap(i,pi);
                upheapify(pi);
            }
        }

        private void swap(int i, int j) {
            int ith = data.get(i);
            int jth = data.get(j);

            data.set(i,jth);
            data.set(j,ith);
        }

        public int remove() {
            if(data.size() == 0){
                System.out.println("Undeflow!");
                return -1;
            }

            // swap top and bottom
            swap(0, data.size()-1);

            // remove last
            int val = data.remove(data.size() - 1);

            // downheapify
            downHeapify(0);

            return val;
        }

        private void downHeapify(int pi) {

            int mini = pi;

            int li = 2*pi +1;
            if(li < size() && data.get(li) < data.get(mini)){
                mini = li;
            }

            int ri = 2*pi +2;
            if(ri < size() && data.get(ri) < data.get(mini)){
                mini = ri;
            }

            if( mini != pi){
                swap(pi, mini);
                downHeapify(mini);
            }

        }

        public int peek() {
            if(data.size() == 0){
                System.out.println("Undeflow!");
                return -1;
            }

            return data.get(0);
        }

        public int size() {
            return data.size();
        }
    }
}
