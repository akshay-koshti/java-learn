import java.io.*;
public class Main{
public static void main( String[] args ) throws IOException{
FileReader fr=new FileReader( "hello.txt" );
BufferedReader br=new BufferedReader(fr);
String s;
while( (s=br.readLine()) != null )
System.out.println(s);
}}