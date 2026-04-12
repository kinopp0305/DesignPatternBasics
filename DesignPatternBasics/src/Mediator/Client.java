package Mediator;

public class Client {
    public static void main(String... args) {

        Colleague colleague11 = new ConcreteColleague1();
        Colleague colleague12 = new ConcreteColleague1();
        Colleague colleague21 = new ConcreteColleague2();
        Colleague colleague31 = new ConcreteColleague3();

        // 1回目の判定（1つだけ未使用あり）
        Mediator mediator1 = new ConcreteMediator();
        colleague11.setStatus("未使用");
        colleague12.setStatus("使用済");
        colleague21.setStatus("使用済");
        colleague31.setStatus("使用済");

        mediator1.addColleague(colleague11);
        mediator1.addColleague(colleague12);
        mediator1.addColleague(colleague21);
        mediator1.addColleague(colleague31);

        mediator1.colleagueChanged();

        // 2回目の判定（未使用なし）
        Mediator mediator2 = new ConcreteMediator();

        colleague11.setStatus("使用済");
        colleague12.setStatus("使用済");
        colleague21.setStatus("使用済");
        colleague31.setStatus("使用済");

        mediator2.addColleague(colleague11);
        mediator2.addColleague(colleague12);
        mediator2.addColleague(colleague21);
        mediator2.addColleague(colleague31);

        mediator2.colleagueChanged();
    }
}