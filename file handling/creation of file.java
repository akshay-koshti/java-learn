import java.io.File;
import java.io.IOException;
public class Main{
public static void main( String[] args ){
File f=new File( "E:\\area 1\\programing projects\\testing zone\\java\\hello.txt" );
System.out.println( f.exists() );
try{
f.createNewFile();
}
catch( IOException e){
e.printStackTrace();
}
System.out.println( f.exists() );
System.out.println( f.length() );

f.delete();
System.out.println( f.exists() );
}}