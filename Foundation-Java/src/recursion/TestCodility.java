package recursion;

import java.util.*;

public class TestCodility {
    public static void main(String[] args) {

        int[] arr = {80, 80, 1000000000, 80, 80, 80, 80, 80, 80, 123456789};
        solution3(arr,new ArrayList<>(),0);
        System.out.println(count);
//        System.out.println(max);
//        List<List<Integer>> resultList = new ArrayList<>();
//        backTrack(arr, resultList, new ArrayList<>(), 0);
//        System.out.println(resultList.size());
//        for(List<Integer> res : resultList){
//            System.out.println(res);
//        }
//        int[] arr = {1,1};
//        System.out.println(solution2(1,1,arr));

//        System.out.println(getsumN(19));
    }

    public static void backTrack(int[] arr, List<List<Integer>> resultList, List<Integer> currentList, int start){
        if(currentList.size() == arr.length/2){
            resultList.add(new ArrayList<>(currentList));
            return;
        }
        for(int i = start; i < arr.length; ++i){
            currentList.add(arr[i]);
            backTrack(arr, resultList, currentList, i + 1);
            currentList.remove(currentList.size() - 1);
        }
    }

    public static int max = Integer.MIN_VALUE;
    public static int count = 0;

    public static void solution(int[] T, ArrayList<Integer> lsf, int idx) {
        if(lsf.size() == T.length/2){
            HashMap<Integer,Integer> test=new HashMap();
            for(int c : lsf){
                test.put(c,1);
            }
            int l = test.keySet().size();
            if(l > max){
                max = l;
            }
            return;
        }
        if(idx >= T.length){
            return;
        }
        solution(T, lsf,idx+1);
        ArrayList<Integer> list = new ArrayList<>(lsf);
        list.add(T[idx]);
        solution(T, list,idx+1);
    }

    public static void solution3(int[] T, ArrayList<Integer> lsf, int idx) {
        if(lsf.size() == T.length/2){
//            System.out.println(lsf);
            count++;
        }
        if(idx >= T.length){
            return;
        }
//        solution3(T, lsf,idx+1);
        lsf.add(T[idx]);
        solution3(T, lsf,idx+1);
        lsf.remove(lsf.size()-1);
    }

    static int solution2(int X, int Y, int[] A) {
        int N = A.length;
        int result = -1;
        int nX = 0;
        int nY = 0;
        for (int i = 0; i < N; i++) {
            if (A[i] == X)
                nX += 1;
            if (A[i] == Y)
                nY += 1;
            if (nX == nY)
                result = i;
        }
        return result;
    }

    public static int getsumN(int num){
        int s = 0;
        while (num > 0) {
            s = s + num % 10;
            num = num / 10;
        }
        return s;
    }
}
