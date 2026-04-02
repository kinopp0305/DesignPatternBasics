package Command;

public class Client {
    public static void main(String... args) throws Exception{
        Invoker invoker1 = new Invoker(new ConcreteCommand1());
        invoker1.invoke();
        
        Invoker invoker2 = new Invoker(new ConcreteCommand2());
        invoker2.invoke();
    }
}
