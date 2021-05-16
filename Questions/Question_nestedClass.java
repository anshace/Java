// The question concept is old as [static refrence cannot happen inside the non static class ].
// In new version of java it doesnopt give the error but get executed .
public class Question3
{
	public static void main(String[] args)
	{
		final class Constants
		{
			public  static String name="PI";
		}
		Thread thread = new Thread(new Runnable(){
														@Override
														public void run()
														{
															System.out.println(Constants.name);
														}
													});
		thread.start();
	}
}
