package hashmapsheaps;

import java.util.HashMap;

public class Q118 {
    public static void main(String[] args) {
        int[] a = {1,1,2,2,2,3,3,4,5};
        int[] b = {1,1,1,5,2};

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i= 0; i< a.length; i++){
            map.put(a[i],1);
        }

        for(int i = 0; i< b.length; i++){
            if(map.containsKey(b[i])){
                System.out.print(b[i] + "\t");
                map.remove(b[i]);
            }
        }
    }
}
