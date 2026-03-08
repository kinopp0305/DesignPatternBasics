/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iterator;

/**
 *
 * @author kinopp
 */
public class ConcreteIterator implements Iterator {

    private ConcreteAggregate aggregate;
    private int index;
    
    public ConcreteIterator(ConcreteAggregate aggregate){
        this.aggregate = aggregate;
        this.index = 0;
    }
    
    @Override
    public boolean hasNext() {
        return index < aggregate.getLength();
    }

    @Override
    public Object next() {
        Content content = aggregate.getContentAt(index);
        index++;
        return content;
    }
}
