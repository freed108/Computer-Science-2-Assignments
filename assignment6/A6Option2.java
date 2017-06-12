import java.io.File;

public class A6Option2
{
	public static void listDirectoryContents(File dir, String indent)
        {
                String[] files;  //List of names of files in the directory
                indent += "   ";  // Increase the indentation for listing the contents.
                files = dir.list();

                for (int i = 0; i < files.length; i++)
                {
                        //If the file is a  directory, list its contents
                        //recursively.  Otherwise, just print its name
                        File fa = new File(dir, files[i]);

                        if (fa.isDirectory())
                                listDirectoryContents(fa, indent);

                        else
                                System.out.println(indent + files[i]);
                }
        }
}
