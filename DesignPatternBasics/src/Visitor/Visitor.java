package Visitor;

public interface Visitor {
    public void visit(Leaf leaf);
    public void visit(Composite composite);
}
