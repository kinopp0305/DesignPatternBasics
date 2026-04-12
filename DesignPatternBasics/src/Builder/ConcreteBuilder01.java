package Builder;

public class ConcreteBuilder01 implements Builder<String> {
    private String str;

    @Override
    public void builderPart1(String str) {
        appendString(str);
    }
    @Override
    public void builderPart2(String str) {
        appendString(str);
    }
    @Override
    public void builderPart3(String str) {
        appendString(str);
    }
    @Override
    public String getResult() {
        return this.str;
    }

    private void appendString(String str) {
        if (this.str == null) {
            this.str = str + ":";
        } else {
            this.str += str + ":";
        }
    }
}