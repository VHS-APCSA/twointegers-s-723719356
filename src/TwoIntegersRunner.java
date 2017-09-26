import java.util.Scanner;

public class TwoIntegersRunner
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your integers!");
		int input1 = input.nextInt();
		int input2 = input.nextInt();
		TwoIntegers twoIntegers = new TwoIntegers(input1, input2);
		String answer = twoIntegers.arithmetic();
		System.out.println(answer);
		TwoIntegers compareIntegers = new TwoIntegers(input1, input2);
		String comparison = compareIntegers.compareIntegers();
		System.out.println(comparison);
		TwoIntegers oddOrEven = new TwoIntegers(input1, input2);
		String oddOrEvenAnswer = oddOrEven.oddOrEven();
		System.out.print(oddOrEvenAnswer);
		TwoIntegers multiple = new TwoIntegers(input1, input2);
		String multipleanswer = multiple.multiple();
		System.out.print(multipleanswer);
	}
}
