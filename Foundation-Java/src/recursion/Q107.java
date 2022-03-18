package recursion;

import java.util.ArrayList;

public class Q107 {

    public static void main(String[] args) {

        String s= "abc";
        System.out.println(getSubString(s));

    }

    public static ArrayList<String> getSubString(String str) {
        if (str.length() == 0) {
            ArrayList<String> terminationList = new ArrayList<>();
            terminationList.add("");
            return terminationList;
        }

        char firstChar = str.charAt(0);
        String remainingString = str.substring(1);

        ArrayList<String> substringList = getSubString(remainingString);

        ArrayList<String> completeList = new ArrayList<>();

        for (String s : substringList) {
            completeList.add("" + s);
        }

        for (String s : substringList) {
            completeList.add(firstChar + s);
        }

        return completeList;
    }
}
