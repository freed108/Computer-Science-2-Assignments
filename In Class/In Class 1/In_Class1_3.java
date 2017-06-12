import java.util.Scanner;

public class In_Class1_3
{
        public static void main(String []argv)
        {
		Scanner input = new Scanner(System.in);

		System.out.println("This program displays your current class level");
		int credits = -1;

		while(credits < 0)
		{
			System.out.println("Please enter your current total of college credits ");
			credits = input.nextInt();

			if(credits < 0)
			{
				System.out.println("Pay attention to the question!");
			}
		}

		if(credits <= 30)
		{
			System.out.println("You are currently a freshmen");
		}

		if(credits > 30 && credits <= 60)
                {
                        System.out.println("You are currently a sophomore");
                }

		if(credits > 60 && credits <= 90)
                {
                        System.out.println("You are currently a junior");
                }

		if(credits > 90)
                {
                        System.out.println("You are currently a senior. Way to go!");
                }
        }
}
