
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
		arithmetic = "Sum = " + sum() + "\n";
		arithmetic += "Difference = " + difference() + "\n";
		arithmetic += "Product = " + product() + "\n";
		arithmetic += "Quotient = " + quotient() + "\n";
		return arithmetic;
	}
	public String compareIntegers()
	{
		String compareIntegers = "";
		if(integer1>integer2)
		{
			compareIntegers = integer1 + " is greater than " + integer2;
		}
		else
		{
			compareIntegers = integer1 + " is less than " + integer2;
		}
		return compareIntegers;
	}
	public String oddOrEven()
	{
		String oddOrEven = "";
		if(integer1%2==0)
		{
			oddOrEven = integer1 + " is Even \n";
		}
		else
		{
			oddOrEven = integer1 + " is Odd \n";
		}
		return oddOrEven;
	}
	public String multiple()
	{
		String multiple = "";
		if (integer2%integer1==0)
		{
			multiple = "Integer 1 is a multiple of Integer 2";
		}
		else 
		{
			multiple = "Integer 1 is not a multiple of Integer 2";
		}
		return multiple;
	}
}
