import java.io.*;

public class A6Option5.java
{
	private String m_file1;
        private String m_file2;
	private String m_file3;

        public void setoutput(String file1, String file2, String file3)
        {
                this.m_file1 = file1;
                this.m_file2 = file2;
		this.m_file3 = file3;
        }

	public String getfile1()
        {
                return m_file1;
        }

	public String getfile2()
        {
                return m_file2;
        }

	public String getfile3()
        {
                return m_file3;
        }

        public void setFile1(String file1)
        {
		file1 = "foo2.txt";
        }

        public void setFile2(String file2)
        {
		file2 = "foo3.txt";
        }

        public void setFile3(String file3)
        {
		file3 = "foo5.txt";
        }

	public void readOutput()
	{
		try
                {
                        PrintWriter pw = new PrintWriter(new FileOutputStream(file3, true));
			BufferedReader br1 = new BufferedReader(new FileReader(file1));
			BufferedReader br2 = new BufferedReader(new FileReader(file2));

			String line = br1.readLine();

			while(line != null)
			{
				pw.println(line);
				line = br1.readLine();
			}

			br1.close();

			line = br2.readLine();

                        while(line != null)
                        {
                                pw.println(line);
                                line = br2.readLine();
                        }

			br2.close();
			pw.close();
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
