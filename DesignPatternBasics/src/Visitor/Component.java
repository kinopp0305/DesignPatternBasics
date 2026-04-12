package Visitor;

import java.util.Iterator;

public abstract class Component implements Element {
    // Leafはadd()できないため、デフォルトでは「サポートしていない操作」として例外を投げる
    public void add(Component component) {
        throw new UnsupportedOperationException(getName() + "には子要素を追加できません");
    }

    public Iterator<Component> iterator() {
        throw new UnsupportedOperationException(getName() + "は子要素を持てません");
    }

    public abstract String getName();
}