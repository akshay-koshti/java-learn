class Main{
public static void main( 
String[] args ){
Demo ob=new Demo();
ob.set(100);
ob.show();
}}

class Demo{
int a;
public void set( int x ){
a=x;
}
public void show(){
System.out.print( a );
}}