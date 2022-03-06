import java.lang.String;
public class Main{
public static void main( String[] args ){
String s1="Hello", s2="hello";
System.out.println( s1.length() );
System.out.println( s1.toUpperCase() );
System.out.println( s1.toLowerCase() );
if( s1==s2 ) System.out.println( s1+s2 );
if( s1.equalsIgnoreCase(s2) ) System.out.println( s1+s2 );
String s3="arman", s4="arav";
int x = s3.compareTo(s4);
System.out.println(x);
x = s1.lastIndexOf( "lo", 4 );
System.out.println(x);
s3 = s1.substring( 1, 3+1 );
System.out.println(s3);
s3="  hello ";
s3 = s3.trim();
System.out.println(s3);

}}