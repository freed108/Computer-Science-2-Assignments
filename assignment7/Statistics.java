public class Statistics extends Game
{
	protected int n = 0;
	protected int P1V = 0;
	protected int P2V = 0;
	protected int Wars = 0;
	protected int DoubleWars = 0;
	protected int Impossible = 0;
	protected int Max = 0;
	protected int Min = 10000;
	protected int Total = 0;
	protected int Average = 0;

	public int TotalVictories1()
	{
		P1V += P1win;
		return P1V;
	}

	public int TotalVictories2()
	{
                P2V += P2win;
                return P2V;
        }

	public int TotalWars()
	{
		Wars += WarX1;
                return Wars;
        }

	public int TotalDoubleWars()
	{
		DoubleWars += WarX2;
                return DoubleWars;
        }

	public int TotalTripleWars()
	{
		Impossible += WarX3;
                return Impossible;
        }

	public int MaxBattles()
	{
                Max = Battles;
                return Max;
        }

	public int MinBattles()
	{
                Min = Battles;
                return Min;
        }

	public int TotalBattles()
	{
                Total += Battles;
                return Total;
        }

	public int TotalGames()
	{
		return n;
	}

	public int Stats()
	{
		while(n <= 1000)
		{
			Match();
			TotalVictories1();
			TotalVictories2();
			TotalWars();
			TotalDoubleWars();
			TotalTripleWars();
			TotalBattles();
			if(Max < Battles)
			{
				MaxBattles();
			}
			if(Min > Battles)
			{
				MinBattles();
			}
			n += 1;
		}
		TotalGames();
		Average = Total / n;
		return Average;
	}

	public void readOutput()
	{
		System.out.println("In " + n + " games, Player 1 won " + P1V + " times,");
                System.out.println(" Player 2 won " + P2V + " times,");
                System.out.println(" a total of " + Total + "battles were fought,");
                System.out.println(" " + Wars + " wars were fought,");
                System.out.println(" " + DoubleWars + " double wars were fought,");
                System.out.println(" and the impossible occured (a triple war) " + Impossible + " time(s)");
                System.out.println("The maximum number of battles fought in 1 match were " + Max + " battles,");
                System.out.println(" the minimum number of battles fought were " + Min + " ");
                System.out.println(" and the average number of battles per game was " + Average + " battles");
	}
}
