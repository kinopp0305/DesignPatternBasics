package Decorator;

public class ConcreteDecorator2 extends Decorator{
    public ConcreteDecorator2(Component component) {
        super(component);
    }

    @Override
    public void display() {
        System.out.println("***************");
        super.component.display();
        System.out.println("***************");
    }
}