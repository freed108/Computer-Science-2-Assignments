public class Ch2Ex2
{
	public static void main(String []argv)
	{
		String first = argv[0];

		String last = argv[1];

		first = first.toLowerCase();
		String New_first_pt1 = first.substring(0,1);
		String New_first_pt2 = first.substring(1);
		String New_first_pt3 = New_first_pt2 + New_first_pt1;
		String New_first_pt4 = New_first_pt3.substring(0,1);
                String New_first = New_first_pt4.toUpperCase() + New_first_pt3.substring(1);

		last = last.toLowerCase();
		String New_last_pt1 = last.substring(0,1);
		String New_last_pt2 = last.substring(1);
		String New_last_pt3 = New_last_pt2 + New_last_pt1;
		String New_last_pt4 = New_last_pt3.substring(0,1);
                String New_last = New_last_pt4.toUpperCase() + New_last_pt3.substring(1);

		System.out.println(New_first + "ay " + New_last + "ay");
	}
}

