import java.io.*;
import java.util.*;

public class TwoSum
{
	public static void main(String[] args) throws FileNotFoundException
	{

    	BufferedReader br = new BufferedReader(new FileReader("read.txt"));
    	Scanner sc = new Scanner(br);
    	int len= sc.nextInt();
    	int nums[]= new int[len];
    	for (int i=0;i< len;i++ )
    	    nums[i]=sc.nextInt();
    	int target= sc.nextInt();
    	System.out.println(twoSum(nums,target));
    	sc.close();

	}
	public static int[] twoSum(int[] numbers, int target)
	{
	    int[] result = new int[2];
	    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	    for (int i = 0; i < numbers.length; i++) {
	        if (map.containsKey(target - numbers[i])) {
	            result[1] = i;
	            result[0] = map.get(target - numbers[i]);
	            return result;
	        }
	        map.put(numbers[i], i);
	    }
	    return result;
	}
}