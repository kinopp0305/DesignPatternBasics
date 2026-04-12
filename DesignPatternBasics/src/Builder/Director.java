package Builder;

public class Director<T> {
    private final Builder<T> builder;

    public Director(Builder<T> builder) {
        this.builder = builder;
    }

    public T construct() {
        builder.builderPart1("X");
        builder.builderPart2("Y");
        builder.builderPart3("Z");
        return builder.getResult();
    }
}