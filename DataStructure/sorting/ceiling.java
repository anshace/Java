import java.io.*;
import java.util.*;

public class ceiling
{
	public static void main(String[] args)
	{
		// the Scanner sc for taking the input.
    	Scanner sc = new Scanner(System.in);
    	// the main code
    	int N=sc.nextInt();
    	int key=sc.nextInt();
    	int[] ar= new int [N];
    	for (int i=0;i< N;i++ ){
    	    ar[i]=sc.nextInt();
    	}
    	Arrays.sort(ar);
    	System.out.println("Celling value=>	"+ar[binarySearch(ar,N,key)]);
    	System.out.println("Floor value=>	"+ar[binarySearch(ar,N,key)]);
    	sc.close();
	}
	static int binarySearch(int [] ar, int N, int key)
	{
		int mid,low=0,high=N;
		while(low<=high)
		{
			mid=low+(high-low)/2;
			if(ar[mid]<key)
					low=mid+1;
			else if(ar[mid]>key)
					high=mid-1;
				else
					return mid;
		}
		return low;
	}

}
