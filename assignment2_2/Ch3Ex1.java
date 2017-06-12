import java.util.Scanner;

public class Ch3Ex1
{
	public static void main(String []argv)
	{
		Scanner input = new Scanner(System.in);

		System.out.println("This program is used to guess a number's square root");
		System.out.println("Choose a number ");
		int n = input.nextInt();

		double guess = n/2;
		double previous = guess * 2;

		while((previous - guess) >= 0.01)
		{
			previous = guess;
                	double r = n/guess;
                	guess = (guess + r)/2;
		}

		System.out.println("The program estimates the number's square root is " + guess);
	}
}
