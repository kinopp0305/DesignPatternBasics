package Composite;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {
    private final List<Component> components = new ArrayList<>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        components.add(component);
    }

    @Override
    public void printList() {
        System.out.println(getName());
        // 配下のComponent（Leaf・Composite問わず）をすべて表示
        for (Component component : components) {
            component.printList();
        }
    }
}