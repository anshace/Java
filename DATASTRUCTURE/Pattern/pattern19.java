import java.util.*;

public class pattern19{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

     // write ur code here
    int row=scn.nextInt();
    if(row%2==0)
        return;
    int mid= row/2+1;
    // System.out.println();
    for(int i=1;i<=row;i++)
    {
		for(int j=1;j<=row;j++)
			if(i==1)
                if(j<=mid||j==row)
                    System.out.print("*\t");
                else
                    System.out.print(" \t");
			else if(i<mid)
	                if(j==mid||j==row)
	                    System.out.print("*\t");
	                else
	                    System.out.print(" \t");
	            else if(i==mid)
							System.out.print("*\t");
					else if(i<row)
								if(j==mid||j==1)
									System.out.print("*\t");
								else
									System.out.print(" \t");
						else
				                if(j>=mid||j==1)
				                    System.out.print("*\t");
				                else
				                    System.out.print(" \t");
		System.out.println();

    }

 }
}
