import java.io.*;
import java.util.*;

public class Arraylist
{	
	
	public static void main(String[] args)
	{
		// the Scanner sc for taking the input.
    	Scanner sc = new Scanner(System.in);
    	// Both are corect
    	// ArrayList<Integer> list= new ArrayList<Integer>();
    	// ArrayList<> list= new ArrayList<>(); // its is a bad practice
    	ArrayList<Integer> list= new ArrayList<>(10);// this is best.
    	// Both are corect

    	// Input the Element in Java...
    	int num=sc.nextInt();
    	for (int i=0;i< num;i++ ){
    	    list.add(sc.nextInt());
    	}

    	// Print the Arraylist..
    	for (int i :list ) {
			System.out.print(i+", ");
    	}
    	System.out.println("\n\n"+list);
    	sc.close();
	}
}