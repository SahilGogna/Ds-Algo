package recursion;

public class Q102 {

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        displayArrReverse2(arr,0);
    }

    public static void displayArr(int[] arr, int index){
        if(index == arr.length){
            return;
        }
        System.out.println(arr[index]);
        displayArr(arr,index+1);
    }

    // index initially will be length - 1
    public static void displayArrReverse(int[] arr, int index){
        if(index < 0){
            return;
        }
        System.out.println(arr[index]);
        displayArrReverse(arr,index-1);
    }

    // if we want to pass index = 0 initially
    public static void displayArrReverse2(int[] arr, int index){
        if(index == arr.length){
            return;
        }
        displayArrReverse2(arr,index+1);
        System.out.println(arr[index]);
    }
}
