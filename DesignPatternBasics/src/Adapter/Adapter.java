package Adapter;

public class Adapter implements Target{
    private final Adaptee adaptee;
    
    public Adapter(){
        this.adaptee = new Adaptee();
    }

    @Override
    public void newMethod1() {
        adaptee.oldMethod1();
    }

    @Override
    public void newMethod2() {
        adaptee.oldMethod2();
    }
}
