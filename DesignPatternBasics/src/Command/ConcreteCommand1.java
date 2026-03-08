package Command;

public class ConcreteCommand1 implements Command{

    Receiver receiver = new ConcreteReceiver();
    
    @Override
    public void execute() {
        System.out.println("--- ConcreteCommand1開始 ---");
        receiver.action1();
        receiver.action2();
        receiver.action3();
    }
    
}
