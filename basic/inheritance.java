class Main{
public static void main( String[] args ){
Derived d=new Derived();
d.show();
d.display();
}}


class Base{
public void show(){
System.out.println( "hello" );
}}


class Derived extends Base{
public void display(){
System.out.println( "world" );
}}