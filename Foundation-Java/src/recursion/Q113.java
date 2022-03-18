package recursion;

public class Q113 {
    public static void main(String[] args) {
        printSP(4,"");
    }

    public static void printSP(int n, String path){

        if( n < 0){
            return;
        }

        if( n ==0 ){
            System.out.println(path);
            return;
        }

        printSP(n-1, path+"1");
        printSP(n-2, path+"2");
        printSP(n-3, path+"3");
    }
}
