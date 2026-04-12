package Observer;

public class ConcreteObserver2 implements Observer {
    @Override
    public void update() {
        System.out.println("ConcreteObserver2はSubjectの変更通知を受けました");
    }
}
