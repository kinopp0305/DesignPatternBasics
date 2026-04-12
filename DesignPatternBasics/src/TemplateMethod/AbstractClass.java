package TemplateMethod;

public abstract class AbstractClass {

    // finalを付けることで、サブクラスによる「処理手順の書き換え（オーバーライド）」を防止する
    public final void templateMethod() {
        System.out.println("----- start -----");
        method1();                  // 具体的な処理内容はサブクラス任せ
        for (int i = 0; i < 5; i++) {
            method2();               // これも同様にサブクラス任せ
        }
        method3();                  // これも同様にサブクラス任せ
        System.out.println("-----  end  -----");
    }

    // 中身の実装はサブクラスに委ねる抽象メソッド
    protected abstract void method1();
    protected abstract void method2();
    protected abstract void method3();

}
