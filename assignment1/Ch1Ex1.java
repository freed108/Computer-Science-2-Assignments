public class Ch1Ex1
{
	public static void main(String []argv)
	{
		double weight = 150 / 2.2;

		double run_MET = 10 * 30;
		double basketball_MET = 8 * 30;
		double sleep_MET = 1 * 360;
		double total_MET = run_MET + basketball_MET + sleep_MET;

		double calories = weight * total_MET * 0.0175;

		System.out.println("The 150-pound person will burn a total of " + calories + " calories");
	}
}
