public class Main{
public static void main(String[] args){
Test<String> t=new Test<String>();
System.out.println(t.get("akshay"));
}}


class Test<T>{
public T get(T a){
return a;
}}