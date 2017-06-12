import java.util.Scanner;

public class Ch2Ex7
{
	public static void main(String []argv)
	{
		Scanner input = new Scanner(System.in);

		System.out.println("Welcome to the vending machine problem");
		System.out.println("Please enter the price of an item from");
		System.out.println("25 cents to 1 dollar (100 cents) in");
		System.out.println("5-cent increments");
		int cost = input.nextInt();

		int quarters = (100 - cost) / 25;
		int dimes = ((100 - cost) % 25) / 10;
		int nickels = (((100 - cost) % 25) % 10) / 5;

		System.out.println("You bought an item for " + cost + " cents and gave me a dollar,");
		System.out.println("so your change is");
		System.out.println(quarters + " quarter(s),");
		System.out.println(dimes + " dime(s), and");
		System.out.println(nickels + " nickel(s).");
	}
}
