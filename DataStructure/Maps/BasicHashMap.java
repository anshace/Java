import java.io.*;
import java.util.*;

public class BasicHashMap
{
	public static void main(String[] args)
	{
		// the Scanner sc for taking the input.
    	Scanner sc = new Scanner(System.in);
    	int N=sc.nextInt();
		// Map<Integer,Integer> map=new HashMap<Integer,Integer>();		
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		for (int j=0;j< N;j++ )
			map.put(j,sc.nextInt());

		for(Map.Entry m:map.entrySet())
			System.out.println(m.getKey()+" "+m.getValue());
		System.out.println();    	
    	sc.close();
	}
}