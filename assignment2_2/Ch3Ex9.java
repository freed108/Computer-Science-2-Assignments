import java.util.Scanner;

public class Ch3Ex9
{
	public static void main(String []argv)
	{
		Scanner input = new Scanner(System.in);

		System.out.println("How many exercises to input? ");
		int total_excercises = input.nextInt();
		int excercises_left = total_excercises;

		int excercise_number = 0;
		double total_score = 0;
		double total_possible_score = 0;

		while(excercises_left > 0)
		{
			excercise_number = excercise_number + 1;
			excercises_left = excercises_left - 1;

			System.out.println("Score recieved for exercise " + excercise_number + ": ");
			double score = input.nextDouble();

			System.out.println("Total points possible for exercise " + excercise_number + ": ");
                        double possible_score = input.nextDouble();

			total_score = total_score + score;
			total_possible_score = total_possible_score + possible_score;
		}

		double percent = (total_score / total_possible_score) * 100;

		System.out.println("Your total is " + total_score + " out of " + total_possible_score + ", or " + percent + "%");
	}
}
