package Practiceweek9;
import java.util.*;
public class Q2_String
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner (System.in);
		System.out.println("Enter original string");
		String s=in.nextLine();
		int l=s.length();
		System.out.println("Enter String to be Removed");
		String r=in.nextLine();
		int lr=r.length();
		for(int i=0;i<l;i++)
		{
			char ch=s.charAt(i);
			for(int j=0;j<lr;j++)
			{
				
				char ch1=r.charAt(j);
				if(ch1==ch)
					s=s.substring(0,(s.indexOf(ch1)-1)).concat(s.substring(s.indexOf(ch1)));
				
			}
		}
		System.out.println(s);
	}

}
