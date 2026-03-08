package Interpreter;

public class Client {
    public static void main(String[] args){
        String expression = "1 2 - 4 5 + *";
        Parser parser = new Parser(expression);
        System.out.println("'" + expression +"' equals " + parser.evaluate());
    }
}
