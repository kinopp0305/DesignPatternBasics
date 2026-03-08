package State;

public class Client {
    public static void main(String... args) throws Exception{    
        Context context = new Context(new ConcreteState1());  //初期値 State1
        context.contextMethod1();  //状態がState1の時、State1のcontextMethod1を実施　状態：State1のまま
        context.contextMethod2();  //状態がState1の時、State1のcontextMethod2を実施 　状態：State2に変化
        context.contextMethod2();  //状態がState2の時、State2のcontextMethod2を実施 　状態：State2のまま
        context.contextMethod1();  //状態がState2の時、State2のcontextMethod1を実施 　状態：State1に変化
    }
}
