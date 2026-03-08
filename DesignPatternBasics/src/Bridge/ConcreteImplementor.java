package Bridge;

public class ConcreteImplementor implements Implementor{

    @Override
    public void implMethodA() {
        System.out.println("実装メソッドAです");
    }

    @Override
    public void implMethodB() {
        System.out.println("実装メソッドBです");
    }
    
}
