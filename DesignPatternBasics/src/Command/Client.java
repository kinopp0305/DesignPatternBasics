package Command;

public class Client {
    public static void main(String... args) throws Exception {
        Receiver receiver = new ConcreteReceiver();

        Invoker invoker1 = new Invoker(new ConcreteCommand1(receiver));
        invoker1.invoke();

        Invoker invoker2 = new Invoker(new ConcreteCommand2(receiver));
        invoker2.invoke();
    }
}