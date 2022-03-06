public class Main{
public static void main(String[] args){
Test t=new Test();
System.out.println(t.get(34));
System.out.println(t.get("akshay"));
}}


class Test{
public <T> T get(T a){
return a;
}}