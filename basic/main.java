import java.io.*;
import java.util.*;

public class main
{
	public static void main(String[] args)
	{
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Hello Ansh Roshan");
    	int a=0;
    	int[] ar = {1,2,3,4,5};
    	change(a,ar);
    	System.out.println(a);
    	System.out.println(Arrays.toString(ar));
    	sc.close();
	}
	static void change(int b,int[] nums)
	{
		b=90;
		nums[0]=90;
	}
}