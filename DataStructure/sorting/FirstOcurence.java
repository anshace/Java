import java.io.*;
import java.util.*;

public class FirstOcurence
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
    	System.out.println("First value=>	"+searchRange(ar,key)[0]);
    	System.out.println("Last value=>	"+searchRange(ar,key)[1]);
    	sc.close();
	}

	static int binarySearchRange(int [] ar, int key,boolean first)
	{
		int mid,start=0,end=ar.length-1,ans=0;
		while(start<=end)
		{
			mid=start+(end-start)/2;
			if(ar[mid]<key)
					start=mid+1;
			else if(ar[mid]>key)
					end=mid-1;
				else
				{
					ans=mid;
					if(first)
						end=mid-1;
					else
						start=mid+1;
				}
		}
		return ans;
	}

	static int [] searchRange(int [] ar,int key)
	{
		int[] solarr={-1,-1};
		solarr[0]=binarySearchRange(ar,key,true);
		solarr[1]=binarySearchRange(ar,key,false);
		return solarr;
	}
}