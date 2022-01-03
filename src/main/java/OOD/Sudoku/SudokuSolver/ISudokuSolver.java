package OOD.Sudoku.SudokuSolver;

import OOD.Sudoku.Entity.Sudoku;
import OOD.Sudoku.Solver.ISolver;

public abstract class ISudokuSolver {
    ISolver solver;

    public ISudokuSolver(ISolver solver) {
        this.solver = solver;
    }

    public abstract boolean solve(Sudoku sudoku);
}
