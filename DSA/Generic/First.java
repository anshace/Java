import java.io.*;
import java.util.*;

public class First
{
	public static void main(String[] args)
	{
    	Scanner sc = new Scanner(System.in);
    	sc.close();
    	First obj=new First();
    	obj.print(190);
    	obj.print(190.0067);
    	obj.print("Ansh");
	}

	<T,V> void print(V i)
	{
		System.out.println(i);
	}
}