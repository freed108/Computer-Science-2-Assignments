public class Ch1Ex6
{
	public static void main(String []argv)
	{
		String temp = argv[0];
		int Gear_size = Integer.parseInt(temp);

		String temp2 = argv[1];
		int Cadence = Integer.parseInt(temp2);

		double Speed_mph = Gear_size * 3.14 * (1.0/12.0) * (1.0/5280.0) * Cadence * (60/1);

		System.out.println(Speed_mph);
	}
}
