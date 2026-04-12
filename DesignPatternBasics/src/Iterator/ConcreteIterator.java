package Iterator;

public class ConcreteIterator implements Iterator<Content> {
    private final ConcreteAggregate aggregate;
    private int index;

    public ConcreteIterator(ConcreteAggregate aggregate) {
        this.aggregate = aggregate;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < aggregate.getLength();
    }

    @Override
    public Content next() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException("次の要素が存在しません");
        }
        Content content = aggregate.getContentAt(index);
        index++;
        return content;
    }
}