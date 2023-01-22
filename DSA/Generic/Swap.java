import java.io.*;
import java.util.*;

public class Swap
{
	public static void main(String[] args)
	{
    	Scanner sc = new Scanner(System.in);
    	Integer a = Integer.valueOf(sc.nextInt());
    	Integer b = Integer.valueOf(sc.nextInt());
    	System.out.println(a+" "+b);
    	swap(a,b);
    	System.out.println(a+" " +b);
    	sc.close();
    	varargs("Ansh",90,90.9,'a',"Aom");
	}

	static <T> void swap(T x,T y)
	{
		T z= x;
		x=y;
		y=z;
	}

	static void varargs(Object ...obj)
	{
		for(Object o:obj){
			System.out.print(o+" , ");
		}
		System.out.println();
	}
}