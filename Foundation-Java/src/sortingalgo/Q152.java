package sortingalgo;

public class Q152 {

    public static void main(String[] args) {
        int[] arr = {1,0,0,0,1,1,0,1,0,1,1,0};
        int i = 0;
        int j = 0;

        while( i < arr.length){
            if(arr[i] == 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j++;
            }else {
                i++;
            }
        }

        for(int k:arr){
            System.out.print(k+"\t");
        }
    }
}
