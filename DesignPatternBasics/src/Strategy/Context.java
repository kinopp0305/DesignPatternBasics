package Strategy;

public class Context {
    // ContextクラスはStrategyを持つ。持つのはクラスではなくインタフェース
    // 大事なのは、Contextクラスは具体的にどのStrategyかを意識させないこと！
    private final Strategy strategy;
    
//    オブジェクトを引数にすることはできず、文字列でクラス名を渡す場合
//    public Context(String className) throws Exception{   
//        try {
//            final String fullyQualifiedClassName = Strategy.class.getPackage().getName() + "." + className;
//            strategy = (Strategy)Class.forName(fullyQualifiedClassName).newInstance();
//        } catch (ClassNotFoundException ex) {
//            // 注意：生成対象のクラスは当クラスと同パッケージに存在する必要があります。
//            System.err.println("クラスの指定が正しくありません");
//            throw ex;
//        }
//    }
    public Context(Strategy strategy) {   
        this.strategy = strategy;
    }

    public void execute(){
        System.out.println("これから戦略を実行します！");
        
        // 何かしらの戦略のexecuteメソッドを実行する。
        strategy.execute();
        
        System.out.println("戦略を実行しました！");
    }
}
