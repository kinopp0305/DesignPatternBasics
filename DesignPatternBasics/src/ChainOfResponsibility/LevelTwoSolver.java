package ChainOfResponsibility;

public class LevelTwoSolver extends Solver{
    public LevelTwoSolver(String solverName) {
        super(solverName);
    }

    @Override
    protected boolean resolve(int problemLevel) {
        return problemLevel <= 2;
    }  
}
