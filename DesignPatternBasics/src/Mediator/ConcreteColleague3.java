package Mediator;

public class ConcreteColleague3 extends Colleague {
    @Override
    public void controlColleague(String message) {
        System.out.println("ConcreteColleague3が「" + message + "」のメッセージを受けました");
    }
}
