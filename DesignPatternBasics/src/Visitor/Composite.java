package Visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Composite extends Component{

    private final String name;
    private final List<Component> components = new ArrayList<>();

    public Composite(String name) {
        this.name = name;
    }
    
    @Override
    public Iterator iterator() {
        return components.iterator();
    }
    
    @Override
    public void add(Component component){
        components.add(component);
    }
    
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
