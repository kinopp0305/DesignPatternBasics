package Decorator;

public class ConcreteDecorator1 extends Decorator{

    public ConcreteDecorator1(Component component) {
        super(component);
    }

    @Override
    public void display() {
        System.out.println("---------------");
        super.component.display();
        System.out.println("---------------");
    }
}
