package TemplateMethod;

public class ConcreteClass extends AbstractClass{

    @Override
    protected void method1() {
        System.out.println("method1です");
    }

    @Override
    protected void method2() {
        System.out.println("method2です");
    }

    @Override
    protected void method3() {
        System.out.println("method3です");
    }
    
}
