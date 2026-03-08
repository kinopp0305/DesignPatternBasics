/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interpreter;

import java.util.Stack;

/**
 *
 * @author kinopp
 */
public class TerminalExpressionMultiply implements Expression {
    @Override
    public void interpret(Stack<Integer> stack) {
        stack.push( stack.pop() * stack.pop() ); 
    }
}