package Singleton;

public class Singleton {
    // クラス読み込み時に1度だけインスタンスが生成される。
    // JVMの仕様上、この初期化処理自体がスレッドセーフなので、
    // 以降のgetInstance()にsynchronizedは不要。
    private static final Singleton SINGLETON = new Singleton();

    // コンストラクタをprivateにし、外部からのnewと継承を禁止する。
    private Singleton() {
    }

    // このメソッドを通してのみインスタンスを取得できる。
    // 常に同じ、すでに作られているインスタンスを返すだけ。
    public static Singleton getInstance() {
        return SINGLETON;
    }
}
