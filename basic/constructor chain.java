class Main{
public static void main( String[] args ){
Derived d=new Derived();
d.display();
}}


class Base{
protected int x;

public Base( int a ){
x=a;
System.out.println( "Base" );
}}


class Derived extends Base{
private int x, y;

public Derived(){
this(10);
x=20;
y=30;
System.out.println( "default derived" );
}

public Derived( int z ){
super(z);
System.out.println( "parametrize derived" );
}

public void display(){
System.out.println( super.x + " " + x + " " + y );
}}