import java.io.*;
public class Main{
public static void main( String[] args ){
try{
FileInputStream fis=new FileInputStream( "hello.txt" );
int i = fis.read();
while( i!=-1 ){
System.out.print( (char)i );
i=fis.read();
}
fis.close();
}
catch( IOException e){
System.out.println(e);
}}}