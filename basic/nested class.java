public class Main{
public static void main( String[] args ){
A.B b=new A.B();
b.display();
C c=new C();
C.D d = c.new D();
d.display();
c.show();
}}


class A{
static class B{
public static void display(){
System.out.println( "class b" );
}}

public void show(){
System.out.println( "class a" );
}}


class C{
class D{
public void display(){
System.out.println( "class c" );
}}
public void show(){
System.out.println( "class d" );
}}