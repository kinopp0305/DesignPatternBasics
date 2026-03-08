package Composite;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component{

    private final String name;
    private final List<Component> components = new ArrayList<>();

    public Composite(String name) {
        this.name = name;
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
    public void printList() {
        System.out.println(this.getName());
        // 配下のComponent及びLeafを全て表示
        for(Component component: components){
            component.printList();
        }
    }
}
