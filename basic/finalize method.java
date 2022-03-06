public class Main{
public static void main(String[] args) throws InterruptedException{
Main m=new Main();
m=null;
}
@Override
protected void finalize() throws Throwable{
System.out.println("hello");
}}