package State;

public class Context {
    private State state;
    
    public Context(State state){
        this.state = state;
    }

    public void contextMethod1(){
        state.stateMethod1();
        state = new ConcreteState1(); 
        System.out.println("次の状態：State1");
    }
    
    public void contextMethod2(){
        state.stateMethod2();
        state = new ConcreteState2();
        System.out.println("次の状態：State2");
    }
}
