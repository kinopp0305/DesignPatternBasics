package Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    private final List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    // 登録解除の手段も用意しておく（Lapsed Listener問題を避けるために必須）
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        getSubjectStatus();
        for (Observer observer : observers) {
            observer.update();
        }
    }

    public abstract void getSubjectStatus();
}
