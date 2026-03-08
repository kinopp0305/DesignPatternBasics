package Command;

public class ConcreteCommand2 implements Command{

    Receiver receiver = new ConcreteReceiver();
    
    @Override
    public void execute() {
        System.out.println("--- ConcreteCommand2開始 ---");
        receiver.action3();
        receiver.action1();
        receiver.action2();    
    }
    
}
