package recursion;

/**
 * @author sahilgogna on 2020-08-28
 */
public class Q130 {
    public static void main(String[] args) {
        int[][] board = new int[5][5];
        printKnightTour(board, 3,3,1);
    }

    public static void printKnightTour(int[][] chess, int row, int col, int moveNumber){
        if( row < 0 || col < 0 || row >= chess.length || col >= chess.length || chess[row][col] != 0){
            return;
        } else if( moveNumber == chess.length * chess.length){
            chess[row][col] = moveNumber;
            displayChessBoard(chess);
            System.out.println("----------------------");
            chess[row][col] = 0;
            return;
        }
        chess[row][col] = moveNumber;
        printKnightTour(chess, row -2, col+1,moveNumber+1);
        printKnightTour(chess, row -1, col+2,moveNumber+1);
        printKnightTour(chess, row +1, col+2,moveNumber+1);
        printKnightTour(chess, row +2, col+1,moveNumber+1);
        printKnightTour(chess, row +2, col-1,moveNumber+1);
        printKnightTour(chess, row +1, col-2,moveNumber+1);
        printKnightTour(chess, row -1, col-2,moveNumber+1);
        printKnightTour(chess, row -2, col-1,moveNumber+1);

        chess[row][col] = 0;
    }

    public static void displayChessBoard(int[][] arr){
        for(int i= 0; i< arr.length; i++){
            for( int j= 0; j< arr.length; j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
