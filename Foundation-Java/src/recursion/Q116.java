package recursion;

public class Q116 {
    public static void main(String[] args) {
        printPermutations("abcd", "");
    }

    public static void printPermutations(String str, String perSoFar){

        if(str. length() == 0){
            System.out.println(perSoFar);
        }

        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            String leftPart = str.substring(0,i);
            String rightPart = str.substring(i+1);
            String restOfTheString = leftPart + rightPart;
            printPermutations(restOfTheString, perSoFar + c);
        }
    }
}
