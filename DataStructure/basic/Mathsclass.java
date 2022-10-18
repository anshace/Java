import java.io.*;
import java.util.*;

public class Mathsclass
{
	public static void main(String[] args)
	{
		// the Scanner sc for taking the input.
    	Scanner sc = new Scanner(System.in);
    	// the main code
    	double x=sc.nextDouble();
    	double y=sc.nextDouble();
    	double max= Math.max(x,y);
    	double min= Math.min(x,y);
    	x=-34.67;
    	double abs= Math.abs(x);
    	double sqrt= Math.sqrt(y);
    	System.out.println(sqrt);
    	System.out.println(htotenuse(abs,y));
    	// if we want random number from 1-12 then 
    	System.out.println((int)(Math.random()*12)+1);

    	// we can also use random class
    	Random rd=new Random();
    	System.out.println(rd.nextDouble());
    	System.out.println(rd.nextInt(9));
    	sc.close();
	}
	static double htotenuse(double x,double y)
	{
		return Math.sqrt(x*x+y*y);
	}
}
