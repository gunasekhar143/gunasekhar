import java.io.*;
import java.util.Scanner;
class string1 
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
String str;
System.out.println("enter a string");
str= s.nextLine();
System.out.println("string is"+str);
int length=str.length();
System.out.println("string length is:"+length);
System.out.println("before string is:"+str);
String reverse=new StringBuffer(str).reverse().toString();
System.out.println("after string is:"+reverse);
}
}
