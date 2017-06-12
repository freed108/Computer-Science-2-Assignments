public class Ch7Ex2
{
	public static void main(String[] argv)
	{
		File F1 = new File();
		Email E1 = new Email();
		F1.setFile("Documents > Assignments");
		E1.setEmail("Jason", "Professor", "How do I do this?");

		File F2 = new File();
                Email E2 = new Email();
                F2.setFile("Documents > Notes");
                E2.setEmail("Anotherstudent", "Jason", "This is how");

		File F3 = new File();
                Email E3 = new Email();
                F3.setFile("Documents > Testprep");
                E3.setEmail("Concernedstudent", "Jason", "Readme");

		if(containsKeyword(E1, "Professor"))
		{
     			System.out.println("Keyword found");
		}
		else
		{
     			System.out.println("Keyword not found");
		}

		if(containsKeyword(E2, "Professor"))
                {
                        System.out.println("Keyword found");
                }
                else
                {
                        System.out.println("Keyword not found");
                }

		if(containsKeyword(E3, "Professor"))
                {
                        System.out.println("Keyword found");
                }
                else
                {
                        System.out.println("Keyword not found");
                }

		if(containsKeyword(F1, "Documents"))
                {
                        System.out.println("Keyword found");
                }
                else
                {
                        System.out.println("Keyword not found");
                }

		if(containsKeyword(F2, "Documents"))
                {
                        System.out.println("Keyword found");
                }
                else
                {
                        System.out.println("Keyword not found");
                }

		if(containsKeyword(F3, "Documents"))
                {
                        System.out.println("Keyword found");
                }
                else
                {
                        System.out.println("Keyword not found");
                }
	}

	public static boolean ContainsKeyword(Document docObject, String keyword)
        {
        if (docObject.toString().indexOf(keyword,0) >= 0)
                return true ;
        return false ;
        }
}
