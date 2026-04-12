package Observer;

public class ConcreteSubject extends Subject {
    @Override
    public void getSubjectStatus() {
        System.out.println("ConcreteSubjectに変更が発生しました");
    }
}