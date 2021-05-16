public class Question_pool
{
	public static void main(String[] args)
	{	
		// working with cash pool of integer till [-128 to 127]. that  2^6-1 or range of byte .
		Integer i1= 127;
		Integer i2= 127;
		System.out.println(i1==i2);
		Integer i3= -128;
		Integer i4= -128;
		System.out.println(i3==i4);

		//concept of string pool area and heap memory.
		String one = "Roshan";
		String two = "ROshan";
		if (one==two)
			System.out.println("one==two");
		else
			System.out.println("one!=two");
		
	}
}