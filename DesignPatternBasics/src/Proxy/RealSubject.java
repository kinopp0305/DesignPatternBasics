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
public class RealSubject implements Subject{

    @Override
    public void request1() {
        System.out.println("実際の主体のリクエスト１です");
    }

    @Override
    public void request2() {
        System.out.println("実際の主体のリクエスト２です");
    }

    @Override
    public void request3() {
        System.out.println("実際の主体のリクエスト３です");
    }
    
}
