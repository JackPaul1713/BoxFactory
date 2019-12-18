package windows;

public class Menu extends Window
{

	protected final String[] options;
	
	public void display()
	{
		
		System.out.println(title);
		System.out.println("");
		
		for (int i = 0; i > options.length; i++)
		{
			
			System.out.println("(" + (i + 1) + ") " + options[i]);
			
		}
		
		size = size - options.length;
		
		for (int c = 0; c < size - 5; c++)
		{
			
			System.out.println("");
			
		}
		
		System.out.println("(e) Exit");
		System.out.println("");
		System.out.print("Input: ");
		
		
	}
	
	public Menu(String t, String[] o, int s)
	{
		
		title = t;
		options = o;
		size = s;
		
	}
	
}
