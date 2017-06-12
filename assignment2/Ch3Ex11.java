import java.util.Random;

public class Ch3Ex11
{
	public static void main(String []argv)
	{
		Random randomGenerator = new Random();

		int cont1 = randomGenerator.nextInt(31);
		int cont2 = randomGenerator.nextInt(31);

		while(cont2 == cont1)
		{
			cont2 = randomGenerator.nextInt(31);
		}

		int cont3 = randomGenerator.nextInt(31);

		while(cont3 == cont1)
                {
                        cont3 = randomGenerator.nextInt(31);
			while(cont3 == cont2)
                	{
                        	cont3 = randomGenerator.nextInt(31);
                	}
		}

		System.out.println("And are finalits who win a prize are:");
		System.out.println("Finalist number " + cont1 + ", number " + cont2 + ", and number " + cont3);
	}
}
