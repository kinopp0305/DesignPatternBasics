package Observer;

public class Client {
    public static void main(String... args) {
        Subject subject = new ConcreteSubject();
        Observer observer1 = new ConcreteObserver1();
        Observer observer2 = new ConcreteObserver2();

        subject.addObserver(observer1);
        subject.addObserver(observer2);
        subject.notifyObservers();

        // 登録解除すれば、以降は通知が届かなくなる
        subject.removeObserver(observer1);
        System.out.println("--- observer1を解除後 ---");
        subject.notifyObservers();
    }
}
