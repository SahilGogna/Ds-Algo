package stacks;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

/**
 * Merge Overlapping Intervals
 */
public class Q54 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfMeetings = scanner.nextInt();
        int[][] schedule = new int[numberOfMeetings][2];

        for(int i=0; i<numberOfMeetings;i++){
            for(int j=0; j<2; j++){
                schedule[i][j] = scanner.nextInt();
            }
        }

        Pair[] pairs = new Pair[numberOfMeetings];
        for (int i=0; i< numberOfMeetings; i++){
            pairs[i] = new Pair(schedule[i][0], schedule[i][1]);
        }

        Arrays.sort(pairs);

        Stack<Pair> st = new Stack<>();
        for(int i = 0; i< pairs.length; i++){
            if(i ==0 ){
                st.push(pairs[i]);
            }else{
                Pair top = st.peek();
                if(top.et < pairs[i].st){
                    st.push(pairs[i]);
                }else{
                    top.et = Math.max(top.et, pairs[i].et);
                }
            }
        }
        Stack<Pair> st2 = new Stack<>();
        while (st.size()>0){
            st2.push(st.pop());
        }

        while (st2.size() >0){
            Pair top = st2.pop();
            System.out.println(top.st +" "+ top.et);
        }

    }
}