import java.util.Scanner;

public class Ch1Ex4
{
	public static void main(String []argv)
	{
		Scanner input = new Scanner(System.in);

		double MouseDeath = 0.001 * 12;
		double FriendDeath = 0.01 * 89;

		System.out.println("Your friend can safely drink less than " + FriendDeath + " ammount of sweetener");
	}
}
