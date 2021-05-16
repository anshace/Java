import java.util.*;

public class Pattern2 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
		int row=scn.nextInt();
	    for(int i=row;i>=1;i--)
	    {
			for(int j=i;j>=1;j--)
				System.out.print("*\t");
			System.out.println("");
	    }
	}
}
