import java.util.Scanner;

public class PizzaCost
{
	private int m_size;
	private int m_cheese;
	private int m_pepperoni;
	private int m_ham;

	public void readInput()
	{
		Scanner keyboard = new Scanner(System.in);
			System.out.println("Welcome to the pizza ordering service");
			System.out.println("We have 3 sizes avaliable: Small, medium, and large");
			System.out.println("Enter [1] if you would like a small pizza, [2] for a");
			System.out.println("medium pizza, and [3] for a large pizza ");
			int sizeInput = keyboard.nextInt();
			System.out.println("We also have 3 different toppings avaliable:");
			System.out.println("cheese, peperoni, and ham");
			System.out.println("How many cheese toppings would you like?");
			int cheeseInput = keyboard.nextInt();
			System.out.println("How many pepperoni toppings would you like?");
                        int pepperoniInput = keyboard.nextInt();
			System.out.println("And how many ham toppings would you like?");
                        int hamInput = keyboard.nextInt();
			setpizza(sizeInput, cheeseInput, pepperoniInput, hamInput);
	}

	public void setpizza(int size, int cheese, int pepperoni, int ham)
	{
		this.m_size = size;
		this.m_cheese = cheese;
		this.m_pepperoni = pepperoni;
		this.m_ham = ham;
	}

	public int getsize()
	{
		return m_size;
	}

	public int getcheese()
        {
		return m_cheese;
        }

	public int getpepperoni()
        {
		return m_pepperoni;
        }

	public int getham()
        {
		return m_ham;
        }

	public void setSize(int size)
	{
		if ((size < 1) || (size > 3))
		{
			System.out.println("Please enter 1, 2, or 3");
			System.out.println("Sorry, but you need to restart the program");
		}
		else
			this.m_size = size;
	}

	public void setCheese(int cheese)
        {
                if (cheese < 0)
                {
                        System.out.println("Invalid choice");
                        System.out.println("Sorry, but you need to restart the program");
                }
                else
                        this.m_cheese = cheese;
        }

	public void setPepperoni(int pepperoni)
        {
                if (pepperoni < 0) 
                {
                        System.out.println("Invalid choice");
                        System.out.println("Sorry, but you need to restart the program");
                }
                else
                        this.m_pepperoni = pepperoni;
        }

	public void setHam(int ham)
        {
                if (ham < 0)
                {
                        System.out.println("Invalid choice");
                        System.out.println("Sorry, but you need to restart the program");
                }
                else
                        this.m_ham = ham;
	}

	public void readOutput()
	{
		double pizzacost = 0;
		String PizzaSize = "hi";
		if (m_size == 1)
		{
			pizzacost = 10;
			PizzaSize = "small";
		}
		else if (m_size == 2)
		{
			pizzacost = 12;
			PizzaSize = "medium";
		}
		else
		{
			pizzacost = 14;
			PizzaSize = "large";
		}
		double cost = pizzacost + (2 * m_cheese) + (2 * m_pepperoni) + (2 * m_ham);
		System.out.println("You ordered a " + PizzaSize + " pizza with " + m_cheese + " cheese, " + m_pepperoni + " pepperoni, and " + m_ham + " ham toppings");
		System.out.println("Your total is $" + cost);
	}
}
