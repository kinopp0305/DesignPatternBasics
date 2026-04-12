package Flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private final Map<String, Flyweight> pool = new HashMap<>();

    private static final FlyweightFactory singleton = new FlyweightFactory();

    private FlyweightFactory() {
    }

    public static FlyweightFactory getInstance() {
        return singleton;
    }

    public synchronized Flyweight getFlyweight(String key) {
        Flyweight flyweight = pool.get(key);
        if (flyweight == null) {
            flyweight = new Flyweight(key.charAt(0));
            pool.put(key, flyweight);
            System.out.println("インスタンスを生成しました：" + key);
        }
        return flyweight;
    }
}