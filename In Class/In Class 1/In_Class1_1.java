import java.util.Scanner;

public class In_Class1_1
{
	public static void main(String []argv)
	{
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter your name ");
		String name = input.nextLine();

		System.out.println("Hello " + name);
	}
}
