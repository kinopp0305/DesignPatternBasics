package Proxy;

public class Proxy implements Subject {
    private RealSubject realSubject;

    @Override
    public void request1() {
        // 簡単な用件なので、代理人がその場で処理してしまう
        System.out.println("代理のリクエスト１です");
    }
    @Override
    public void request2() {
        System.out.println("代理のリクエスト２です");
    }
    @Override
    public void request3() {
        // Proxyが判断し、必要な場合のみRealSubjectを使用する
        createRealSubject();
        realSubject.request3();
    }

    private void createRealSubject() {
        // RealSubjectのインスタンスが存在しない場合のみインスタンス化する
        if (realSubject == null) {
            realSubject = new RealSubject();
        }
    }
}