package AbstractFactory;

import AbstractFactory.abstractfactory.AbstractFactory;

public class Client {
    public static void main(String... args) throws Exception{
        final String fullyQualifiedClassName = "AbstractFactory.concretefactory.ConcreteFactory";
        AbstractFactory factory = AbstractFactory.getInstance(fullyQualifiedClassName); 
        factory.makeProduct();
    }
}
