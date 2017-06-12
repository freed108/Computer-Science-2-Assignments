public class Player extends Deck
{
	protected int count1 = 0;
	protected int count2 = 0;
	protected int count3 = 0;
	protected int Card1 = 0;
	protected int Card2 = 0;
	protected int P1win = 0;
	protected int P2win = 0;
	protected int[] pile = new int[16];

	public int P1Victory()
	{
		P1win = 1;
		return P1win;
	}

	public int P2Victory()
        {
                P2win = 1;
                return P2win;
        }

	public int Count1Up()
	{
		count1 += 1;
		if(count1 == 52)
		{
			count1 = 0;
		}
		return count1;
	}

	public int Count2Up()
        {
                count2 += 1;
		if(count2 == 52)
                {
                        count2 = 0; 
                }
                return count2;
        }

	public int Flip1()
	{
		if(count1 == 52)
		{
			count1 = 0;
		}
		count3 = count1;
		while(P1Deck[count1] == 0 && P2win == 0)
		{
			count1 += 1;
			Count1Up();
			if(count1 == 52)
			{
				count1 = 0;
			}
			if(count1 == count3)
			{
				P2Victory();
			}
		}
		P1Deck[count1] = Card1;
		return Card1;
	}

	public int Flip2()
	{
		if(count2 == 52)
                {
                        count2 = 0;
                }
		count3 = count2;
		while(P2Deck[count2] == 0 && P1win == 0)
                {
                        count2 += 1;
			Count2Up();
                        if(count2 == 52)
                        {
                                count2 = 0;
                        }
                        if(count2 == count3)
                        {
                                P1Victory();
                        }
                }
                P2Deck[count2] = Card2;
                return Card2;
	}

	public int[] Remove1()
	{
		P1Deck[count1] = 0;
		return P1Deck;
	}

	public int[] Remove2()
        {
                P2Deck[count2] = 0;
                return P2Deck;
        }

	public int[] EmptyPile()
        {
		int count4 = 0;
                while(count4 < 16)
                {
                        pile[count4] = 0;
                        count4 += 1;
                }
                return pile;
        }

	public int[] War()
	{
		int count4 = 0;
		while(pile[count4] != 0)
		{
			count4 += 1;
			if(count4 == 16)
			{
				count4 = 0;
			}
		}
		pile[count4] = Card1;
		while(pile[count4] != 0)
                { 
                        count4 += 1;
			if(count4 == 16)
                        { 
                                count4 = 0;
                        }
                }
                pile[count4] = Card2;
		return pile;
	}

	public int[] Collect1()
	{
		int count4 = 0;
		while(P1Deck[count1] != 0)
		{
			count1 += 1;
			if(count1 == 52)
			{
				count1 = 0;
			}
		}
		P1Deck[count1] = Card1;
		while(P1Deck[count1] != 0)
                {
                        count1 += 1;
                        if(count1 == 52)
                        { 
                                count1 = 0;
                        }
                }
                P1Deck[count1] = Card2;
		while(count4 < 16)
		{
			if(pile[count4] != 0)
			{
				while(P1Deck[count1] != 0)
				{
					count1 += 1;
					if(count1 == 52)
					{
						count1 = 0;
					}
				}
				P1Deck[count1] = pile[count4];
				pile[count4] = 0;
			}
			count4 += 1;
		}
		return P1Deck;
	}

	public int[] Collect2()
        {
		int count4 = 0;
                while(P2Deck[count2] != 0)
                {
                        count2 += 1;
                        if(count2 == 52)
                        {
                                count2 = 0;
                        }
                }
                P2Deck[count2] = Card1;
                while(P2Deck[count2] != 0)
                {
                        count2 += 1;
                        if(count2 == 52)
                        {
                                count2 = 0;
                        }
                }
                P2Deck[count2] = Card2;
		while(count4 < 16)
                {
                        if(pile[count4] != 0)
                        {
                                while(P2Deck[count2] != 0)
                                {
                                        count2 += 1;
                                        if(count2 == 52)
                                        {
                                                count2 = 0;
                                        }
                                }
                                P2Deck[count2] = pile[count4];
                                pile[count4] = 0;
                        }
                        count4 += 1;
                }
		return P2Deck;
	}
}
