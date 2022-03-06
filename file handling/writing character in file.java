import java.io.*;
public class Main{
public static void main( String[] args ){
try{
FileOutputStream fos=new FileOutputStream( "hello.txt", true );
fos.write( 65 );
fos.close();
}
catch( IOException e){
System.out.println(e);
}}}