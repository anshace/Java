import java.io.*;
import java.util.*;

public class Matrix
{
	public static void main(String[] args)
	{
		// the Scanner sc for taking the input.
    	Scanner sc = new Scanner(System.in);
    	int[][] arr= new int [3][];
    	int[][] arr2={ {1,2,3},
    					{4,5},
    					{6,7,8,9},
    				  };
    	for (int i=0;i< arr.length;i++ ){
    		// For each rows
    		arr[i]=new int [sc.nextInt()];
    		for (int j=0;j< arr[i].length;j++ ){
    			arr[i][j]=sc.nextInt();
    		}
    	}
    	// for printing the arrays.
    	for (int i=0;i< arr.length;i++ ){
    		for (int j=0;j< arr[i].length;j++ ){
    			System.out.print(arr[i][j]+" ");
    		}
    		System.out.println("");
    	}

    	//Better way of printing the arrays.
    	for (int i=0;i< arr.length;i++ ){
 	        System.out.println(Arrays.toString(arr[i]));
    	}

    	// Best way for printing the Arrays
    	for (int[] ar:arr ){
 	        System.out.println(Arrays.toString(ar));
    	}
    	sc.close();

	}
}
