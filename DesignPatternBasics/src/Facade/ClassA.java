package Facade;

//publicを付けず package-private にすることで、
//このクラス自体を別パッケージから直接使えないようにする
class ClassA {
 // クラス自体が非公開なので、メソッドはpublicにしてよい
 public void methodA() {
     System.out.println("methodAです");
 }
}


