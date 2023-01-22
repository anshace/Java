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

    	// warpper class can be used as primitive due to autoboxing and unboxing features
    	Boolean flag= true;
    	Character ch= '@';
    	Integer i=1233;
    	Double d=3345333234.14354356;
    	String st="Ansh";
    	if(flag)
    		System.out.println("hello");

    	System.out.format("This is a %s %d %b \n",st,i,flag);
    	System.out.format("This is a %-7s %d %.2f %b \n",st,i,d,flag);
    	System.out.format("This is a %s %07d %,f %b \n",st,i,d,flag);
    	sc.close();

	}

}
