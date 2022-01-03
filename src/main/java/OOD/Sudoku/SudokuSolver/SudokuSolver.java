package OOD.Sudoku.SudokuSolver;

import OOD.Sudoku.Entity.Sudoku;
import OOD.Sudoku.Solver.ISolver;

public class SudokuSolver extends ISudokuSolver{

    public SudokuSolver(ISolver solver){
        super(solver);
    }
    @Override
    public boolean solve(Sudoku sudoku) {
        return this.solver.solve(sudoku);
    }
}
