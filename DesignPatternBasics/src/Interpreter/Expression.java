package Interpreter;

import java.util.Deque;

public interface Expression {
    void interpret(Deque<Integer> stack);
}