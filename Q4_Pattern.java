package Practiceweek9;
import java.util.*;
public class Q4_Pattern 
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int i,j,n,k,ctr=1;
		System.out.println("Enter Size of 2d Array");
		n=in.nextInt();
		int a[][]=new int[n][n];
		/*for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				
			}
		}*/
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				a[i][n/2]=n-ctr;
				ctr++;
			}
				
			
		}
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				
			System.out.print(a[i][j]);	
			}
			System.out.println();
		}
	}
	
}


