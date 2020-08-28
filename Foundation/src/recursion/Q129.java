package recursion;

public class Q129 {
    public static void main(String[] args) {
        int[][] arr = new int[4][4];
        printNQueens(arr, "", 0);
    }

    public static void printNQueens(int[][] chess, String queensSoFar, int row) {
        if (row == chess.length) {
            System.out.println(queensSoFar);
            return;
        }

        for (int col = 0; col < chess.length; col++) {
            if(isPlaceSafe(chess, row,col)){
                chess[row][col] = 1;
                printNQueens(chess, queensSoFar + row + "-" + col + ",", row + 1);
                chess[row][col] = 0;
            }
        }
    }

    public static boolean isPlaceSafe(int[][] chess, int row, int col) {

        // check vertically if there is any queen
        for (int i = row - 1, j = col; i >= 0; i--) {
            if (chess[i][j] == 1) {
                return false;
            }
        }

        // check left diagonally if there is any queen
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (chess[i][j] == 1) {
                return false;
            }
        }

        // check right diagonally if there is any queen
        for (int i = row - 1, j = col + 1; i >= 0 && j < chess.length; i--, j++) {
            if (chess[i][j] == 1) {
                return false;
            }
        }

        return true;
    }
}
