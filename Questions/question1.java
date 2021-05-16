public class question1
{
	public static void main(String[] args) 
	{
		//  this is \u000d System.out.println("Ansh");
		// output will be Ansh Since \\u000d is new line unicode character and will be executed inside the comment  also and s.o.pln will be shifted to new line.

		String s = "Ansh"+1+2+"Roshan"+3+4;
		System.out.println(s);
		// output output will be Ansh12Roshan34

		int i = 0 + +1 - - 2 + + 3 - - 4 + + 5;
		System.out.println(i);
		// i= 0+1+2+3+4+5 =15 because [ + + -> +] and [- - -> +] so all the values will be finally added up.

		System.out.println(Double.MIN_VALUE);
		// Double.MIN_VALUE= absolute value is |4.9E^(-324)| which is greater than 0.0		
		System.out.println(Math.min(Double.MIN_VALUE,0.0d));

		long longWithl= 60*60*60*24*365*100L;
		long longWithOutl= 1000*60*60*24*365*100;
		System.out.println(Integer.MAX_VALUE);
		System.out.println(longWithl);
		System.out.println(longWithOutl);

		

	}
}