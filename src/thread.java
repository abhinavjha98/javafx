import java.lang.*;
import java.util.logging.Level;
import java.util.logging.Logger;
class A extends Thread{
    public void run(){
    System.out.println("Thread A");
    }
}
class B extends Thread{
    public void run(){
    System.out.println("Thread B");
    }
}
class C extends Thread{
    public void run(){
    System.out.println("Thread C");
    }
}
class D extends Thread{
    public void run(){
    System.out.println("Thread D");
    }
}
class E extends Thread{
    public void run(){
    System.out.println("Thread E");
    }
}
public class thread {
    public static void main(String[] args) {
   A a =new A();
   B b =new B();
   C c= new C();
   D d=new D();
   E e=new E();
   a.start();
   b.start();
   c.start();
   d.start();
   e.start();
    }
   
   
}
