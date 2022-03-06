import java.io.*;
public class Main{
public static void main( String[] args ){
try{
String s="hello world.";
byte b[] = s.getBytes();
FileOutputStream fos=new FileOutputStream( "hello.txt", true );
fos.write(b);
fos.close();
}
catch( IOException e){
System.out.println(e);
}}}