import java.util.*;

public class learnoops
{
	public static void main(String[] args)
	{	
		System.out.println(Human.totalno);
		Human ansh=new Human("Ansh Roshan",20,"Student",50000);
		System.out.println(Human.totalno);
		Human mom=new Human("Pankaj Kumari",50,"Nurse",80000);
		System.out.println(Human.totalno);
	// This to call toString method must is overriden. both implictly and explictly
		// System.out.println(ansh.toString());
		System.out.println(ansh);
		System.out.println(ansh.name);
		System.out.println(mom.name);
		ansh.eat();
		mom.drink();
		// making the arrays of the objects
		Human[] family={ansh,mom};
		System.out.println(family[0].work);
		System.out.println(family[1].work);

		// Passing object as the Object
		WorkPlace wp= new WorkPlace();
		wp.stay(family[0]);
		wp.stay(family[1]);

		
	}
}
