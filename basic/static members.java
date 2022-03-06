class Main{
public static void main( String[] args ){
Demo d = new Demo();
System.out.println( Demo.x );
Demo.show();
}}

class Demo{
static int x;
private static int y;
public static void show(){
System.out.print(x);
System.out.print(y);
}}