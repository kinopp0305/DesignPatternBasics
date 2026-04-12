package FactoryMethod;

public abstract class Factory {
    // 外部にはこちらの公開メソッドだけを見せる
    public final Product create() {
        // ここで事前処理（ログ出力やパラメータチェックなど）を行うことも可能
        Product product = factoryMethod();
        // ここで後処理（生成した製品の登録処理など）を行うことも可能
        return product;
    }

    // 何の製品を作るかはサブクラスに任せる（画像でいうcreateProduct()に相当）
    protected abstract Product factoryMethod();
}
