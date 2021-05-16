import java.util.*;
/** */
public class Pattern
{	
	/**
	 * 
	 * @param args
	 */
	{	
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the Number of the rows:");
		int rows=sc.nextInt();
		pattern1(rows);
		System.out.println();
		pattern2(rows);
		sc.close();
	}

	/**
	 * 
	 * @param row
	 */
	static void pattern1(int row)
	{
		for(int i=0;i<=row;i++)
		{
			System.out.println();
			for(int j = 0;j<=i;j++)
				System.out.print("* ");
		}	
	}

	/**
	 * 
	 * @param row
	 */
	static void pattern2(int row)
	{
		for(int i=0;i<=row;i++)
		{
			System.out.println();
			for(int j = 0;j<=row;j++)
				if (i>=j)
					System.out.print("  ");
				else
					System.out.print("* ");
		}
	}
}