package Composite;

public class Leaf extends Component {
    public Leaf(String name) {
        super(name);
    }

    @Override
    public void printList() {
        System.out.println(getName());
    }
}
