package hashmapsheaps;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Q123 {
    public static void main(String[] args) {

        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(40);

        ArrayList<Integer> l2 = new ArrayList<>();
        l2.add(5);
        l2.add(9);
        l2.add(12);
        l2.add(18);
        l2.add(32);

        ArrayList<Integer> l3 = new ArrayList<>();
        l3.add(11);
        l3.add(15);
        l3.add(17);

        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        lists.add(l1);
        lists.add(l2);
        lists.add(l3);

        System.out.println(mergeKSortedLists(lists));


    }

    public static class Pair implements Comparable<Pair>{
        int listIndex;
        int valIndex;
        int val;

        Pair(int listIndex, int valIndex, int val){
            this.listIndex = listIndex;
            this.valIndex = valIndex;
            this.val = val;
        }

        @Override
        public int compareTo(Pair o) {
            return this.val - o.val;
        }
    }

    public static ArrayList<Integer> mergeKSortedLists(ArrayList<ArrayList<Integer>> lists){
        ArrayList<Integer> rv = new ArrayList<>();
        PriorityQueue<Pair> pq = new PriorityQueue<>();

        for(int i = 0; i< lists.size(); i++){

            int listIndex = i;
            int valIndex = 0;
            int val = lists.get(listIndex).get(0);

            Pair pair = new Pair(listIndex, valIndex, val);
            pq.add(pair);
        }

        while(pq.size() > 0){
            Pair pair = pq.remove();
            rv.add(pair.val);
            pair.valIndex++;

            if(pair.valIndex < lists.get(pair.listIndex).size()){
                pair.val = lists.get(pair.listIndex).get(pair.valIndex);
                pq.add(pair);
            }
        }

        return rv;
    }
}
