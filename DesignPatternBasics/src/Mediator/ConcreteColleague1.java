package Mediator;

public class ConcreteColleague1 extends Colleague {
    @Override
    public void controlColleague(String message) {
        System.out.println("ConcreteColleague1が「" + message + "」のメッセージを受けました");
    }
}
