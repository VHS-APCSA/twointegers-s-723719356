
public class TwoIntegers 
{
	private int integer1;
	private int integer2;
	public TwoIntegers()
	{
		integer1 = 0;
		integer2 = 0;
	}
	public TwoIntegers(int integer1, int integer2)
	{
		this.integer1 = integer1;
		this.integer2 = integer2;
	}
	public int getInteger1()
	{
		return integer1;
	}
	public int getInteger2()
	{
		return integer2;
	}
	public void setInteger1()
	{
		this.integer1 = integer1;
	}
	public void setInteger2()
	{
		this.integer2 = integer2;
	}
	public int sum()
	{
		int sum = integer1 + integer2;
		return sum;
	}
	public int difference()
	{
		int difference = integer1 - integer2;
		return difference;
	}
	public int product()
	{
		int product = integer1 * integer2;
		return product;
	}
	public int quotient()
	{
		int quotient = integer1 / integer2;
		return quotient;
	}
	public String arithmetic()
	{
		String arithmetic = "";
		arithmetic = "Sum = " + sum();
		arithmetic += "Difference = " + difference();
		arithmetic += "Product = " + product();
		arithmetic += "Quotient = " + quotient();
		return arithmetic;
	}
}
