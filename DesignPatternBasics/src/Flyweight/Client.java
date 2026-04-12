package Flyweight;

public class Client {
    public static void main(String... args) {
        FlyweightFactory flyweightFactory = FlyweightFactory.getInstance();

        Flyweight flyweight1 = flyweightFactory.getFlyweight("a");
        Flyweight flyweight2 = flyweightFactory.getFlyweight("b");
        Flyweight flyweight3 = flyweightFactory.getFlyweight("a");
        Flyweight flyweight4 = flyweightFactory.getFlyweight("c");

        // flyweight1とflyweight3は、どちらもキー"a"から取得した同じインスタンス
        System.out.println("flyweight1とflyweight3は同じインスタンスか：" + (flyweight1 == flyweight3));

        // 同じ内部状態（文字）を持つFlyweightを、異なる外部状態（位置）に使い回す
        flyweight1.print(0, 0);
        flyweight2.print(0, 1);
        flyweight3.print(1, 0); // flyweight1と同じインスタンスだが、別の位置に表示できる
        flyweight4.print(1, 1);
    }
}