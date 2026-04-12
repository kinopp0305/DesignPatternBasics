package Observer;

public class ConcreteObserver1 implements Observer {
    @Override
    public void update() {
        System.out.println("ConcreteObserver1はSubjectの変更通知を受けました");
    }
}