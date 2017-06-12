import java.io.*;

public class A6InputOutput
{
	private String m_results;
	private String m_file;

	public void setoutput(String results, String file)
	{
		this.m_results = results;
		this.m_file = file;
	}

	public String getresults()
	{
		return m_results;
	}

	public String getfile()
	{
		return m_file;
	}

	public void setResults(String results)
	{
		results = "hi";
	}

	public void setFile(String file)
	{
		file = "log.txt";
	}

	public void readOutput()
	{
		try
		{
			PrintWriter pw = new PrintWriter(new FileOutputStream(file));

			pw.println(results);
			pw.println();
			pw.close();
			System.out.println("Results written to " + file);
		}
		catch(FileNotFoundException fex)
		{
			System.out.println("file not found");
		}
        	catch(IOException ioex)
        	{
            		System.out.println("IO error");
        	}
		catch(Exception ex)
		{
			System.out.println("error");
		}
	}
}
