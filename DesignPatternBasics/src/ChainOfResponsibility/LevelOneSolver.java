package ChainOfResponsibility;

public class LevelOneSolver extends Solver{
    public LevelOneSolver(String solverName) {
        super(solverName);
    }

    @Override
    protected boolean resolve(int problemLevel) {
        return problemLevel <= 1;
    }
}
