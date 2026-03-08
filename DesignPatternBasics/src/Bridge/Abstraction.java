package Bridge;

public class Abstraction {
    private final Implementor implementor;

    public Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }
    
    public void method1(){
        implementor.implMethodA();
    }
    public void method2(){
        implementor.implMethodB();
    } 
}
