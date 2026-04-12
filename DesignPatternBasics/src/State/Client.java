package State;

public class Client {
    public static void main(String... args) {
        Context context = new Context(new ConcreteState1()); // 初期値 State1
        context.contextMethod1(); // 状態がState1のとき、State1のstateMethod1を実施　状態：State1のまま
        context.contextMethod2(); // 状態がState1のとき、State1のstateMethod2を実施　状態：State2に変化
        context.contextMethod2(); // 状態がState2のとき、State2のstateMethod2を実施　状態：State2のまま
        context.contextMethod1(); // 状態がState2のとき、State2のstateMethod1を実施　状態：State1に変化
    }
}
