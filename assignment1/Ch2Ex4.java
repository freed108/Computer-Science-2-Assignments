import java.util.Scanner;

public class Ch2Ex4
{
	public static void main(String []argv)
	{
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the distance you traveled in miles:");
		double distance = input.nextDouble();

		System.out.println("Now enter your car's fuel consumption in Miles Per Gallon:");
                double MPG = input.nextDouble();

		System.out.println("Now enter the current price of a gallon of gasoline:");
                double price = input.nextDouble();

		double cost = (distance / MPG) * price;

		System.out.println("This trip in this car will cost you $" + cost);
	}
}

