package arrays;

public class Q85 {

    public static void main(String[] args) {

        int m = 6;
        int n = 5;

        int[][] arr = {{1,2,3,4,5,6},
                {7,8,9,10,11,12},
                {13,14,15,16,17,18},
                {19,20,21,22,23,24},
                {25,26,27,28,29,30}};

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length;j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }

        System.out.println();
        int minCol = 0;
        int minRow = 0;
        int maxCol = arr[0].length-1;
        int maxRow = arr.length-1;

        int totalElements = n*m;
        int count = 0;

        while(count < totalElements){
            for(int i=minRow, j= minCol; i<=maxRow; i++ ){
                System.out.print(arr[i][j] +"\t");
                count++;
            }
            minCol++;
            for(int i=minCol, j= maxRow; i<=maxCol; i++){
                System.out.print(arr[j][i] +"\t");
                count++;
            }
            maxRow--;
            for(int i= maxRow, j = maxCol; i>= minRow; i--){
                System.out.print(arr[i][j] +"\t");
                count++;
            }
            maxCol--;
            for(int i = maxCol, j = minRow; i>= minCol; i--){
                System.out.print(arr[j][i] +"\t");
                count++;
            }
            minRow++;

        }
    }
}
