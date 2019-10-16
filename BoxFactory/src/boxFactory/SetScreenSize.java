package boxFactory;

import java.util.Scanner;

public class SetScreenSize
{

	public static void setScreenSize()
	{
	
		//variables
		
		int rows = 17;
		int cols = 30;
		String defaltPixel = "  ";
		String boarderPixel = "[]";
		String enterToContinue;
		
		String[][] setScreen = new String[rows][cols];
		
		Scanner blankInput = new Scanner(System.in);
		
		//action
		
		for (int r = 0; r < rows; r++)
		{
			for (int c = 0; c < cols; c++)
			{
			
				setScreen [r][c] = defaltPixel;
				
			}
		}
		
		setScreen [0][0] = boarderPixel;
		setScreen [1][0] = boarderPixel;
		setScreen [0][1] = boarderPixel;
		setScreen [0][cols - 1] = boarderPixel;
		setScreen [1][cols - 1] = boarderPixel;
		setScreen [0][cols - 2] = boarderPixel;
		setScreen [rows - 1][0] = boarderPixel;
		setScreen [rows - 2][0] = boarderPixel;
		setScreen [rows - 1][1] = boarderPixel;
		setScreen [rows - 1][cols - 1] = boarderPixel;
		setScreen [rows - 2][cols - 1] = boarderPixel;
		setScreen [rows - 1][cols - 2] = boarderPixel;
		
		for (int r = 0; r < rows; r++)
		{
			
			for (int c = 0; c < cols; c++)
			{
			
				System.out.print(setScreen [r][c]);
				
			}
			
			System.out.print("\n");
			
		}
		
		System.out.println("\nThis program requires a specific consol window size.");
		System.out.println("Please ajust the consol window size so that the displayed corners above fill the screen.");
		System.out.print("\nAfterwards press enter to continue.");
		enterToContinue = blankInput.nextLine();
		
	}
	
}
