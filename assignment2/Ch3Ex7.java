import java.util.Scanner;

public class Ch3Ex7
{
	public static void main(String []argv)
	{
		Scanner input = new Scanner(System.in);

		int option = 0;

		while(option < 1)
		{
			System.out.println("Choose a value of x ");
			int x = input.nextInt();

			int count = 1;
			double n = 1;
			double e1 = 1 + x;
			double e10 = 1 + x;
			double e50 = 1;
			double e100 = 1;

			while(count <= 10)
                        {
				n = count * n;
				e10 = e10 + ((x ^ count) / n);
				count +=1;
                        }
			e50 = e10;

			while(count <= 50)
                        {
                                n = count * n;
                                e50 = e50 + ((x ^ count) / n);
                                count +=1;
                        }
			e100 = e50;

			while(count <= 100)
                        {
                                n = count * n;
                                e100 = e100 + ((x ^ count) / n);
                                count +=1;
                        }

			System.out.println("The value of e to the " + x + "th power with n as 1 is " + e1);
                	System.out.println("The value of e to the " + x + "th power with n as 10 is " + e10);
                	System.out.println("The value of e to the " + x + "th power with n as 50 is " + e50);
                	System.out.println("The value of e to the " + x + "th power with n as 100 is " + e100);
                	System.out.println("Would you like to use this program again? Input 0 for yes, 1 for no");
			option = input.nextInt();
		}
	}
}
