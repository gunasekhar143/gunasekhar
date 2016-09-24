import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;
class scanner
{
public static void main(String []args)
{
	Scanner s=new Scanner(System.in);
	String str;
	System.out.println("enter a string");
	str=s.nextLine();
StringTokenizer st=new StringTokenizer(str);
while (st.hasMoreTokens())
{
	System.out.println(st.nextToken());
}
}
}
