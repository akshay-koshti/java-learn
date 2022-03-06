import java.util.Scanner;
public class Main{
public static void main( String[] args ){
Account account=new Account(1000);
Person p1=new Person(account, "chirag"), p2=new Person(account, "yash");
Thread t1=new Thread(p1), t2=new Thread(p2);
t1.start();
t2.start();
}}


class Account{
private int balence;

public Account(int x){
balence=x;
}

public boolean isSufficient(int amount){
if( amount<=balence ) return true;
else return false;
}

public void withdraw(int amount){
balence-=amount;
System.out.println( "remaining balence: " + balence );
}}


class Person implements Runnable{
private Account account;
private String name;

public Person(Account account, String name){
this.name=name;
this.account=account;
}

public void run(){
Scanner input=new Scanner( System.in );
//synchronized( account ){
System.out.println( name + " enter amount: " );
int a=input.nextInt();
if( account.isSufficient(a) == true ) account.withdraw(a);
else System.out.println( "insufficient amount." );
//}
}}