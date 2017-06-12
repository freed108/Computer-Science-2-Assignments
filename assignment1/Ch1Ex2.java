public class Ch1Ex2
{
	public static void main(String []argv)
	{
		String temp = argv[0];
		int Coupons = Integer.parseInt(temp);

		int candy_bars = Coupons / 10;

		int gumballs = (Coupons % 10) / 3;

		System.out.println("You can get " + candy_bars + " candy bar(s) and " + gumballs + " gumball(s) with " + Coupons + " coupon(s)");
	}
}
