class Solution2 {
	public String backAround(String s) {
		 int len;
		 len = s.length();
		 char lc = s.charAt(len-1);
		 StringBuilder sb = new StringBuilder("");
		 sb.append(lc);
		 sb.append(s);
		 sb.append(lc);
		 
		 return sb.toString();
		 
	}
}
class test3
{
public static void main(String[]args)
{
Solution2 s=new Solution2();
String i=s.backAround("guna");
System.out.println(i);
}
}
