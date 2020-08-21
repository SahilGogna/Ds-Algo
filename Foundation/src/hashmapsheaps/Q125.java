package hashmapsheaps;

import sun.awt.image.ImageWatched;

import java.util.ArrayList;
import java.util.LinkedList;

public class Q125 {

    public static class HashMap<K, V> {
        private class HMNode {
            K key;
            V value;

            HMNode(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int size; // n
        private LinkedList<HMNode>[] buckets; // N buckets

        public HashMap() {
            initBuckets(4);
            size = 0;
        }

        private void initBuckets(int N) {
            buckets = new LinkedList[N];
            for (int bi = 0; bi < buckets.length; bi++) {
                buckets[bi] = new LinkedList<>();
            }
        }

        public void put(K key, V value) throws Exception {
            int bucketIndex = hashFn(key);
            int dataIndex = getIndexWithinBucket(key,bucketIndex);
            if(dataIndex != -1){
                // update
                HMNode existingNode = buckets[bucketIndex].get(dataIndex);
                existingNode.value = value;
            } else{
                // insert
                HMNode newNode = new HMNode(key, value);
                buckets[bucketIndex].add(newNode);
                size++;
            }

            double lambda = size * 1.0 / buckets.length;
            if(lambda > 2.0){
                rehash();
            }
        }

        private void rehash() throws Exception {
            LinkedList<HMNode>[] oldBucketArray = buckets;

            initBuckets(oldBucketArray.length * 2);
            size = 0;

            for(int i=0; i< oldBucketArray.length; i++){
                for(HMNode node: oldBucketArray[i]){
                    put(node.key, node.value);
                }
            }
        }

        // used in put
        private int hashFn(K key) {
            int hashCode = key.hashCode();
            int absHashCode = Math.abs(hashCode);
            int index = absHashCode % buckets.length;
            return index;
        }

        // used in put
        private int getIndexWithinBucket(K key, int bucketIndex) {
            LinkedList<HMNode> targetBucket = buckets[bucketIndex];
            for(int i=0; i< targetBucket.size(); i++){
                HMNode node = targetBucket.get(i);
                if(node.key.equals(key)){
                    return i;
                }
            }
            return -1;
        }

        public V get(K key) throws Exception {
            // write your code here
            int bucketIndex = hashFn(key);
            int dataIndex = getIndexWithinBucket(key,bucketIndex);
            if(dataIndex != -1){
                // found
                HMNode foundNode = buckets[bucketIndex].get(dataIndex);
                return foundNode.value;
            } else{
                // not found
                return null;
            }
        }

        public boolean containsKey(K key) {
            int bucketIndex = hashFn(key);
            int dataIndex = getIndexWithinBucket(key,bucketIndex);
            if(dataIndex != -1){
                // key found
                return true;
            } else{
                // key not found
                return false;
            }
        }

        public V remove(K key) throws Exception {
            int bucketIndex = hashFn(key);
            int dataIndex = getIndexWithinBucket(key,bucketIndex);
            if(dataIndex != -1){
                // key exists
                HMNode node = buckets[bucketIndex].remove(dataIndex);
                size--;
                return node.value;
            } else{
                // key doesn't exist
                return null;
            }
        }

        public ArrayList<K> keyset() throws Exception {
            ArrayList<K> keys = new ArrayList<>();

            for(int i=0; i < buckets.length; i++){
                for(HMNode node: buckets[i]){
                    keys.add(node.key);
                }
            }
            return keys;
        }

        public int size() {
            // write your code here
            return size;
        }

        public void display() {
            System.out.println("Display Begins");
            for (int bi = 0; bi < buckets.length; bi++) {
                System.out.print("Bucket" + bi + " ");
                for (HMNode node : buckets[bi]) {
                    System.out.print( node.key + "@" + node.value + " ");
                }
                System.out.println(".");
            }
            System.out.println("Display Ends");
        }
    }

    public static void main(String[] args) throws Exception {

        HashMap<String, Boolean> attHashMap = new HashMap<>();
        attHashMap.put("Sahil", true);
        attHashMap.put("RC", true);
        attHashMap.put("DC", false);
        attHashMap.put("PC", true);
        attHashMap.put("BC", false);

        attHashMap.display();

        System.out.println("---------");

        attHashMap.put("Sahil", false);

        attHashMap.display();
        System.out.println("---------");

        System.out.println(attHashMap.containsKey("KL"));
        System.out.println("---------");
        attHashMap.remove("BC");

        attHashMap.display();
        System.out.println("---------");
        System.out.println(attHashMap.keyset());

    }

}
