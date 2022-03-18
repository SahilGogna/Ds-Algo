package dp;

public class KnapSackRecursive {

    public static int max = 0;
    public static void main(String[] args) {
        int[] wt = {2 ,5 ,1 ,3 ,4};
        int[] val = {15 ,14, 10, 45, 30};
        int W = 7;
        solution(wt,val,W,0,0,0);
        System.out.println(max);
    }

    public static void solution(int[] wt, int[] val, int W, int wsf, int vsf, int i){
        if(wsf > W){
            return;
        }
        if(i >= wt.length){
            if(wsf <= W){
                max = Integer.max(max,vsf);
            }
            return;
        }
        solution(wt,val,W,wsf+wt[i],vsf+val[i],i+1);
        solution(wt,val,W,wsf,vsf,i+1);
    }
}
