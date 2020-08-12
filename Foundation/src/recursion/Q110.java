package recursion;

import java.util.ArrayList;

public class Q110 {
    public static void main(String[] args) {
        System.out.println(getPaths(1,1,3,3));
    }

    public static ArrayList<String> getPaths(int i, int j, int n, int m){

        if( i == n && j == m){
            ArrayList<String> list = new ArrayList<>();
            list.add("");
            return list;
        }
        ArrayList<String> pathsH = new ArrayList<>();
        ArrayList<String> pathsV = new ArrayList<>();

        if(j < m){
            pathsH = getPaths(i, j+1, n, m);
        }
        if(i< n){
            pathsV = getPaths(i+1, j, n, m);
        }

        ArrayList<String> finalPaths = new ArrayList<>();

        for(String path: pathsH){
            finalPaths.add("H"+path);
        }
        for(String path: pathsV){
            finalPaths.add("V"+path);
        }

        return finalPaths;
    }
}
