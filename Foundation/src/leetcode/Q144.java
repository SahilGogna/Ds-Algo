package leetcode;

import java.util.ArrayList;
import java.util.HashMap;

public class Q144 {

    public String getHint(String secret, String guess) {
        HashMap<Integer, ArrayList<Integer>> secretHash = new HashMap<>();
        HashMap<Integer, ArrayList<Integer>> guessHash = new HashMap<>();

        int length = secret.length();
        int cow = 0;
        int bull = 0;

        for(int i=0; i<length; i++){
            int key = Integer.parseInt(secret.substring(i,i+1));
            if(secretHash.containsKey(key)){
                ArrayList<Integer> list = secretHash.get(key);
                list.add(i);
            }else{
                ArrayList<Integer> list = new ArrayList<>();
                list.add(i);
                secretHash.put(key,list);
            }
        }

        for(int i=0; i<length; i++){
            int key = Integer.parseInt(guess.substring(i,i+1));
            if(guessHash.containsKey(key)){
                ArrayList<Integer> list = guessHash.get(key);
                list.add(i);
            }else{
                ArrayList<Integer> list = new ArrayList<>();
                list.add(i);
                guessHash.put(key,list);
            }
        }

        for(int key: secretHash.keySet()){
            if(guessHash.containsKey(key)){
                ArrayList<Integer> secretList = secretHash.get(key);
                ArrayList<Integer> guessList = guessHash.get(key);

                for(int i: secretList){
                    if(guessList.contains(i)){
                        bull++;
                    }
                }

                if(guessList.size() - bull > 0 && secretList.size() - bull > 0){
                    cow = Math.min(guessList.size() - bull, secretList.size() - bull);
                }
            }
        }

        return ""+bull+"A"+cow+"B";

    }
}
