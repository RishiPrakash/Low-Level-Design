package OOD.Sudoku.Solver;

import OOD.Sudoku.Entity.Sudoku;
import OOD.Sudoku.SudokuSolver.SudokuSolver;

public interface ISolver {
    boolean solve(Sudoku sudoku);
}
