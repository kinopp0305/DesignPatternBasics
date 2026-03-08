package Command;

public class Invoker {
    private Command command;
    
    public Invoker(String className) throws Exception{   
        try {
            final String fullyQualifiedClassName = Command.class.getPackage().getName() + "." + className;
            command = (Command)Class.forName(fullyQualifiedClassName).newInstance();
        } catch (ClassNotFoundException ex) {
            // 注意：生成対象のクラスは当クラスと同パッケージに存在する必要があります。
            System.err.println("クラスの指定が正しくありません");
            throw ex;
        }
    }
    
    public void invoke(){
        command.execute();
    }
}
