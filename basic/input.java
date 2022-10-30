import java.io.*;
import java.util.*;

public class input
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		// int a = s.nextInt();
		// String str = s.next();
		// System.out.print(a);
		// System.out.println(str);
		// String str = s.next();
		// int a = s.nextInt();
		// System.out.print(str + " " + a);

		// char name= sc.next().charAt(0);
		// int m1= sc.nextInt();
		// int m2= sc.nextInt();
		// int m3= sc.nextInt();
		// System.out.println(name);
		// System.out.println((m1+m2+m3)/3);

		// float f = 1.4;
		// System.out.println('a' + 1);
		// int i ='c';
		// System.out.println(i);
		// byte b = 50;
		// b = b * 50;

		// double a = 6 / 4;
		// int b  = 6 / 4;
		// double c = a + b;
		// System.out.println(c);
		
		double a = 55.5;
		int b = 55;
		a = a % 10;
		b = b % 10;
		System.out.println(a + " "  + b);

		int var1 = 5;
		int var2 = 6;
		System.out.print(var1 > var2);
		sc.close();
	}
}