package AbstractFactory.abstractfactory;

public abstract class AbstractProduct2 {
    public void makeProduct1(){
        System.out.println("---- Product2生成過程開始 ----");
        perform1();
        perform2();
        System.out.println("---- Product2生成過程終了 ----");
    }
    
    public abstract void perform1();
    public abstract void perform2();
}
