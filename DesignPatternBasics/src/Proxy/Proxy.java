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
public class Proxy implements Subject{

    private RealSubject realSubject;
    
    @Override
    public void request1() {
        System.out.println("代理のリクエスト１です");
    }

    @Override
    public void request2() {
        System.out.println("代理のリクエスト２です");
    }

    @Override
    public void request3() {
        createRealSubject();
        //Proxyが判断し必要な場合のみRealSubjectを使用する。
        realSubject.request3();
    }
    
    private void createRealSubject(){
        //RealSubjectのインスタンスが存在しない場合のみインスタンス化する。
        if (realSubject == null){
            realSubject = new RealSubject();
        }
    }
}
