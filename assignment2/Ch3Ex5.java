public class Ch3Ex5
{
	public static void main(String []argv)
	{
		double debt = 1000.00;
		double interest = 0.015;
		int months = 0;
		double total_interest = 0.0;

		while(debt > 0)
		{
			months = months + 1;
			debt = debt - (50 - (debt * interest));
			total_interest = total_interest + (debt*interest);
		}

		System.out.println("It will take " + months + " months to pay off the debt on a $1,000 stereo. During that time, you will pay $" + total_interest + " in interest");
	}
}
