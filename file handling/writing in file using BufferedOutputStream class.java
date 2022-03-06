import java.io.*;
public class Main{
public static void main( String[] args ){
try{
FileOutputStream  fos=new FileOutputStream( "hello.txt", true );
BufferedOutputStream bos=new BufferedOutputStream(fos);
String s="hi world.";
byte b[] = s.getBytes();
bos.write(b);
bos.flush();
bos.close();
fos.close();
}
catch( IOException e ){
System.out.println(e);
}}}