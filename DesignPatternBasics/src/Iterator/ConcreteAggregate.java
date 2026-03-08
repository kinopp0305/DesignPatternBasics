/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iterator;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kinopp
 */
public class ConcreteAggregate implements Aggregate{

    private List contents;
    
    public ConcreteAggregate(){
        this.contents = new ArrayList();
    }
    
    public Content getContentAt(int index){
        return (Content)contents.get(index);
    }
    
    public void appendContent(Content content){
        this.contents.add(content);
    }
    
    public int getLength(){
        return contents.size();
    }
    
    @Override
    public Iterator iterator() {
        return new ConcreteIterator(this);
    }
}
