import java.io.*;
import java.util.*;

public class Fibonacci
{
	public static void main(String[] args)
	{
    	Scanner sc = new Scanner(System.in);
    	int num= sc.nextInt();
    	// System.out.println(fibo(num));
    	System.out.println(fibo_tail(num,0,1));
    	sc.close();
	}

	static int fibo(int n)
	{
		if(n==0|| n==1)
			return n;

		return fibo(n-1)+ fibo(n-2);
	}

	//tail recursion is much better always .
	static int fibo_tail(int n ,int a ,int b)
	{
		if(n==1)
			return b;

		return fibo_tail(n-1,b,b+a);
	}
}