package Command;

public class ConcreteCommand1 implements Command {
    private final Receiver receiver;

    // Receiverを外部から受け取ることで、どのReceiverとでも組み合わせられるようにする
    public ConcreteCommand1(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        System.out.println("--- ConcreteCommand1開始 ---");
        receiver.action1();
        receiver.action2();
        receiver.action3();
    }
}