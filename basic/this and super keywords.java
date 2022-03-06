class Main{
public static void main( String[] args ){
Derived d=new Derived();
d.display(10);
}}


class Base{
protected int x;
{
x=11;
}}


class Derived extends Base{
private int x;
public void display( int x ){
System.out.println( x + " " + super.x + " " + this.x );
}}