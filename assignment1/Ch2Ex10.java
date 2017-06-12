import java.util.Scanner;

public class Ch2Ex10
{
	public static void main(String []argv)
	{
		Scanner input = new Scanner(System.in);

		System.out.println("Input name of item 1:");
		String name1 = input.nextLine();
		System.out.println("Input quantity of " + name1 + "(s)");
                int quantity1 = input.nextInt();
		System.out.println("Input individual cost of A " + name1);
                double cost1 = input.nextDouble();

		System.out.println("Input name of item 2:");
                String name2 = input.nextLine();
		name2 = input.nextLine();
                System.out.println("Input quantity of " + name2 + "(s)");
                int quantity2 = input.nextInt();
                System.out.println("Input individual cost of A " + name2);
                double cost2 = input.nextDouble();

		System.out.println("Input name of item 3:");
                String name3 = input.nextLine();
		name3 = input.nextLine();
                System.out.println("Input quantity of " + name3 + "(s)");
                int quantity3 = input.nextInt();
                System.out.println("Input individual cost of A " + name3);
                double cost3 = input.nextDouble();

		double total1 = quantity1 * cost1;
		double total2 = quantity2 * cost2;
		double total3 = quantity3 * cost3;
		double total = total1 + total2 + total3;
		double tax = total * 0.0625;
		double Total = total + tax;

		System.out.println("Your bill:");
		System.out.println(" ");
		System.out.println("Item		Amount	Price   Total");
		System.out.println(name1 + "	" + quantity1 + "	" + cost1 + "	" + total1);
		System.out.println(name2 + "	    " + quantity2 + "       " + cost2 + "   " + total2);
		System.out.println(name3 + "	    " + quantity3 + "       " + cost3 + "   " + total3);
		System.out.println("Subtotal			" + total);
		System.out.println("6.25% slaes tax			" + tax);
		System.out.println("Total				" + Total);
	}
}
