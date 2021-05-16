// working with the interface
interface IFruit
{
	public String TYPE = "Apple";
}
class Fruit implements IFruit{}




// working with class and caliing
class IFruit1
{
	protected static String NAME = "Apple";
	// protected works if they 
}
class Fruit1 extends IFruit1{}



public class question_trick
{	

	static int a = 1111;
	// the static block get loaded as soon as class is loaded
	static{
		a=a-- - --a;// 1111-1109=2
	}
	// this block will nver be executed.
	static{ a= a++ + ++a;}

	public static void main(String[] args)
	{
		System.out.println(Fruit.TYPE);
		System.out.println(Fruit1.NAME);
		System.out.println(a);// print 2
	}
}