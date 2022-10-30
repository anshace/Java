public class Human
{	
	String name;
	int age;
	String work;
	double earning;

	static int totalno;

	Human(String nm,int yr,String prof,double pr)
	{	
		this.name = nm;
		this.age=yr;
		this.work = prof;
		this.earning = pr;
		this.totalno++;
	}

	void eat(){
		System.out.println(this.name+"  is eating.");
	}

	void drink(){
		System.out.println(this.name+"  is drinking.");
	}

	@override
	public String toString(){
		return  name+" is "+age +" working as "+ work+" and earning "+ earning+" from it.";
	}
}
