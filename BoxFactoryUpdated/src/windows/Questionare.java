package windows;

public class Questionare extends Window
{

	protected final String question;
	
	public void display()
	{
		
		System.out.println(title);
		System.out.println("");
		System.out.println(question);
		
		for (int c = 0; c < size - 4; c++)
		{
			
			System.out.println("");
			
		}
		
		System.out.print("Input: ");
		
	}
	
	public Questionare(String t, String q, int s)
	{
		
		title = t;
		question = q;
		size = s;
		
	}
	
}
