/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interpreter;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 *
 * @author kinopp
 */
public class Parser {
    private List<Expression> parseTree = new ArrayList<Expression>();
 
    public Parser(String s) {
        for (String token : s.split(" ")) {
            if (token.equals("+")){
                parseTree.add( new TerminalExpressionPlus() );
            } else if (token.equals("-")) {
                parseTree.add( new TerminalExpressionMinus() );
            } else if (token.equals("*")) {
                parseTree.add( new TerminalExpressionMultiply() );
            } else {
                parseTree.add( new TerminalExpressionNumber(Integer.valueOf(token)) );
            }
        }
    }
 
    public int evaluate() {
        Stack<Integer> context = new Stack<Integer>(); 
        for (Expression e : parseTree){
            e.interpret(context);
        }
        return context.pop();
    }
}
