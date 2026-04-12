package State;

public class ConcreteState1 implements State {
    @Override
    public void stateMethod1(Context context) {
        System.out.print("今の状態：State1　実施処理：stateMethod1　");
        // 次の状態を、このConcreteState1自身が決める
        context.setState(new ConcreteState1());
        System.out.println("次の状態：State1");
    }

    @Override
    public void stateMethod2(Context context) {
        System.out.print("今の状態：State1　実施処理：stateMethod2　");
        context.setState(new ConcreteState2());
        System.out.println("次の状態：State2");
    }
}