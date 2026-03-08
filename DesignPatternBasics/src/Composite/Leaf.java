package Composite;

public class Leaf extends Component{

    private final String name;
    
    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void printList() {
        System.out.println(this.getName());
    }
}
