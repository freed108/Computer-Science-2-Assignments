import java.util.Scanner;

public class In_Class1_2
{
        public static void main(String []argv)
        {
		Scanner input = new Scanner(System.in);

		System.out.println("This program adds two numbers together");
		System.out.println("Please enter a number ");
		int Num1 = input.nextInt();

		System.out.println("Now enter a second number ");
		int Num2 = input.nextInt();

		int sum = Num1 + Num2;

		System.out.println("The sum of " + Num1 + " and " + Num2 + " is " + sum);
        }
}
