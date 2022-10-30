import java.io.*;
import java.util.*;

public class factorial
{
	public static void main(String[] args)
	{
    	Scanner sc = new Scanner(System.in);
    	int num= sc.nextInt();
    	// System.out.println(factorial(num));
    	// System.out.println(factorial_tail(num,1));
    	// System.out.println(sum(num));
    	// System.out.println(sum_tail(num,1));
    	// System.out.println(power(num,3));
    	// System.out.println(power_tail(num,3,num));
    	System.out.println(digit(num));
    	sc.close();
	}

	static int factorial(int n)
	{
		if (n==1)
			return 1;
		return n*factorial(n-1);
	}

	// the tail recursion is cosidered much better than non tail recursion
	static int factorial_tail(int n,int a)
	{
		if (n==1)
			return a;
		return factorial_tail(n-1,a*n);
	}

	static int sum(int n)
	{
		if (n==1)
			return 1;
		return n+sum(n-1);
	}

	// the tail recursion is cosidered much better than non tail recursion
	static int sum_tail(int n,int a)
	{
		if (n==1)
			return a;
		return sum_tail(n-1,a+n);
	}

	static int power(int x,int n)
	{
		if (n==1)
			return x;
		return x*power(x,n-1);
	}

	//tail recursion
	static int power_tail(int x,int n,int a)
	{
		if (n==1)
			return a;
		return power_tail(x,n-1,a*x);
	}

	static int digit(int n)
	{
		if (n<10)
			return 1;
		return 1+digit(n/10);
	}
}