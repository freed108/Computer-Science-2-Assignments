import java.util.Scanner;

public class Ch3Ex3
{
	public static void main(String []argv)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Hello, this program is used to estimate a child's adult height");
		int option = 0;

		while(option < 1)
		{
			System.out.println("Please enter the child's gender ");
			System.out.println("If the child is a boy, enter: 1");
			System.out.println("If the child is a girl, enter: 2");
			int Gender = input.nextInt();

			System.out.println("Now enter the mother's height in feet ");
			int M_height_infeet = input.nextInt();
			System.out.println("Now enter the remaining height in inches ");                      
                	int M_height_ininches = input.nextInt();

			System.out.println("Now enter the father's height in feet ");                      
                	int F_height_infeet = input.nextInt();
                	System.out.println("Now enter the remaining height in inches ");
                	int F_height_ininches = input.nextInt();

			int M_height = (M_height_infeet * 12) + M_height_ininches;

			int F_height = (F_height_infeet * 12) + F_height_ininches;

			switch(Gender)
			{
				case 1:
					double MC_height = (((13.0/12.0) * M_height) + F_height)/2;
					int MC_height_infeet = (int)MC_height/12;
					int MC_height_ininches = (int) MC_height % 12;
					System.out.println("The child will be " + MC_height_infeet + " feet and " + MC_height_ininches + " inches tall as an adult");
					break;

				case 2:
					double FC_height = (((12.0/13.0) * F_height) + M_height)/2;
                                	int FC_height_infeet = (int)FC_height/12;
                                	int FC_height_ininches = (int) FC_height % 12;
                                	System.out.println("The child will be " + FC_height_infeet + " feet and " + FC_height_ininches + " inches tall as an adult");
					break;

				default:
                                	System.out.println("Pay attention and choose the correct option");
                                	break;
			}

			System.out.println("Press (0) if you would like to use this program again. Press (1) if you wish to exit");
                        option = input.nextInt();
		}
	}
}
