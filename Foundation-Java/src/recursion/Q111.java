package recursion;

import java.util.ArrayList;

public class Q111 {

    public static void main(String[] args) {

        System.out.println(getMaizePath(1,1,3,3));

    }

    public static ArrayList<String> getMaizePath(int i, int j, int n, int m){
        if( i == n && j == m){
            ArrayList<String> list = new ArrayList<>();
            list.add("");
            return list;
        }

        ArrayList<String> paths = new ArrayList<>();

        for(int h = 1; h <= m-j ; h++){
            ArrayList<String> hPaths = getMaizePath(i, j+ h, n, m);
            for(String hPath : hPaths){
                paths.add("h"+h+hPath);
            }
        }

        for(int v = 1; v <= n-i ; v++){
            ArrayList<String> vPaths = getMaizePath(i+v, j, n, m);
            for(String vPath : vPaths){
                paths.add("v"+v+vPath);
            }
        }

        for(int d = 1; d <= n-i && d<= m-j; d++){
            ArrayList<String> dPaths = getMaizePath(i+d, j+d, n, m);
            for(String dPath : dPaths){
                paths.add("d"+d+dPath);
            }
        }

        return paths;
    }
}
