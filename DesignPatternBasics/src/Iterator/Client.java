package Iterator;

public class Client {
    public static void main(String... args) {
        ConcreteAggregate concreteAggregate = new ConcreteAggregate();

        concreteAggregate.appendContent(new Content("１番目のコンテント"));
        concreteAggregate.appendContent(new Content("２番目のコンテント"));
        concreteAggregate.appendContent(new Content("３番目のコンテント"));

        Iterator<Content> iterator = concreteAggregate.iterator();
        while (iterator.hasNext()) {
            Content content = iterator.next();
            System.out.println(content.getName());
        }
    }
}