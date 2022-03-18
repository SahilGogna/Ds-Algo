package recursion;

public class Q112 {

    public static void main(String[] args) {
        printSS("abc", "");
    }

    public static void printSS(String ques, String ans){

        if(ques.length() == 0){
            System.out.print(ans+"\t");
            return;
        }

        char start = ques.charAt(0);
        String restOfString = ques.substring(1);

        printSS(restOfString, ans + start);
        printSS(restOfString, ans + "");
    }
}
