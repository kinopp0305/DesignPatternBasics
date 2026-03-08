package Composite;

public abstract class Component {
    //Leafはadd出来ない為、デフォルトは例外とする。Nodeはaddメソッドをオーバーライドする
    public void add(Component composite) throws Exception{
        throw new Exception();
    }
    public abstract String getName();
    public abstract void printList();
}
