public class Ch2Ex3
{
	public static void main(String []argv)
	{
		String temp = argv[0];
		int myNum = Integer.parseInt(temp);

		String temp2 = argv[1];
		int myNum2 = Integer.parseInt(temp2);

		int sum = myNum + myNum2;
		int diff = myNum - myNum2;
		int prod = myNum * myNum2;

		System.out.println("Their sum is " + sum + ", their difference is " + diff + ", and their product is " + prod);
	}
}
