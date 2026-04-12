package Singleton;

public class Client {
    public static void main(String... args) {
        Singleton singleton01 = Singleton.getInstance();
        Singleton singleton02 = Singleton.getInstance();

        // 2回取得したインスタンスが同じものかどうかを検証
        if (singleton01 == singleton02) {
            System.out.println("同じオブジェクトです");
        } else {
            System.out.println("違うオブジェクトです");
        }
    }
}
