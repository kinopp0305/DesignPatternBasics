package Builder;

public interface Builder<T> {
    void builderPart1(String str);
    void builderPart2(String str);
    void builderPart3(String str);
    T getResult();
}