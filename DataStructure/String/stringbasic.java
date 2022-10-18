import java.io.*;
import java.util.*;

public class stringbasic
{
	public static void main(String[] args)
	{
		// the Scanner sc for taking the input.
		Scanner sc = new Scanner(System.in);
		stringbasic obj=new stringbasic();
		obj.poolarea();
		obj.stringmethods();
		sc.close();
	}

	void poolarea()
	{
	// string is created int the string pool area
		String st ="Ansh";
		String str ="Ansh";
		if(st==str)
			System.out.println("True");
	// string is created in the heap area and both are different object
		st = new String("Anshr");
		str = new String("Anshr");
		if(st==str)
			System.out.print("True");
		else
			System.out.println("False");
	}

	void stringmethods()
	{
		String st="Ansh";
		String str="ansh";
		System.out.println(st.equals(str));
		System.out.println(st.equalsIgnoreCase(str));
		System.out.println(st.indexOf("sh"));
		System.out.println(st.toUpperCase());
		System.out.println(st.toLowerCase());
		System.out.println(st.replace("sh","ion"));

	}
	

}

