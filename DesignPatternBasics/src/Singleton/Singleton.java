package Singleton;

/**
 * Singletonのサンプル
 */
public class Singleton {

    private static final Singleton SINGLETON = new Singleton();

    // コンストラクタをprivateにすることでインスタンス化および継承を禁止する。
    private Singleton() {                                 
    }

    /**
     * インスタンス取得メソッド
     * @return 当クラスのインスタンス
     */
    public static synchronized Singleton getInstance() {
        // このメソッドを通してのみインスタンスを取得できる。
        // staticなインスタンスなのでどこから呼ばれても常に同じオブジェクトを渡す。
        // 同時実行を考慮し、synchronizedとする
        return SINGLETON;
    }
}
