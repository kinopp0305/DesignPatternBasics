package AbstractFactory.concretefactory;

import AbstractFactory.abstractfactory.AbstractProduct2;

public class ConcreteProduct2 extends AbstractProduct2{
    @Override
    public void perform1() {
        System.out.println("ConcreteProduct2.perform1実行");
    }

    @Override
    public void perform2() {
        System.out.println("ConcreteProduct2.perform2実行");
    }   
}
