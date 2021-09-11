import java.io.*;
import java.util.*;

public class Demo
{
	public static void main(String[] args)
	{
		// the Scanner sc for taking the input.
    	Scanner sc = new Scanner(System.in);
    	String[] name=new String[5];

    	for (int i=0;i<5 ;i++ ) {
    		name[i]=sc.next();
    	}
    	// 	THIS DOESNOT WORK FOR INPUTTING.
    	// for (String st :name ) {
    	// 	st=sc.next();
    	// }
    	for (String st :name ) {
    		System.out.println(st);
    	}
    	System.out.println(Arrays.toString(name));
    	sc.close();

	}

}