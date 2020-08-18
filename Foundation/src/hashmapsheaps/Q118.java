package hashmapsheaps;

import java.util.HashMap;

public class Q118 {
    public static void main(String[] args) {
        two();
    }

    public static void one() {
        int[] a = {1, 1, 2, 2, 2, 3, 3, 4, 5};
        int[] b = {1, 1, 1, 5, 2};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < a.length; i++) {
            map.put(a[i], 1);
        }

        for (int i = 0; i < b.length; i++) {
            if (map.containsKey(b[i])) {
                System.out.print(b[i] + "\t");
                map.remove(b[i]);
            }
        }
    }

    public static void two() {
        int[] a = {1, 1, 2, 2, 4, 2, 3, 3, 4, 5,5};
        int[] b = {1, 1, 1, 5, 2, 4,4,4};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < a.length; i++) {
            if (map.containsKey(a[i])) {
                int val = map.get(a[i]);
                map.put(a[i], ++val);
            } else {
                map.put(a[i], 1);
            }
        }

        for (int i = 0; i< b.length; i++){
            if(map.containsKey(b[i]) && map.get(b[i]) != 0){
                System.out.print(b[i] + "\t");
                int val = map.get(b[i]);
                val--;
                map.put(b[i],val);
            }
        }
    }


}
