package sortingalgo;

public class Q151 {

    public static void main(String[] args) {
        String arr[] = {"06121999","01071995","28081969","01011964"};
        countSort(arr,1000000,100,32); // days
        countSort(arr,10000,100,13); // months
        countSort(arr,1,10000,2501); // year

        for(String s: arr){
            System.out.println(s);
        }
    }

    public static void countSort(String[] arr, int div, int mod, int range){
        String[] ans = new String[arr.length];

        int[] freqArr = new int[range];
        // make frequency array
        for(int i =0; i< arr.length; i++){
            freqArr[Integer.parseInt(arr[i],10)/div %mod]++;
        }
        // convert it into prefix sum array
        for(int i=1; i< freqArr.length; i++){
            freqArr[i] = freqArr[i] + freqArr[i-1];
        }

        // stable sorting -> filling the array
        for(int i = arr.length - 1; i >=0 ; i--){
            int pos = freqArr[Integer.parseInt(arr[i],10)/div %mod] - 1;
            ans[pos] = arr[i];
            freqArr[Integer.parseInt(arr[i],10)/div %mod]-- ;
        }

        for(int i = 0; i < arr.length; i++){
            arr[i] = ans[i];
        }
    }
}
