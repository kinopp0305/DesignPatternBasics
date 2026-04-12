package State;

public class Context {
    private State state;

    public Context(State state) {
        this.state = state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void contextMethod1() {
        state.stateMethod1(this);
    }

    public void contextMethod2() {
        state.stateMethod2(this);
    }
}
