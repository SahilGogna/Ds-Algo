package recursion;

public class Q127 {
    public static void main(String[] args) {
        int[][] board = new int[6][7];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                board[i][j] = 0;
            }
        }

        boolean[][] visited = new boolean[6][7];

        board[0][1] = 1;
        board[1][1] = 1;
        board[1][3] = 1;
        board[1][4] = 1;
        board[1][5] = 1;
        board[3][0] = 1;
        board[3][2] = 1;
        board[3][3] = 1;
        board[3][5] = 1;
        board[3][6] = 1;
        board[4][0] = 1;
        board[4][2] = 1;
        board[4][3] = 1;
        board[4][5] = 1;
        board[4][6] = 1;
        board[5][0] = 1;

        floodFill(board, 0, 0, "", visited);

//        for(int i = 0; i< board.length; i++){
//            for(int j =0; j< board[0].length; j++){
//                System.out.print(board[i][j] + "\t");
//            }
//            System.out.println("\n");
//        }
    }

    public static void floodFill(int[][] maze, int row, int column, String pathSoFar, boolean[][] visited) {
        // note that order of checks matters
        if (row < 0 || column < 0 || row == maze.length ||
                column == maze[0].length || maze[row][column] == 1 ||
                visited[row][column] == true) {
            return;
        }

        // reached last cell
        if (row == maze.length - 1 && column == maze[0].length - 1) {
            System.out.println(pathSoFar);
            return;
        }

        visited[row][column] = true;

        floodFill(maze, row - 1, column, pathSoFar + " t", visited);
        floodFill(maze, row, column - 1, pathSoFar + " l", visited);
        floodFill(maze, row + 1, column, pathSoFar + " d", visited);
        floodFill(maze, row, column + 1, pathSoFar + " r", visited);

        visited[row][column] = false;
    }
}
