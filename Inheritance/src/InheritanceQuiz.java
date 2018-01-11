import java.io.*;
import java.util.*;
public class InheritanceQuiz
	{
		public static int correct = 0;
		public static int random = 8;
		public static int Totalruns = 0;
		public static ArrayList<Question> questions = new ArrayList<Question>();
		public static void main(String[] args)
			{
				execute();
			}
		public static void execute()
		{
			try
			{
			System.out.println("How many questions would you like?");
			Scanner response = new Scanner(System.in);
			int runs = response.nextInt();
			Totalruns = runs;
			fillQuestions();
			System.out.println();
			while(runs>0)
				{
					question();
					runs--;
					System.out.println("-----------------------------------------------------------------------------");
				}
			}
			catch(InputMismatchException e)
				{
					System.out.println("It seems that wasn't a number?");
					execute();
				}
			score();
			redo();
		}
		public static void fillQuestions()
		{
			questions.add(new Question("					Planet x = new Planet();", "					x.runOrbit();", 2 ));
			questions.add(new Question("					Planet x = new Planet();","					x.runExpand();" , 3));
			questions.add(new Question("					Planet x = new Gas();","					x.runOrbit();" , 2));
			questions.add(new Question("					Planet x = new Gas();","					x.runExpand();" , 4));
			questions.add(new Question("					Gas x = new Planet();","					x.runExpand();" , 5));
			questions.add(new Question("					Gas x = new Planet();", "					x.runLand();", 5));
			questions.add(new Question("					Gas x = new Gas();", "					x.runExpand();", 4));
			questions.add(new Question("					Gas x = new Gas();", "					x.runLand();", 1));
			questions.add(new Question("					Gas x = new Gas();","					super.runExpand();" , 5));
		}
		public static void question()
		{
			try
				{
			int x = (int)(Math.random()*random);
			System.out.println("If the following code runs:");
			System.out.println(questions.get(x).getLine1());
			System.out.println(questions.get(x).getLine2());
			System.out.println();
			System.out.println("What will the result be?");
			System.out.println("		1. 'You can't land'");
			System.out.println("		2. 'This does orbit'");
			System.out.println("		3. 'This may expand'");
			System.out.println("		4. 'This does expand'");
			System.out.println("		5. The code will not run");
			Scanner response = new Scanner(System.in);
			int reply = response.nextInt();
			if(reply == questions.get(x).getAnswer())
				{
					System.out.println();
					System.out.println("That is correct!");
					System.out.println("	Score +1");
					System.out.println();
					correct++;
				}
			else
				{
					System.out.println();
					System.out.println("Sorry that's wrong!");
					System.out.println("	Score +0");
					System.out.println();
				}
			questions.remove(x);
			random--;
				}
			catch(InputMismatchException e)
				{
					System.out.println("It seems your answer couldn't be read.");
					System.out.println("	Score +0");
					System.out.println();
				}
		}
		public static void score()
		{
			System.out.println("You got " + correct + "/" + Totalruns + " correct!");
		}
		public static void redo()
		{
			System.out.println();
			System.out.println("-----------------------------------------------------------------------------");
			System.out.println();
			System.out.println("Would you like to go again?");
			System.out.println();
			System.out.println("		1) Yes");
			System.out.println("		2) No");
			System.out.println("-----------------------------------------------------------------------------");
			System.out.println();
			try{
			Scanner response = new Scanner(System.in);
			int reply = response.nextInt();
			if(reply==1)
				{
					execute();
				}
			else if(reply==2)
				{
					System.out.println("Alright, have a good day!");
				}
			else
				{
					System.out.println("It seems your answer was invalid, please try again.");
					redo();
				}
			}
			catch(InputMismatchException e)
			{
				System.out.println("It seems your answer was invalid, please try again.");
				redo();
			}
		}
	}