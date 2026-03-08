package AbstractFactory.abstractfactory;

public abstract class AbstractProduct1 {  
    public void makeProduct1(){
        System.out.println("---- Product1生成過程開始 ----");
        execute1();
        execute2();
        System.out.println("---- Product1生成過程終了 ----");
    }
    public abstract void execute1();
    public abstract void execute2();
}
