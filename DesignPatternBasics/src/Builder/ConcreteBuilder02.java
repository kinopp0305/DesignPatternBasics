package Builder;

import java.util.ArrayList;
import java.util.List;

public class ConcreteBuilder02 implements Builder<List<String>> {
    private final List<String> list = new ArrayList<>();

    @Override
    public void builderPart1(String str) {
        list.add("01:" + str);
    }
    @Override
    public void builderPart2(String str) {
        list.add("02:" + str);
    }
    @Override
    public void builderPart3(String str) {
        list.add("03:" + str);
    }
    @Override
    public List<String> getResult() {
        return list;
    }
}