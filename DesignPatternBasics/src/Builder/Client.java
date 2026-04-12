package Builder;

public class Client {
    public static void main(String... args) throws Exception {
        Director director01 = new Director(new ConcreteBuilder01());
        System.out.println(director01.construct());

        Director director02 = new Director(new ConcreteBuilder02());
        System.out.println(director02.construct());
    }
}
