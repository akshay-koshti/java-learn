import java.io.*;
public class Main{
public static void main( String[] args ) throws IOException{
FileWriter fw=new FileWriter( "hello.txt", true );
BufferedWriter bw=new BufferedWriter(fw);
String s="hello world.";
bw.write(s);
bw.close();
fw.close();
}}