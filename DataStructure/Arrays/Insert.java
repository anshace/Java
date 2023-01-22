import java.io.*;
import java.util.*;

public class Insert
{
	public static void main(String[] args)
	{
    	Scanner sc = new Scanner(System.in);

    	int len= sc.nextInt();
    	int arr[]= new int[len];
    	for (int i=0;i< 3;i++ )
    	    arr[i]=sc.nextInt();
    	insert_element(arr,90,3,1);
    	System.out.println(Arrays.toString(arr));
    	sc.close();
	}

	static void insert_element(int []ar,int x,int cap,int pos)
	{
		if(ar.length==cap)
			return ;
		for (int i=cap-1;i>=pos-1;i-- ){
		    ar[i+1]=ar[i];
		}
		ar[pos]=x;
	}
}