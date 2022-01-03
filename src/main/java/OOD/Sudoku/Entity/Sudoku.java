package OOD.Sudoku.Entity;

public class Sudoku {
    char[][] board;
    int gridSize;
    public Sudoku(int gridSize){
        this.gridSize = gridSize;
        this.board = new char[gridSize*gridSize][gridSize*gridSize];
    }
    public Sudoku(char[][] existingBoard, int gridSize){
        this.gridSize = gridSize;
        board = existingBoard;
    }
    public char[][] getBoard(){
        return this.board;
    }
    public  int getGridSize(){
        return this.gridSize;
    }
}
