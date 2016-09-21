import java.io.*;
class Solotion1
{
	public int sumDigits(String s)
	{
		int sum=0;
		for(int i=0;i<s.length;i++)
		{
		Char c=s.charAt(i);
		if(charecter.isDigit(c))
		{
			String sb=new String();
			sb=s.subString(i,i+1);
			sum=sum+Integer.parseInt(sb);
			}
		}
		return sum;
}
class test1
{
	public static void main(String args[])
	{
		solution1=new solution1();
		int i=s.sumDigit("aa1d2d5ffs");
		System.out.println(i);
	}
}
}
