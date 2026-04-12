package Command;

public class Invoker {
    private final Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void invoke() {
        command.execute();
    }
}