package State;

public class ConcreteState2 implements State {
    @Override
    public void stateMethod1(Context context) {
        System.out.print("今の状態：State2　実施処理：stateMethod1　");
        context.setState(new ConcreteState1());
        System.out.println("次の状態：State1");
    }

    @Override
    public void stateMethod2(Context context) {
        System.out.print("今の状態：State2　実施処理：stateMethod2　");
        context.setState(new ConcreteState2());
        System.out.println("次の状態：State2");
    }
}