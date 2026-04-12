package Mediator;

public class ConcreteColleague2 extends Colleague {
    @Override
    public void controlColleague(String message) {
        System.out.println("ConcreteColleague2が「" + message + "」のメッセージを受けました");
    }
}
