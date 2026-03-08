package Decorator;

public class ConcreteComponent extends Component{

    private final String string;
    
    public ConcreteComponent(String string) {
        this.string = string;
    }
    
    @Override
    public void display() {
        System.out.println(string);
    }
    
}
