import java.util.Scanner;

public class Ch4Ex12
{
        public static void main(String []argv)
        {
		Scanner input = new Scanner(System.in);

                PizzaCost pizza = new PizzaCost();
                pizza.readInput();
                pizza.readOutput();

		System.out.println("Would you like to order a 2nd pizza?");
		System.out.println("Enter [1] for yes, [2] for no");
		int option = input.nextInt();

		if(option == 1)
		{
			PizzaCost pizza2 = new PizzaCost();
                	pizza2.readInput();
                	pizza2.readOutput();

			System.out.println("Would you like to order a 3rd pizza?");
                	System.out.println("Enter [1] for yes, [2] for no");
                	int option2 = input.nextInt();

                	if(option2 == 1)
                	{
                        	PizzaCost pizza3 = new PizzaCost();
                        	pizza3.readInput();
                        	pizza3.readOutput();
                	}
		}
        }
}
