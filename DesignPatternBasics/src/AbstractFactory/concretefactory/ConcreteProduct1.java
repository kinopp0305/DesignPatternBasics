package AbstractFactory.concretefactory;

import AbstractFactory.abstractfactory.*;

public class ConcreteProduct1 extends AbstractProduct1{
    @Override
    public void execute1() {
        System.out.println("ConcreteProduct1.execute1実行");
    }

    @Override
    public void execute2() {
        System.out.println("ConcreteProduct1.execute2実行");
    }
}
