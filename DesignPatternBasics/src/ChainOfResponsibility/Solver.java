package ChainOfResponsibility;

public abstract class Solver {
    private final String solverName;
    private Solver nextSolver;
  
    public Solver(String solverName){
        this.solverName = solverName;
    }
    
    public Solver setNext(Solver nextSolver) {
        this.nextSolver = nextSolver;
        return nextSolver;
    }
    
    public final void support(int problemLevel){
        if (resolve(problemLevel)){
            done(problemLevel);
        } else if (nextSolver != null){
            nextSolver.support(problemLevel);
        } else {
            fail(problemLevel);
        }
    }
    
    protected abstract boolean resolve(int problemLevel);
    
    private void done(int problemLevel){
        System.out.println(solverName + "が解決しました。Level" + problemLevel);
    }
    
    private void fail(int problemLevel){
        System.out.println("解決できませんでした。Level" + problemLevel);
    }
}
