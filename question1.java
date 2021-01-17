import java.util.*;
public class question1
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter size of array");
		int s=in.nextInt();
		int A[]=new int[s];
		System.out.println("Enter contents of array");
		for (int i=0;i<s;i++)
		{
			A[i]=in.nextInt();
		}
		System.out.println("Enter Sum of 3 elements of array");
		int sum=in.nextInt();
		for(int a=0;a<s;a++)
		{
			for(int b=0;b<s;b++)
			{
				for(int c=0;c<s;c++)
				{
							
					if(A[a]+A[b]+A[c]==sum)
					{
						System.out.print(A[a]+","+A[b]+","+A[c]);
						System.exit(0);
					}
										
				}
			}
		}

	}

}
