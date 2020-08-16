package recursion;

/**
 * @author sahilgogna on 2020-08-15
 */
public class Q115 {

    public static void main(String[] args) {
        printMaizePath(1,1,2,2,"");
    }

    public static void printMaizePath(int i, int j, int n, int m, String pathSoFar){

        if( i == n && j == m){
            System.out.println(pathSoFar);
            return;
        }

        for(int a = 1; a<= m - j; a++){
            printMaizePath(i, j+1, n, m, pathSoFar + "h" + a);
        }

        for(int b = 1; b<= n - i ; b++){
            printMaizePath(i+1, j, n, m, pathSoFar + "v" + b);
        }

        for(int c = 1; c<= m - j && c<= n - i; c++){
            printMaizePath(i+1, j+1, n, m, pathSoFar + "d" + c);
        }
    }
}
