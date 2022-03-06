import java.util.Scanner;
public class Main{
public static void main( String[] args ){
Scanner input=new Scanner( System.in );
int[][] a=new int[2][2];
for( int i=0; i<2; i++ )
for( int k=0; k<2; k++ ){
System.out.print( "enter data: " );
a[i][k] = input.nextInt();
}
for( int i=0; i<2; i++ ){
for( int k=0; k<2; k++ ){
System.out.print( a[i][k] + " " );
}
System.out.println();
}}}