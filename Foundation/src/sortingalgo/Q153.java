package sortingalgo;

public class Q153 {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,0,1,2,2,1,0,1,2,2,0,1,1};
        int i = 0;
        int j = 0;
        int k = arr.length - 1;

        while(i <= k){
            if(arr[i] == 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
                i++;
            }else if(arr[i] == 1){
                i++;
            }else {
                int temp = arr[i];
                arr[i] = arr[k];
                arr[k] = temp;
                k--;
            }
        }

        for(int l:arr){
            System.out.print(l + "\t");
        }
    }


}
