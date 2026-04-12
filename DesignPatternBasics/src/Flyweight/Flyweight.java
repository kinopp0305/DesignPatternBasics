package Flyweight;

public class Flyweight {
    // 内部状態：どのインスタンスも共通で、一度作ったら変更しない（immutable）
    private final char symbol;

    public Flyweight(char symbol) {
        this.symbol = symbol;
    }

    // 外部状態（表示位置）は、呼び出しのたびに外から渡してもらう
    public void print(int row, int column) {
        System.out.println("(" + row + ", " + column + ") に '" + symbol + "' を表示");
    }
}
