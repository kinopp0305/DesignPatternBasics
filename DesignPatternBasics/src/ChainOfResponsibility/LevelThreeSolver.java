package ChainOfResponsibility;

public class LevelThreeSolver extends Solver{
    public LevelThreeSolver(String solverName) {
        super(solverName);
    }

    @Override
    protected boolean resolve(int problemLevel) {
        return problemLevel <= 3;
    }
}
