package main.stack;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterorSmaller {
    public static void main(String[] args) {
        int[] arr = {10,6,12,5,3,2,4,8,1};
        System.out.println(Arrays.toString(ngl(arr)));
        System.out.println(Arrays.toString(nsr(arr)));
        System.out.println(Arrays.toString(nsl(arr)));
    }

    // next greater on left
    public static int[] ngl(int[] arr){
        int[] arr1 = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        st.push(arr.length - 1);
        for(int i = arr.length-2; i>=0; i--){
            while(st.size()>0 && (arr[i] > arr[st.peek()])){
                arr1[st.pop()] = arr[i];
            }
            st.push(i);
        }

        while(st.size()>0){
            arr1[st.pop()] = -1;
        }

        return arr1;
    }

    // next smaller on right 
    public static int[] nsr(int[] arr){
        Stack<Integer> st = new Stack<>();
        int[] arr1 = new int[arr.length];
        st.push(0);
        for(int i= 1; i< arr.length; i++){
            while(st.size()>0 && (arr[i] < arr[st.peek()])){
                arr1[st.pop()] = arr[i];
            }
            st.push(i);
        }
        while(st.size()>0){
            arr1[st.pop()] = -1;
        }
        return arr1;
    }

    // next smaller on left
    public static int[] nsl(int[] arr){
        int[] arr1 = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        st.push(arr.length - 1);
        for(int i = arr.length-2; i>=0; i--){
            while(st.size()>0 && (arr[i] < arr[st.peek()])){
                arr1[st.pop()] = arr[i];
            }
            st.push(i);
        }

        while(st.size()>0){
            arr1[st.pop()] = -1;
        }

        return arr1;
    }
}
