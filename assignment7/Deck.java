import java.util.Random;

public class Deck
{
	protected int[] P1Deck = new int[52];
	protected int[] P2Deck = new int[52];
	protected int[] MainDeck = new int[52];

	public int[] BuildDeck()
	{
		int c = 1;
		for(int i = 0; i < 51; i++)
		{
			MainDeck[i] = c%4;
			c += 1;
		}
		return MainDeck;
	}

	public int[] Deal()
	{
		int count = 0;
		Random distribute = new Random();
		while(count < 26)
		{
			int A = distribute.nextInt(51);
			if(A < 26 && A > 0)
			{
				P1Deck[count] = MainDeck[A];
				MainDeck[A] = 0;
				count += 1;
			}
		}
		return P1Deck;
	}

	public int[] Deal2()
        {
                int count = 0;
		Random distribute = new Random();
		while(count < 26)
                {
                        int A = distribute.nextInt(51);
                        if(A > 25)
                        {
                                P2Deck[count] = MainDeck[A];
                                MainDeck[A] = 0;
                                count += 1;
                        }
                }
                return P2Deck;
        }
}
