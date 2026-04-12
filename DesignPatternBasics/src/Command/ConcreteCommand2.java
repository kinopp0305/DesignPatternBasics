package Command;

public class ConcreteCommand2 implements Command {
    private final Receiver receiver;

    public ConcreteCommand2(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        System.out.println("--- ConcreteCommand2開始 ---");
        receiver.action3();
        receiver.action1();
        receiver.action2();
    }
}
