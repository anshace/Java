public class Heroes extends Human
{	
	String   power;

	Heroes(String name,int age,String pow){
		// super must have all superclass constructer paarameter.
		super(name,age,"heroes",0);
		this.power=pow;
	}

	@override
	public String toString(){
		return super.toString()+"with superpower of "+ power;
	}
}
