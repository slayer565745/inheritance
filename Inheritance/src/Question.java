
public class Question
	{
		String line1;
		String line2;
		int answer;
		public Question(String l1, String l2, int a)
		{
			line1 = l1;
			line2 = l2;
			answer = a;
		}
		public String getLine1()
			{
				return line1;
			}
		public void setLine1(String line1)
			{
				this.line1 = line1;
			}
		public String getLine2()
			{
				return line2;
			}
		public void setLine2(String line2)
			{
				this.line2 = line2;
			}
		public int getAnswer()
			{
				return answer;
			}
		public void setAnswer(int answer)
			{
				this.answer = answer;
			}

	}
