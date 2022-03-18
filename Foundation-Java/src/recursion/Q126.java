package recursion;

public class Q126 {
    public static void main(String[] args) {
        printEncodings("123","");
    }

    public static void printEncodings(String question, String ansSoFar){

        // we have reached at the end
        if(question.length() == 0){
            System.out.println(ansSoFar);
            return;
        }
        // we are processing the last element
        else if(question.length() == 1){
            char ch = question.charAt(0); // get the character
            if(ch == '0'){ // nothing possible
                return;
            }else {
                int charValue = ch - '0'; // we get digit number like 1,2,..26
                char code = (char) ('a' + charValue - 1); //
                ansSoFar = ansSoFar + code;
                System.out.println(ansSoFar);
            }
        }
        // if length is 2 or greater than 2
        else {
            // we use first character here
            char ch = question.charAt(0); // get the character
            String restOfString = question.substring(1);

            if(ch == '0'){ // nothing possible
                return;
            }else {
                int charValue = ch - '0'; // we get digit number like 1,2,..26
                char code = (char) ('a' + charValue - 1); //
                printEncodings(restOfString, ansSoFar + code);
            }

            // if we use 2 characters here
            String twoChars = question.substring(0,2);
            restOfString = question.substring(2);

            int twoCharValue = Integer.parseInt(twoChars);
            if( twoCharValue <= 26){
                char code = (char) ('a' + twoCharValue - 1); //
                printEncodings(restOfString, ansSoFar + code);
            }


        }

    }
}
