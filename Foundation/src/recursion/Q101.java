package recursion;

public class Q101 {
    public static void main(String[] args) {
        printTOH(3,"A", "B","C");
    }

    public static void printTOH(int n, String source, String dest, String aux){
        if(n == 0){
            return;
        }
        printTOH(n-1,source,aux,dest);
        System.out.println(n +"["+source + "->"+dest+"]");
        printTOH(n-1, aux, dest, source);

    }
}
