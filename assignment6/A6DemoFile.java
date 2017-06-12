import java.io.File;

public class A6DemoFile
{
	public static void main(String[] argv)
	{
		A6Switch choice = new A6Switch();
		A6Switch choice2 = new A6Switch();
		//A6InputOutput R1 = new A6InputOutput();
		A6Option2 Op2 = new A6Option2();
		//A6Option5 Op5 = new A6Option5();
		int Switch = 1;
		String Extension = ".java";
		String f1 = "hi";
		String f2 = "hi";
		String f3 = "hi";

		/*System.out.println("The results are 2 + 2 = 4");
		System.out.println("Would you like to place the results in a log file?");
		System.out.println("Type (1) for yes, (2) for no");
		choice.readInput();
                Switch = Integer.parseInt(choice.getoption());

		if(Switch == 1)
		{
			System.out.println("Please enter the name of the log file");
			choice2.readInput();
			R1.setoutput(4, choice2.getoption());
			R1.readOutput();
		}*/

		while(Switch > 0 && Switch < 6)
		{
			System.out.println("What would you like to do now?");
                	System.out.println("Enter (1) to list the contents of a directory of your choosing");
                	System.out.println("Enter (2) to list the contents of a directory of your choosing along with its sub directories");
                	System.out.println("Enter (3) to locate a file of your choosing");
                	System.out.println("Enter (4) to locate all files with a given file extension");
                	System.out.println("Enter (5) to concatenate the contents of 2 files of your choosing and output their contents to a third file of your choosing");
                	System.out.println("Enter (6) to exit the program");
                	choice.readInput();
                	Switch = Integer.parseInt(choice.getoption());

			if(Switch == 1)
			{
				System.out.println("Option 1 chosen");
				System.out.println("Choose the directory you wish to list the contents of");
				choice2.readInput();

				File fn = new File(choice2.getoption());

                		String[] strFileArray = fn.list();

                		for(int i = 0; i < strFileArray.length; i++)
                        		System.out.println("Directory Contents " + strFileArray[i]);
			}

			else if(Switch == 2)
                	{
				System.out.println("Option 2 chosen");
                                System.out.println("Choose the directory you wish to list the contents and subdirectories of");
				choice2.readInput();

                                File f = new File(choice2.getoption());

				if (f.isDirectory() == false) 
				{
					if (f.exists() == false)
            					System.out.println("There is no such directory!");
         				else //the file exists but is not a directory
            					System.out.println("That file is not a directory.");
      				}

      				else
				{
            				//List the contents of the directory recursively, with
					//no indentation at the top level.
         				Op2.listDirectoryContents(f,"");
      				}
                	}

			else if(Switch == 3)
                	{
				System.out.println("Option 3 chosen");
                                System.out.println("Choose the file you wish to find");
				choice2.readInput();

                                File fi = new File(choice2.getoption());

				if (fi.exists() == false)
                                	System.out.println("There is no such file in that directory!");
                                else
                                        System.out.println("A file of that name exists in that directory");
                	}

			else if(Switch == 4)
                	{
				System.out.println("Option 4 chosen");
                                System.out.println("Choose the directory you wish to search");
				/*choice2.readInput();

				File fb = new File(choice2.getoption());

				System.out.println("Choose the file extension you wish to search for");
				Extension = choice2.getoption();
				File[] matchingFiles = f.listFiles(new FilenameFilter());
				{
    					public boolean accept(File dir, String name)
					{
        					return name.endsWith(Extension);
    					}
				}*/

			else if(Switch == 5)
                	{
				System.out.println("Option 5 chosen");
                                /*System.out.println("Enter the name of the first file");
				choice2.readInput();
				f1 = choice2.getoption();

				System.out.println("Enter the name of the second file");
                                choice2.readInput();
                                f2 = choice2.getoption();

				System.out.println("Enter the name of the file which will recieve the contents of " + f1 + " and " + f2);
                                choice2.readInput();
                                f3 = choice2.getoption();

				Op5.setoutput(f1, f2, f3);
				Op5.readOutput();*/
                	}

			else
                	{
				System.out.println("Option 6 choosen. Terminating program");
                	}
		}
	}
}
