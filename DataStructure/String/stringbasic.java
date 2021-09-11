package com.String;
import java.io.*;
import java.util.*;

public class stringbasic
{
	public static void main(String[] args)
	{
		// the Scanner sc for taking the input.
		Scanner sc = new Scanner(System.in);
		// string is created int the string pool area
		String st ="Ansh";
		String str ="Ansh";
		if(st==str)
		System.out.println("True");
		// string is created in the heap area and
		//  both are different object
		st = new String("Anshr");
		str = new String("Anshr");
		if(st==str)
		System.out.print("true");
		System.out.println(st);
		sc.close();
	}
}

