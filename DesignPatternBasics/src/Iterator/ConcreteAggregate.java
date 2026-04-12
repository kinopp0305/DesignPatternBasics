package Iterator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteAggregate implements Aggregate<Content> {
    private final List<Content> contents;

    public ConcreteAggregate() {
        this.contents = new ArrayList<>();
    }

    public Content getContentAt(int index) {
        return contents.get(index);
    }

    public void appendContent(Content content) {
        this.contents.add(content);
    }

    public int getLength() {
        return contents.size();
    }

    @Override
    public Iterator<Content> iterator() {
        return new ConcreteIterator(this);
    }
}