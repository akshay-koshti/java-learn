public class Main{
public static void main( String[] args ){
A a=new A();
B b=new B();
Thread t1=new Thread(a), t2=new Thread(b);
t1.start();
t2.start();
}}

class A implements Runnable{
public void run(){
for( int i=1; i<=5; i++ )
System.out.println( "first: " + i );
}}


class B implements Runnable{
public void run(){
for( int i=1; i<=5; i++ )
System.out.println( "second: " + i );
}}