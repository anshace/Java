import java.io.*;
import java.util.*;

public class StringBuild
{
	public static void main(String[] args)
	{
		// the Scanner sc for taking the input.
		Scanner sc = new Scanner(System.in);
		String st= sc.nextLine();
		StringBuilder sb= new StringBuilder(st);
		StringBuffer sbr= new StringBuffer(st);
		System.out.println(sb.reverse());
		System.out.println(sbr.reverse());
		sc.close();
	}
}
