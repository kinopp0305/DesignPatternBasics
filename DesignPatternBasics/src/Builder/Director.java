/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

/**
 *
 * @author kinopp
 */
public class Director {
    private Builder builder;
    
    public Director(String className) throws Exception{   
        try {
            final String fullyQualifiedClassName = Builder.class.getPackage().getName() + "." + className;
            builder = (Builder)Class.forName(fullyQualifiedClassName).newInstance();
        } catch (ClassNotFoundException ex) {
            // 注意：生成対象のクラスは当クラスと同パッケージに存在する必要があります。
            System.err.println("クラスの指定が正しくありません");
            throw ex;
        }
    }
    
    public void constract(){
        System.out.println("----- start -----");
        builder.buiderPart1();
        for (int i=0; i<5; i++){
            builder.buiderPart2();
        }
        builder.buiderPart3();
        System.out.println("-----  end  -----");
    }
    
}
