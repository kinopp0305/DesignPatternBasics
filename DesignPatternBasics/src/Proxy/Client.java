/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proxy;

/**
 *
 * @author kinopp
 */
public class Client {
    public static void main(String... args){
        Subject subject = new Proxy();
        subject.request1();
        subject.request2();
        subject.request3();
    }
}
