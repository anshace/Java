import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

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
    	// int num=sc.nextInt();
    	// for (int i=0;i< num;i++ ){
    	//     list.add(sc.nextInt());// we use add
    	// }

    	// for unknown number of inputs.for which arraylist is best
    	while(sc.hasNextInt())
    	    list.add(sc.nextInt());// we use add


    	// Alter the values in the arraylist
    	for (int i=0;i< list.size();i++ ){
			System.out.println(list.set(i,(list.get(i)*list.get(i))));    	    
    	}

    	// Print the Arraylist..
    	for (int i :list ) {
			System.out.print(i+", ");
    	}
    	System.out.println("\n\n"+list);

    	// empty the list
    	for (int i=0;list.size()>0; ){
    	    list.remove(i);
    	}
    	System.out.println(list);
    	// or just use clear to  empty the list at Once.
    	list.clear();
    	System.out.println(list);

    	sc.close();
	}
}
