package Bridge;

public class Client {
    public static void main(String... args){
        RefinedAbstraction abstraction = new RefinedAbstraction(new ConcreteImplementor());
        abstraction.refineMethodA();
        abstraction.refineMethodB();
    }
}
