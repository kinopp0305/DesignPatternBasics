package Memento;

public class Client {
    public static void main(String... args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker(originator);

        originator.setState("初期設定");
        caretaker.createSnapShot(); // 思い出作成

        originator.setState("修正１回目");
        caretaker.createSnapShot(); // 思い出作成

        originator.setState("修正２回目");
        caretaker.createSnapShot(); // 思い出作成

        caretaker.undo();
        caretaker.undo();

        caretaker.redo();
        caretaker.redo();
    }
}
