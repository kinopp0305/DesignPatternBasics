package Strategy;

public class Context {
    // ContextクラスはStrategyを持つ。持つのはクラスではなくインタフェース。
    // 大事なのは、Contextクラスが具体的にどのStrategyかを意識しなくてよいこと。
    private final Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void execute() {
        System.out.println("これから戦略を実行します！");

        // 何らかの戦略のexecuteメソッドを実行する。
        // Context自身は、これが具体的にどの戦略なのかを知らない。
        strategy.execute();

        System.out.println("戦略を実行しました！");
    }
}