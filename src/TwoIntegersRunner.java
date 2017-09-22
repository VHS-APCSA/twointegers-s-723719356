import java.util.Scanner;

public class TwoIntegersRunner
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your integers!");
		int input1 = input.nextInt();
		int input2 = input.nextInt();
		TwoIntegers twoIntegers = new TwoIntegers(1, 2);
		String answer = twoIntegers.arithmetic();
		System.out.println(answer);
	}
}
