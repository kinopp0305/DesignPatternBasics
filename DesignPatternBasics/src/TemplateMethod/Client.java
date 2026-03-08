package TemplateMethod;

public class Client {
    public static void main(String... args){
        AbstractClass clazz = new ConcreteClass();
        // TemplateMethodを実行
        clazz.templateMethod();
    }
}
