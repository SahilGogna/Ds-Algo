package recursion;

import java.util.ArrayList;

public class Q109 {

    public static void main(String[] args) {
        ArrayList<String> paths =  getPaths(2);
        System.out.println(paths);

        ArrayList<String> paths2 =  getPaths(3);
        System.out.println(paths2);

        ArrayList<String> paths3 =  getPaths(4);
        System.out.println(paths3);
    }

    public static ArrayList<String> getPaths(int n) {

        if (n == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add("");
            return list;
        } else if (n < 0) {
            ArrayList<String> list = new ArrayList<>();
            return list;
        }

        ArrayList<String> paths1 = getPaths(n - 1);
        ArrayList<String> paths2 = getPaths(n - 2);
        ArrayList<String> paths3 = getPaths(n - 3);
        ArrayList<String> finalPaths = new ArrayList<>();

        for (String path : paths1) {
            finalPaths.add(1 + path);
        }
        for (String path : paths2) {
            finalPaths.add(2 + path);
        }
        for (String path : paths3) {
            finalPaths.add(3 + path);
        }

        return finalPaths;
    }
}
