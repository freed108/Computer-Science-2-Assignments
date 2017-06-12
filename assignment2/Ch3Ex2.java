import java.util.Random;

public class Ch3Ex2
{
	public static void main(String []argv)
	{
		Random randomGenerator = new Random();

		int games = 0;
		int wins = 0;
		int loses = 0;

		while(games < 10000)
		{
			int dice1 = randomGenerator.nextInt(7);
			while(dice1 == 0)
			{
				dice1 = randomGenerator.nextInt(7);
			}
			int dice2 = randomGenerator.nextInt(7);
			while(dice2 == 0)
                        {
                                dice2 = randomGenerator.nextInt(7);
                        }
			int roll = dice1 + dice2;
			int reroll = 0;

			if(roll == 7)
			{
				wins = wins + 1;
			}

			else if (roll == 11)
                        {
                                wins = wins + 1;
                        }

			else if (roll == 2)
                        {
                                loses = loses + 1;
                        }

			else if (roll == 3)
                        {
                                loses = loses + 1;
                        }

			else if (roll == 12)
                        {
                                loses = loses + 1;
                        }

			else
			{
				while(reroll < 1)
				{
					int dice3 = randomGenerator.nextInt(7);
                        		int dice4 = randomGenerator.nextInt(7);
                        		int roll2 = dice3 + dice4;

					if(roll2 == roll)
					{
						wins = wins + 1;
						reroll = 1;
					}

					else if (roll2 == 7)
                                        {
                                                loses = loses + 1;
                                                reroll = 1;
                                        }
				}
			}

			games = games + 1;
		}

		System.out.println("It is estimated you will win " + wins + " games out of " + games + " games");
	}
}
