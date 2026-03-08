package Visitor;

import java.util.Iterator;

public class ListVisitor implements Visitor{

    @Override
    public void visit(Leaf leaf) {
        System.out.println(leaf.getName());
    }

    @Override
    public void visit(Composite composite) {
        System.out.println(composite.getName());
        // 配下のComponent及びLeafを全て表示
        Iterator<Component> iterator = composite.iterator();
        while (iterator.hasNext()){
            Component comp = iterator.next();
            comp.accept(this);
        }
    }
    
}
