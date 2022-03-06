public class Main{

public static void main( String[] args ){
Demo d = new Demo();
d.show();
}}


class Demo{
private int x;
private static int y;

static{
y=1100;
System.out.println( "y=" + y );
}

{
x=111;
System.out.println( "x=" + x );
}

public Demo(){
x=123;
}

public void show(){
System.out.println( "x=" + x );
}}