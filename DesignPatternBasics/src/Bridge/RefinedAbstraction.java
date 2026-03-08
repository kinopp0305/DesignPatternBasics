package Bridge;

public class RefinedAbstraction extends Abstraction{

    public RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }

    public void refineMethodA() {
        method1();
        System.out.println("機能メソッドAです");
    }

    public void refineMethodB() {
        method2();
        System.out.println("機能メソッドBです");
    }
}
