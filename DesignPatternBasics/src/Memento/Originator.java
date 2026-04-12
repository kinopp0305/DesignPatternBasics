package Memento;

public class Originator {
    private String state;

    public void setState(String state) {
        this.state = state;
        System.out.println("Originatorに" + state + "が設定されました");
    }

    public Object createMemento() {
        return new Memento(state);
    }

    public void restoreMemento(Object mementoObject) {
        Memento memento = (Memento) mementoObject;
        this.state = memento.getState();
        System.out.println("Originatorに" + state + "が再設定されました");
    }

    // privateなインナークラスにすることで、Originatorの外側（Caretakerなど）からは
    // 中身（getState）どころか、このクラスの存在自体に一切アクセスできなくなる
    private static class Memento {
        private final String state;

        private Memento(String state) {
            this.state = state;
            System.out.println("Mementoに" + state + "が設定されました");
        }

        private String getState() {
            return state;
        }
    }
}