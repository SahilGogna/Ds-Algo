package hashmapsheaps;

import java.util.HashMap;

public class Q119 {

    public static void main(String[] args) {
        int[] arr = {10, 5, 9, 1, 11, 8, 6, 15, 3, 12, 2};

        HashMap<Integer, Boolean> map = new HashMap<>();

        for(int val: arr){
            map.put(val, true);
        }

        for(int val: arr){
            if(map.containsKey(val-1)){
                map.put(val, false);
            }
        }

        int maxLength = 0;
        int maxStartPoint = 0;

        for(int val: arr){
            if(map.get(val) == true){
                int tl = 1;
                int tv = val;

                while(map.containsKey(tv+tl)){
                    tl++;
                }

                if(tl > maxLength) {
                    maxLength = tl;
                    maxStartPoint = val;
                }

            }
        }

        for(int i=0; i<maxLength;i++){
            System.out.print(maxStartPoint + i + "\t");
        }

    }
}
