package OOD.Sudoku;

import OOD.Sudoku.Entity.Sudoku;
import OOD.Sudoku.Solver.BackTrackingSolver;
import OOD.Sudoku.Solver.ISolver;
import OOD.Sudoku.SudokuSolver.ISudokuSolver;
import OOD.Sudoku.SudokuSolver.SudokuSolver;

public class Client {
    public static void main(String[] args) {
        int gridSize = 3;
        Sudoku sudoku = new Sudoku(gridSize);

        ISolver backTrackingSolver = new BackTrackingSolver();
        ISudokuSolver sudokuSolver = new SudokuSolver(backTrackingSolver);
        sudokuSolver.solve(sudoku);
    }
}


