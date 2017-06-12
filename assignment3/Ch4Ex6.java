import java.util.Scanner;

public class Ch4Ex6
{
	private int m_quiz1; //enter a variable name after int
	private int m_quiz2;
	private int m_quiz3;
	private int m_midterm;
	private int m_finalscore;

	public void readInput()
        {
                Scanner keyboard = new Scanner(System.in);
                        System.out.println("This program takes in 3 quiz and 2 test scores");
                        System.out.println("and outputs your grade");
                        System.out.println("The quizes are out of 10 points");
                        System.out.println("And the midterm and final (the two tests) are");
                        System.out.println("Out of 100 points");
                        System.out.println("Please enter the score of the 1st quiz ");
                        int quiz1Input = keyboard.nextInt();
                        System.out.println("Now enter the score of the 2nd quiz ");
                        int quiz2Input = keyboard.nextInt();
                        System.out.println("Now enter the score of the 3rd quiz ");
                        int quiz3Input = keyboard.nextInt();
                        System.out.println("Now enter the score of the midterm ");
                        int midtermInput = keyboard.nextInt();
                        System.out.println("Now enter the score of the final ");
                        int finalInput = keyboard.nextInt();
                        setquiz(quiz1Input, quiz2Input, quiz3Input, midtermInput, finalInput);
        }

	public void setquiz(int quiz1, int quiz2, int quiz3, int midterm, int finalscore)
	{
		this.m_quiz1 = quiz1;
		this.m_quiz2 = quiz2;
		this.m_quiz3 = quiz3;
		this.m_midterm = midterm;
		this.m_finalscore = finalscore;
	}

	public int getquiz1()
	{
		return m_quiz1;
	}

	public int getquiz2()
        {
                return m_quiz2;
        }

	public int getquiz3()
        {
                return m_quiz3;
        }

	public int getmidterm()
        {
                return m_midterm;
        }

	public int getfinal()
        {
                return m_finalscore;
        }

	public void setQuiz1(int quiz1) //You need to do this for each integer
	{
		if ((quiz1 < 0) || (quiz1 > 10))
		{
			System.out.println("Enter a value between 1 and 10 for the quizes!");
			System.out.println("Sorry, but you need to restart the program");
		}
		else
			this.m_quiz1 = quiz1;
	}

	public void setQuiz2(int quiz2)
        {
                if ((quiz2 < 0) || (quiz2 > 10))
                {
			System.out.println("Enter a value between 1 and 10 for the quizes!");
                        System.out.println("Sorry, but you need to restart the program");
                }
                else
                	this.m_quiz2 = quiz2;
        }

	public void setQuiz3(int quiz3)
        {
                if ((quiz3 < 0) || (quiz3 > 10))
                {
                        System.out.println("Enter a value between 1 and 10 for the quizes!");
                        System.out.println("Sorry, but you need to restart the program");
                }
                else
                        this.m_quiz3 = quiz3;
        }

	public void setMidterm(int midterm)
        {
                if ((midterm < 0) || (midterm > 100))
                {
                        System.out.println("Enter a value between 1 and 100 for the midterm!");
                        System.out.println("Sorry, but you need to restart the program");
                }
                else
                        this.m_midterm = midterm;
        }

	public void setFinal(int finalscore)
        {
                if ((finalscore < 0) || (finalscore > 100))
                {
                        System.out.println("Enter a value between 1 and 100 for the final!");
                        System.out.println("Sorry, but you need to restart the program");
                }
                else
                        this.m_finalscore = finalscore;
        }

	public void readOutput()
        {
                double gradequiz = ((((m_quiz1 * 10) + (m_quiz2 * 10) + (m_quiz3 * 10)) / 3) * 0.25);
                double grademidterm = (m_midterm * 0.35);
                double gradefinal = (m_finalscore * 0.40);
                double grade = (gradequiz + grademidterm + gradefinal);
                System.out.println("You have a " + grade + "% in the class");
		if (grade >= 90)
			System.out.println("You have an A in the class");
		else if (grade >= 80 || grade < 90)
                        System.out.println("You have a B in the class");
		else if (grade >= 70 || grade < 80)
                        System.out.println("You have a C in the class");
		else if (grade >= 60 || grade < 70)
                        System.out.println("You have a D in the class");
		else
                        System.out.println("You have an F in the class");
        }
}
