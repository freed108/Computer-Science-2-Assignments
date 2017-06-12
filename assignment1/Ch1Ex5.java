public class Ch1Ex5
{
	public static void main(String []argv)
	{
		String sentence = argv[0];
		int position = sentence.indexOf("hate");
		String ending = sentence.substring(position + "hate".length());

		System.out.println(sentence);
		sentence = sentence.substring(0, position) + "love" + ending;
		System.out.println("I have rephrased that line to read:");
		System.out.println(sentence);
	}
}
