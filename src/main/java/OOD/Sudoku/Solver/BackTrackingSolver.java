package OOD.Sudoku.Solver;

import OOD.Sudoku.Entity.Sudoku;

public class BackTrackingSolver implements ISolver {


    @Override
    public boolean solve(Sudoku sudoku) {
        int gridSize = sudoku.getGridSize();
        char[][] board = sudoku.getBoard();
        char minChar = '1';
        char maxChar = (char) (minChar + board.length - 1);
        return solve(board, gridSize, minChar, maxChar);
    }

    private boolean solve(char[][] board, int gridSize, char minChar, char maxChar) {
        int N = board.length;
        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {
                if (isEmpty(board, r, c)) {
                    for (char i = minChar; i <= maxChar; i++) {
                        if (isValidFill(board, r, c, i, gridSize)) {
                            fillChar(board, r, c, i);
                            if (solve(board, gridSize, minChar, maxChar)) {
                                return true;
                            }
                            revertChar(board, r, c);
                        }
                    }
                    return false;
                }
            }
        }
        return false;
    }

    private void revertChar(char[][] board, int r, int c) {
        board[r][c] = '.';
    }

    private void fillChar(char[][] board, int r, int c, char currentChar) {
        board[r][c] = currentChar;
    }

    private boolean isValidFill(char[][] board, int r, int c, char currentChar, int gridSize) {
        return isValidRowFill(board, r, c, currentChar) && isValidColumnFill(board, r, c, currentChar) && isValidGridFill(board, r, c, currentChar, gridSize);
    }

    private boolean isValidRowFill(char[][] board, int r, int c, char currentChar) {
        for (int column = 0; column < board[r].length; column++) {
            if (board[r][column] == currentChar) return false;
        }
        return true;
    }

    private boolean isValidColumnFill(char[][] board, int r, int c, char currentChar) {
        for (int row = 0; row < board.length; row++) {
            if (board[row][c] == currentChar) {
                return false;
            }
        }
        return true;
    }

    private boolean isValidGridFill(char[][] board, int r, int c, char currentChar, int gridSize) {
        int row = (r / gridSize) * gridSize;
        int column = (c / gridSize) * gridSize;
        int row_bound = (r / gridSize + 1) * gridSize;
        int column_bound = (c / gridSize + 1) * gridSize;
        for (; row < row_bound; r++) {
            for (; column < column_bound; c++) {
                if (board[row][column] == currentChar) return false;
                column = (c / gridSize) * gridSize;
            }
            row = (r / gridSize) * gridSize;
        }
        return true;
    }

    private boolean isEmpty(char[][] board, int r, int c) {
        return board[r][c] == '.';
    }
}
