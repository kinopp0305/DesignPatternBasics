/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interpreter;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Parser {
    private final List<Expression> parseTree = new ArrayList<>();

    public Parser(String s) {
        for (String token : s.split(" ")) {
            if (token.equals("+")) {
                parseTree.add(new TerminalExpressionPlus());
            } else if (token.equals("-")) {
                parseTree.add(new TerminalExpressionMinus());
            } else if (token.equals("*")) {
                parseTree.add(new TerminalExpressionMultiply());
            } else {
                parseTree.add(new TerminalExpressionNumber(Integer.parseInt(token)));
            }
        }
    }

    public int evaluate() {
        Deque<Integer> context = new ArrayDeque<>();
        for (Expression e : parseTree) {
            e.interpret(context);
        }
        return context.pop();
    }
}