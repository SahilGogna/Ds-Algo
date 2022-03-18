package hashmapsheaps;

import java.util.Collections;
import java.util.PriorityQueue;

public class Q122 {

    public static class MedianPriorityQueue{
        PriorityQueue<Integer> left;
        PriorityQueue<Integer> right;

        MedianPriorityQueue(){
            left = new PriorityQueue<>(Collections.reverseOrder());
            right = new PriorityQueue<>();
        }

        public void add(int val){
            if(right.size() >0 && val > right.peek()){
                right.add(val);
            } else {
                left.add(val);
            }

            if(left.size() - right.size() == 2){
                right.add(left.remove());
            } else if(right.size() - left.size() == 2){
                left.add(right.remove());
            }
        }

        public int remove(){
            if( this.size() == 0){
                return -1; // underflow
            }
            else if(left.size() >= right.size()){
                return left.remove();
            }else {
                return right.remove();
            }
        }

        public int peek(){
            if( this.size() == 0){
                return -1; // underflow
            }
            else if(left.size() >= right.size()){
                return left.peek();
            }else {
                return right.peek();
            }
        }

        public int size(){
            return left.size() + right.size();
        }
    }
    public static void main(String[] args) {
        MedianPriorityQueue mq = new MedianPriorityQueue();
        mq.add(10);
        mq.add(20);
        mq.add(5);
        mq.add(30);
        mq.add(40);
        mq.add(50);

        System.out.println(mq.peek());
    }
}
