import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		// the Scanner sc for taking the input.
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Hello World!");
    	for(int i=0; i<64000;i++)
    	System.out.print((char)i+" ");
    	sc.close();
	}
}
