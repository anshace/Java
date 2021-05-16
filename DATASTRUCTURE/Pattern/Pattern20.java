import java.util.*;

public class Pattern20 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
		int row=scn.nextInt();
		int mid=row/2+1;
		for (int i = 1; i <=row; i++)
	    {
			for (int j = 1; j <=row; j++)
			{
				if(j==1||j==row||j==i&&i>=mid||i>mid&&i+j==row+1)
					System.out.print("*\t");
				else
					System.out.print(" \t");
			}
			System.out.println("");
	    }
	}
}

