package Proxy;

public class RealSubject implements Subject {
    @Override
    public void request1() {
        System.out.println("実際の主体のリクエスト１です");
    }
    @Override
    public void request2() {
        System.out.println("実際の主体のリクエスト２です");
    }
    @Override
    public void request3() {
        System.out.println("実際の主体のリクエスト３です");
    }
}