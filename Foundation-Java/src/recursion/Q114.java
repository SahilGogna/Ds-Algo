package recursion;

public class Q114 {
    public static void main(String[] args) {
        printMP(1,1,3,3,"");
    }

    // call stupid but base case smart
    public static void printMP(int sr, int sc, int dr, int dc, String path){
        if( sr > dr || sc > dc) return;

        if(sr == dr && sc == dc){
            System.out.println(path);
            return;
        }

        printMP(sr, sc+1 , dr, dc, path+"h");
        printMP(sr+1, sc , dr, dc, path+"v");

    }

    // call smart but base case normal
    public static void printMP2(int sr, int sc, int dr, int dc, String path){

        if( sr == dr && sc == dc){
            System.out.println(path);
            return;
        }

        if(sc <= dc){
            printMP2(sr, sc+1 , dr, dc, path+"h");
        }

        if(sr <= dr){
            printMP2(sr+1, sc , dr, dc, path+"v");
        }
    }
}
