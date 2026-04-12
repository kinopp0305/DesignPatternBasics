package Adapter;

public class Adapter implements Target {
    private final Adaptee adaptee;

    // 既存のAdapteeインスタンスを外部から受け取る形にすることで、
    // より柔軟で疎結合な実装になる（コンストラクタ注入 / DI）
    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void newMethod1() {
        adaptee.oldMethod1();
    }

    @Override
    public void newMethod2() {
        adaptee.oldMethod2();
    }
}
