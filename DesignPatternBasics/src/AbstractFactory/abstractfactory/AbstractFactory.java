package AbstractFactory.abstractfactory;

public abstract class AbstractFactory {
   public static AbstractFactory getInstance(String className) throws Exception{   
       AbstractFactory abstractFactory = null;
       try {
            abstractFactory = (AbstractFactory)Class.forName(className).newInstance();
        } catch (ClassNotFoundException ex) {
            System.err.println("クラスの指定が正しくありません");
            throw ex;
        }
       return abstractFactory;
    }
   
    public void makeProduct(){
        System.out.println("---- 製品生成開始 ----");
        createAbstractProduct1().makeProduct1();
        createAbstractProduct2().makeProduct1();
        System.out.println("---- 製品生成終了 ----");
    }

    public abstract AbstractProduct1 createAbstractProduct1();
    public abstract AbstractProduct2 createAbstractProduct2();
}
