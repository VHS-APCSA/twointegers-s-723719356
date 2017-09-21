import java.util.Scanner;

public class TwoIntegersRunner
{
	public static void main(String[] args)
	{
		TwoIntegers input = new TwoIntegers(0, 0);
		int number1;
		int number2;
		System.out.print("Please enter your first integer!");
		number1 = input.nextInt(0);
		System.out.print("Please enter your second integer!");
		number2 = input.nextInt(0);
		String answers = arithmetic();
	}
}
