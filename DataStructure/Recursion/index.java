import java.io.*;
import java.util.*;

public class index
{
	public static void main(String[] args)
	{
    	Scanner sc = new Scanner(System.in);
    	int len= sc.nextInt();
    	int ar[]= new int[len];
    	for (int i=0;i< len;i++ )
    	    ar[i]=sc.nextInt();
    	int target= sc.nextInt();
    	System.out.println(first_index(ar,target));
    	System.out.println(last_index(ar,target));
    	System.out.println(Arrays.toString(all_index(ar,target)));
    	sc.close();
	}

	private static int index_num(int[] ar,int target,int index,int type)
	{
		if(ar.length==index || index<0)
			return -1;

		if(target==ar[index])
			return index;

		return index_num(ar,target,index+type,type);
	}

	static int first_index(int[] ar,int target)
	{
		return index_num(ar,target,0,1);
	}

	static int last_index(int[] ar,int target)
	{
		return index_num(ar,target,ar.length-1,-1);
	}

	private static int[] all_index(int[] ar,int target,int index,int type)
	{
		if(ar.length==index || index<0)
			return -1;

		if(target==ar[index])
			return index;

		return all_index(ar,target,index+type,type);
	}

	static int all_index(int[] ar,int target)
	{
		return all_index(ar,target,0,1);
	}
}