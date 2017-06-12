import java.util.Scanner;

public class Ch3Ex6
{
	public static void main(String []argv)
	{
		Scanner input = new Scanner(System.in);

		System.out.println("This program is used to predict the population of green crud after a number of days");
		int option = 0;

		while(option < 1)
		{
			System.out.println("Please enter the weight of the green crud population in pounds ");
			int weight = input.nextInt();

			System.out.println("Please enter the number of days that will pass ");
			int days = input.nextInt();

			int Fib = (days / 5) - 1;
			int Fib1 = 1;
			int Fib2 = 1;
			int Fib3 = 1;

			while(Fib > 0)
				{
					Fib3 = Fib1 + Fib2;
					Fib1 = Fib2;
					Fib2 = Fib3;
					Fib = Fib - 1;
				}

			int fut_weight = Fib3 * weight;
			System.out.println("In " + days + " days, the green crud population will be " + fut_weight + " pounds");

			System.out.println("Press (0) if you would like to use this program again. Press (1) if you wish to exit");
                        option = input.nextInt();
		}
	}
}
