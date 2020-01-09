package windows;

public class Textbox extends Window
{

	protected final String[] text;
	
	public void display()
	{
		
		System.out.println(title);
		System.out.println("");
		
		for (int i = 0; i < text.length; i++)
		{
			
			System.out.println("(" + (i + 1) + ") " + text[i]);
			
		}
		
		size = size - text.length;
		
		for (int c = 0; c < size - 5; c++)
		{
			
			System.out.println("");
			
		}
		
		System.out.println("");
		System.out.print("Press enter to continue.");
		
	}
	
	public Textbox(String t, String[] x, int s)
	{
		
		title = t;
		text = x;
		size = s;
		
	}
	
}
