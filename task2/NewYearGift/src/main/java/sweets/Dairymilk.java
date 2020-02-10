package sweets;

public class Dairymilk  extends Sweets{


	private int Dairymilkid;
	public Dairymilk(int Weight,String Name, int Dairymilkid)
	{
		super(Weight,Name);
		this.Dairymilkid=Dairymilkid;
	}
	
	public String toString()
	{
		return "ID" + Dairymilkid +": " + super.toString();
	}
}