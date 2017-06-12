import java.util.Random;

public class Ch3Ex8
{
	Random randomGenerator = new Random();

	int T = 1;
	int O = 1;
	int G = 1;
	int D = 1;

	int TOOx4 = (T * O * O) + (T * O * O) + (T * O * O) + (T * O * O);
	int GOOD = G * O * O * D;

	while (TOOx4 != GOOD)
	{
		T = randomGenerator.nextInt(10);
		O = randomGenerator.nextInt(10);
		G = randomGenerator.nextInt(10);
		D = randomGenerator.nextInt(10);
	}

	System.out.println("The values which make TOO + TOO + TOO + TOO = GOOD are:");
	System.out.println("T = " + T + ", O = " + O + ", G = " + G + ", and D = " + D);
}
