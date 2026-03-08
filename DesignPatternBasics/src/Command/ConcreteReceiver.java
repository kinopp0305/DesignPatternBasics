package Command;

public class ConcreteReceiver implements Receiver{

    @Override
    public void action1() {
        System.out.println("action1です");
    }

    @Override
    public void action2() {
        System.out.println("action2です");
    }

    @Override
    public void action3() {
        System.out.println("action3です");
    }
    
}
