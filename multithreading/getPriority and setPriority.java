public class Main{
public static void main( String[] args ){
A a=new A();
B b=new B();
a.setPriority(10);
b.setPriority(1);
a.start();
b.start();
System.out.println( b.getPriority() );
}}


class A extends Thread{
public void run(){
for( int i=0; i<5; i++ )
System.out.println( "first: " + i );
}}


class B extends Thread{
public void run(){
for( int i=0; i<5; i++ )
System.out.println( "second: " + i );
}}