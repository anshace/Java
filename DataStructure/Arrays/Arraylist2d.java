import java.util.*;

public class Arraylist2d
{
	public static void main(String[] args)
	{
		// the Scanner sc for taking the input.
    	Scanner sc = new Scanner(System.in);
    	// the main code
    	ArrayList<ArrayList<Integer>> list= new ArrayList<>();

	    ////////////////////////////
    	//Intialize the Arraylist //
	    ////////////////////////////
    	int num=sc.nextInt();
    	for (int i=0;i< num;i++ ){
    	    list.add(new ArrayList<>());
    	}

	    ///////////////////////////////////////////////////
    	// Input The Element in MultiDimension ArrayList //
	    ///////////////////////////////////////////////////
    	for (int i=0;i< num;i++ ){
    		int num2=sc.nextInt();
    	    for (int j=0;j< num2;j++ ){
    	        list.get(i).add(sc.nextInt());
    	    }
    	}

    	System.out.println(list.get(1).get(2));

	    /////////////////////////////////////////////////////////////
    	//Printing the MultiDimension Arraylist using the for loop //
	    /////////////////////////////////////////////////////////////
    	for (int i=0;i< num;i++ ){
    	    System.out.println(list.get(i));
    	}

	    ////////////////////////////////////////////////////////////
    	// Printing the MultiDimension Arraylist by for each loop //
	    ////////////////////////////////////////////////////////////
    	for (ArrayList<Integer> i:list ) {
    		System.out.println(i);
    	}
    	sc.close();
	}
}
