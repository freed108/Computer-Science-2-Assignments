import java.util.Scanner;

public class Ch3Ex4
{
	public static void main(String []argv)
	{
		Scanner input = new Scanner(System.in);

		System.out.println("This Program is used to estimate an item's future cost");
		System.out.println("Please enter the cost of the item ");
		double Cost = input.nextDouble();

		System.out.println("Please enter the current rate of inflation ");
                double Inf = input.nextDouble();

		System.out.println("Please enter the number of years in which you wish to buy the item ");
                double Years = input.nextDouble();

		double Inf_dec = Inf/100;
		double Fut_Cost = Cost + (Cost * Inf_dec * Years);
		System.out.println("The item will cost $" + Fut_Cost + " in " + Years + " years");
	}
}
