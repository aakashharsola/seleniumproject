package Locaters2;

public class string_methods 
{
public static void main(String[] args)
{
	String a="akshay";
	String b="harsola";
	String c="AKSHAY";
	
	// 1. to find the length of String
	
	int r=a.length();
	
	System.out.println(r);
	
	// 2. to find the particular char using index number
	
	char q=a.charAt(1);
	System.out.println(q);
	
	// 3. To concatenate two string e.g a and b
	
	String w=a.concat(c);
	
	System.out.println(w);
	
	// 4. To convert the string in upper case latter
	
	String t=b.toUpperCase();
	System.out.println(t);
	
	// 5. To convert the string in lower case latter
	
	String y=c.toLowerCase();
	System.out.println(y);
	
// 6.To check whether the given string start with the mention argument or not
	
	boolean u=a.startsWith("ak");
	System.out.println(u);
	
	boolean i=a.startsWith("ou");
	System.out.println(i);
	
// 7.To check whether the given string end with the mention argument or not 
	
	boolean p=c.endsWith("hyu");
	System.out.println(p);
	
// 8. to check mention string are pass same arguments or not
	
	Boolean z=a.equals("akshay");
	System.out.println(z);
	
	
	
	
	
	
	
	
	
	 
	
	
	
	
	
	
}
}
