package FactoryMethod;

public class ConcreteFactory extends Factory {
    // ConcreteFactoryはConcreteProductを生成することをここに実装
    @Override
    protected Product factoryMethod() {
        return new ConcreteProduct();
    }
}
