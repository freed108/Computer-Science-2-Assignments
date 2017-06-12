public class Game extends Player
{
	protected int WarX1 = 0;
	protected int WarX2 = 0;
	protected int WarX3 = 0;
	protected int Battles = 0;

	public int IncWarX1() //Inc is the abbreviation of increase
        {
                WarX1 += 1;
		return WarX1;
        }

        public int IncWarX2()
        {
                WarX2 += 1;
		return WarX2;
        }

        public int IncWarX3()
        {
                WarX3 = 1;
                return WarX3;
        }

	public int Match()
	{
		BuildDeck();
		Deal();
		Deal2();
		EmptyPile();
		while(P1win == 0 && P2win == 0 && WarX3 == 0)
		{
			Flip1();
			Flip2();
			if(P2win != 1)
			{
				Remove1();
			}
			if(P1win != 1)
			{
				Remove2();
			}
			if(P1win == 0 && P2win == 0)
			{
				if(Card1 > Card2)
				{
					Collect1();
					Battles = Battles + 1;
				}
				else if(Card1 < Card2)
                                { 
                                        Collect2();
					Battles = Battles + 1;
                                }
				else
				{
					War();
					Flip1();
                        		Flip2();
                        		if(P2win != 1)
                        		{
                                		Remove1();
                        		}
                        		if(P1win != 1)
                        		{
                                		Remove2();
                        		}

					War();
					Flip1();
                                        Flip2();
                                        if(P2win != 1)
                                        {
                                                Remove1();
                                        }
                                        if(P1win != 1)
                                        {
                                                Remove2();
                                        }

					War();
					Flip1();
                                        Flip2();
                                        if(P2win != 1)
                                        {
                                                Remove1();
                                        }
                                        if(P1win != 1)
                                        {
                                                Remove2();
                                        }

					IncWarX1();

					if(Card1 > Card2)
                                	{ 
                                        	Collect1();
						EmptyPile();
						Battles = Battles + 1;
						P1win = 0;
                                	}
                                	else if(Card1 < Card2)
                                	{
                                        	Collect2();
						EmptyPile();
						Battles = Battles + 1;
						P2win = 0;
                                	}
                                	else      
                                	{ 
                                        	P1win = 0;
						P2win = 0;

						War();
						Flip1();
                                        	Flip2();
                                        	if(P2win != 1)
                                        	{
                                                	Remove1();
                                        	}
                                        	if(P1win != 1)
                                        	{
                                                	Remove2();
                                        	}

						War();
                                                Flip1();
                                                Flip2();
                                                if(P2win != 1)
                                                {
                                                        Remove1();
                                                }
                                                if(P1win != 1)
                                                {
                                                        Remove2();
                                                }

						War();
                                                Flip1();
                                                Flip2();
                                                if(P2win != 1)
                                                {
                                                        Remove1();
                                                }
                                                if(P1win != 1)
                                                {
                                                        Remove2();
                                                }

                                        	IncWarX1();
						IncWarX2();

                                        	if(Card1 > Card2)
                                        	{
                                                	Collect1();
							EmptyPile();
							Battles = Battles + 1;
							P1win = 0;
                                        	}
                                        	else if(Card1 < Card2)
                                        	{
                                                	Collect2();
							EmptyPile();
							Battles = Battles + 1;
							P2win = 0;
                                        	}
                                        	else
                                        	{
							P1win = 0;
							P2win = 0;
                                                	IncWarX1();
                                                	IncWarX3();
							Battles = Battles + 1;
                                        	}
                                	}
				}
			}
		}
		if(P1win > 0);
		{
			P1Victory();
		}

		if(P2win > 0);
                {
                        P2Victory();
                }
		return Battles;
	}
}
