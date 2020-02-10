package sweets;

public class Waffer extends Sweets{

	private int WafferId;
	public Waffer(int Weight,String Name,int WafferId)
	{
		super(Weight,Name);
		this.WafferId = WafferId;
	}
	public String toString()
	{
		return "ID" + WafferId + ": " + super.toString(); 
	}
}