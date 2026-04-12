package AbstractFactory.concretefactory;

import AbstractFactory.abstractfactory.AbstractFactory;
import AbstractFactory.abstractfactory.AbstractProduct1;
import AbstractFactory.abstractfactory.AbstractProduct2;

public class ConcreteFactory extends AbstractFactory {
    @Override
    public AbstractProduct1 createAbstractProduct1() {
        System.out.println("Product1生成");
        return new ConcreteProduct1();
    }
    @Override
    public AbstractProduct2 createAbstractProduct2() {
        System.out.println("Product2生成");
        return new ConcreteProduct2();
    }
}
