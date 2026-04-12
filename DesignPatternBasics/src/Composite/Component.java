package Composite;

public abstract class Component {
    private final String name;

    protected Component(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Leafはadd()できないため、デフォルトでは「サポートしていない操作」として例外を投げる。
    // Compositeはこのメソッドをオーバーライドして、実際に子要素を追加できるようにする。
    public void add(Component component) {
        throw new UnsupportedOperationException(getName() + "には子要素を追加できません");
    }

    public abstract void printList();
}
