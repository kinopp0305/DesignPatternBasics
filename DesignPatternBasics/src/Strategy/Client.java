package Strategy;

public class Client {
    public static void main(String... args) throws Exception {
        Context context1 = new Context(new ConcreteStrategy1()); // 戦略1を渡す
        context1.execute();

        System.out.println("----------------------------------------------------");

        Context context2 = new Context(new ConcreteStrategy2()); // 戦略2を渡す
        context2.execute();
    }
}
