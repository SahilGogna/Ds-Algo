package recursion;

import java.util.ArrayList;

public class Q108 {

    static String[] codes = {"+", ".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public static void main(String[] args) {
        System.out.println(getKeypadComb("123"));
    }

    public static ArrayList<String> getKeypadComb(String str){

        if(str.length() == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add("");
            return list;
        }

        // assume 573
        String firstWord = str.substring(0,1); // 5
        String remainingWords = str.substring(1); // 73

        ArrayList<String> combinationSmallList = getKeypadComb(remainingWords); // all comb of 73

        ArrayList<String> finalCombinations = new ArrayList<>(); // empty list

        String words = codes[Integer.parseInt(firstWord)]; // first word codes 5 -> qrst

        // combining each word with the word from list
        for(int i=0; i<words.length(); i++){
            for(int j =0; j< combinationSmallList.size(); j++){
                finalCombinations.add(words.charAt(i) + combinationSmallList.get(j));
            }
        }

        return finalCombinations;
    }
}
