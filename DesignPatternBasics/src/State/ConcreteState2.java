package State;

public class ConcreteState2 implements State{
    @Override
    public void stateMethod1() {
        System.out.print("今の状態：State2　実施処理：stateMethod1　");
    }

    @Override
    public void stateMethod2() {
        System.out.print("今の状態：State2　実施処理：stateMethod2　");
    }    
}
