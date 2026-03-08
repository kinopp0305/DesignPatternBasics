package Visitor;

import java.util.Iterator;

public abstract class Component implements Element{
    //Leafはadd出来ない為、デフォルトは例外とする。Nodeはaddメソッドをオーバーライドする
    public void add(Component component) throws Exception{
        throw new Exception();
    }
    
    public Iterator iterator() throws Exception {
        throw new Exception();
    }
    
    public abstract String getName();
}
