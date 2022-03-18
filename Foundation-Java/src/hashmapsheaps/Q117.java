package hashmapsheaps;

import java.util.HashMap;

public class Q117 {

    public static void main(String[] args) {
        String data = "abracadabra";
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0; i< data.length(); i++){
            char word = data.charAt(i);
            if(map.containsKey(word)){
                int val = map.get(word);
                map.put(word, ++val);
            }else{
                map.put(word,1);
            }
        }

        char maxChar = 'A'; // any random
        int maxFreq = 0;

        for( char key : map.keySet()){
            int freq = map.get(key);
            if(freq > maxFreq){
                maxChar = key;
                maxFreq = freq;
            }
        }

        System.out.println("Key: "+maxChar + " freq: "+ maxFreq);


    }
}
