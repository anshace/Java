public class Interitance
{
	public static void main(String[] args)
	{
		Heroes hero1=new Heroes("Batman",30,"$$$$$$$");
		Heroes hero2=new Heroes("Superman",38,"Gravity");
		System.out.println(hero2.age);
		System.out.println(hero2.work);

		Human ansh=new Human("Ansh Roshan",20,"Student",50000);
		System.out.println(ansh.toString());
		System.out.println(hero1.toString());
	}
}
