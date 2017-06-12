import java.util.Scanner;

public class Ch2Ex5
{
	public static void main(String []argv)
	{
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter the item's price");
		double price = input.nextDouble();

		System.out.println("Now enter the number of years you expect to use the item");
		double years_used = input.nextDouble();

		System.out.println("Now enter what you expect the item's salvage value to be");
		double salvage_value = input.nextDouble();

		double depreciation = (price - salvage_value) / years_used;

		System.out.println("The yearly depreciation value is " + depreciation);
	}
}

