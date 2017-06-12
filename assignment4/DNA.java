import java.io.*;

public class DNA
{
	public static String rev(String input)
	{
		String temp="";
		for(int i = input.length()-1; i > 0; i--)
		{
			temp += input.charAt(i);
		}
		return temp;
	}

	public static void main(String []argv)
	{
		try
		{
			BufferedReader br = new BufferedReader(new FileReader("DNAdemo.txt"));
	
			String line = br.readLine();
			String line2 = " ";
			String line3 = " ";
			int times = 0;
	
			while(line != null)
			{
				line2 = " ";
				line3 = " ";

				for(int i = 0; i < line.length(); i++)
				{
					char c = line.charAt(i);
					if(c == 'A')
					{
						line2 = line2 + "T";
					}

					else if(c == 'T')
	                                {
	                                        line2 = line2 + "A";
	                                }

					else if(c == 'G')
	                                {
	                                        line2 = line2 + "C";
	                                }

					else if(c == 'C')
	                                {
        	                                line2 = line2 + "G";
                	                }
	
					else
        	                        {
                	                        System.out.println("The only nucleotides are A, T, G, and C! Start over");
						break;
                                	}
				}
				line = br.readLine();
				times = times + 1;
				if(times == 1)
				{
					System.out.println("The compliment of the 1st line is " + line2);
					System.out.println("And the reverse compliment of the 1st line is " + rev(line2));
					System.out.println(" ");
				}

				else if(times == 2)
                        	{
                                	System.out.println("The compliment of the 2nd line is " + line2);
					System.out.println("And the reverse compliment of the 2nd line is "+ rev(line2));
					System.out.println(" ");
                        	}

				else if(times == 3)
                        	{
                                	System.out.println("The compliment of the 3rd line is " + line2);
					System.out.println("And the reverse compliment of the 3rd line is " + rev(line2));
					System.out.println(" ");
                        	}

				else
                        	{
                                	System.out.println("The compliment of the " + times + "th line is " + line2);
					System.out.println("And the reverse compliment of the " + times + "th line is "+ rev(line2));
					System.out.println(" ");
                        	}

				line = br.readLine();
			}

			br.close();
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}
}
