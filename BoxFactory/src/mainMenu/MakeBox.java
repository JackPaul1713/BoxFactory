package mainMenu;

import java.util.Scanner;

import objects.Game;
import objects.Factory;
import objects.Character;

public class MakeBox
{

	public static Game makeBox(Game game) throws InterruptedException
	{
		
		//variables
		
		Factory factory = game.getFactory();
		Character character = game.getCharacter();
		
		int speed = (factory.getMakeSpeed() * 1000) / 32;
		String enterToContinue;
		
		Scanner strInput = new Scanner(System.in);
		
		//action
		
		System.out.println("\n[][][][][][][][][][][][] Making Box [][][][][][][][][][][][]");
		System.out.println("");
		System.out.println("------------------------------------------------------------");
		System.out.println("|HHHHHHHH|      ||         ||                               ");
		System.out.println("|HHHHHHHH|      ||         ||                               ");
		System.out.println("|HHHHHHHH|   ___||___   ___||___                            ");
		System.out.println("|HHHHHHHH|                                                  ");
		System.out.println("                                                            ");
		System.out.println("                                                            ");
		System.out.println("                                                            ");
		System.out.println("                                                            ");
		System.out.println("/+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+\\                     ");
		System.out.println("+X  0  0  0  0  0  0  0  0  0  0  0  X+                     ");
		System.out.println("\\+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+/                     ");
		System.out.println("|H|___|H|___|H|___|H|___|H|___|H|___|H|_____________________");
		System.out.println("                                                            ");
		System.out.print("Making Box...");
		
		Thread.sleep(speed);
		
		System.out.println("\n[][][][][][][][][][][][] Making Box [][][][][][][][][][][][]");
		System.out.println("");
		System.out.println("------------------------------------------------------------");
		System.out.println("|HHHHHHHH|      ||         ||                               ");
		System.out.println("|HHHHHHHH|      ||         ||                               ");
		System.out.println("|HHHHHHHH|   ___||___   ___||___                            ");
		System.out.println("|HHHHHHHH|                                                  ");
		System.out.println(" [][][][]                                                   ");
		System.out.println("                                                            ");
		System.out.println("                                                            ");
		System.out.println("                                                            ");
		System.out.println("/+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+\\                     ");
		System.out.println("+X  0  0  0  0  0  0  0  0  0  0  0  X+                     ");
		System.out.println("\\+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+/                     ");
		System.out.println("|H|___|H|___|H|___|H|___|H|___|H|___|H|_____________________");
		System.out.println("                                                            ");
		System.out.print("Making Box...");
		
		Thread.sleep(speed);
		
		System.out.println("\n[][][][][][][][][][][][] Making Box [][][][][][][][][][][][]");
		System.out.println("");
		System.out.println("------------------------------------------------------------");
		System.out.println("|HHHHHHHH|      ||         ||                               ");
		System.out.println("|HHHHHHHH|      ||         ||                               ");
		System.out.println("|HHHHHHHH|   ___||___   ___||___                            ");
		System.out.println("|HHHHHHHH|                                                  ");
		System.out.println(" [][][][]                                                   ");
		System.out.println(" [][][][]                                                   ");
		System.out.println("                                                            ");
		System.out.println("                                                            ");
		System.out.println("/+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+\\                     ");
		System.out.println("+X  0  0  0  0  0  0  0  0  0  0  0  X+                     ");
		System.out.println("\\+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+/                     ");
		System.out.println("|H|___|H|___|H|___|H|___|H|___|H|___|H|_____________________");
		System.out.println("                                                            ");
		System.out.print("Making Box...");
		
		Thread.sleep(speed);
		
		System.out.println("\n[][][][][][][][][][][][] Making Box [][][][][][][][][][][][]");
		System.out.println("");
		System.out.println("------------------------------------------------------------");
		System.out.println("|HHHHHHHH|      ||         ||                               ");
		System.out.println("|HHHHHHHH|      ||         ||                               ");
		System.out.println("|HHHHHHHH|   ___||___   ___||___                            ");
		System.out.println("|HHHHHHHH|                                                  ");
		System.out.println(" [][][][]                                                   ");
		System.out.println(" [][][][]                                                   ");
		System.out.println(" [][][][]                                                   ");
		System.out.println("                                                            ");
		System.out.println("/+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+\\                     ");
		System.out.println("+X  0  0  0  0  0  0  0  0  0  0  0  X+                     ");
		System.out.println("\\+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+/                     ");
		System.out.println("|H|___|H|___|H|___|H|___|H|___|H|___|H|_____________________");
		System.out.println("                                                            ");
		System.out.print("Making Box...");
		
		Thread.sleep(speed);
		
		System.out.println("\n[][][][][][][][][][][][] Making Box [][][][][][][][][][][][]");
		System.out.println("");
		System.out.println("------------------------------------------------------------");
		System.out.println("|HHHHHHHH|      ||         ||                               ");
		System.out.println("|HHHHHHHH|      ||         ||                               ");
		System.out.println("|HHHHHHHH|   ___||___   ___||___                            ");
		System.out.println("|HHHHHHHH|                                                  ");
		System.out.println("                                                            ");
		System.out.println(" [][][][]                                                   ");
		System.out.println(" [][][][]                                                   ");
		System.out.println(" [][][][]                                                   ");
		System.out.println("/+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+\\                     ");
		System.out.println("+X  0  0  0  0  0  0  0  0  0  0  0  X+                     ");
		System.out.println("\\+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+/                     ");
		System.out.println("|H|___|H|___|H|___|H|___|H|___|H|___|H|_____________________");
		System.out.println("                                                            ");
		System.out.print("Making Box...");
		
		Thread.sleep(speed);
		
		System.out.println("\n[][][][][][][][][][][][] Making Box [][][][][][][][][][][][]");
		System.out.println("");
		System.out.println("------------------------------------------------------------");
		System.out.println("|HHHHHHHH|      ||         ||                               ");
		System.out.println("|HHHHHHHH|      ||         ||                               ");
		System.out.println("|HHHHHHHH|   ___||___   ___||___                            ");
		System.out.println("|HHHHHHHH|                                                  ");
		System.out.println("                                                            ");
		System.out.println("   [][][][]                                                 ");
		System.out.println("   [][][][]                                                 ");
		System.out.println("   [][][][]                                                 ");
		System.out.println("/-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-\\                     ");
		System.out.println("|+  0  0  0  0  0  0  0  0  0  0  0  +|                     ");
		System.out.println("\\-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-/                     ");
		System.out.println("|H|___|H|___|H|___|H|___|H|___|H|___|H|_____________________");
		System.out.println("                                                            ");
		System.out.print("Making Box...");
		
		Thread.sleep(speed);
		
		System.out.println("\n[][][][][][][][][][][][] Making Box [][][][][][][][][][][][]");
		System.out.println("");
		System.out.println("------------------------------------------------------------");
		System.out.println("|HHHHHHHH|      ||         ||                               ");
		System.out.println("|HHHHHHHH|      ||         ||                               ");
		System.out.println("|HHHHHHHH|   ___||___   ___||___                            ");
		System.out.println("|HHHHHHHH|                                                  ");
		System.out.println("                                                            ");
		System.out.println("     [][][][]                                               ");
		System.out.println("     [][][][]                                               ");
		System.out.println("     [][][][]                                               ");
		System.out.println("/+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+\\                     ");
		System.out.println("+X  0  0  0  0  0  0  0  0  0  0  0  X+                     ");
		System.out.println("\\+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+/                     ");
		System.out.println("|H|___|H|___|H|___|H|___|H|___|H|___|H|_____________________");
		System.out.println("                                                            ");
		System.out.print("Making Box...");
		
		Thread.sleep(speed);
		
		System.out.println("\n[][][][][][][][][][][][] Making Box [][][][][][][][][][][][]");
		System.out.println("");
		System.out.println("------------------------------------------------------------");
		System.out.println("|HHHHHHHH|      ||         ||                               ");
		System.out.println("|HHHHHHHH|      ||         ||                               ");
		System.out.println("|HHHHHHHH|   ___||___   ___||___                            ");
		System.out.println("|HHHHHHHH|                                                  ");
		System.out.println("                                                            ");
		System.out.println("       [][][][]                                             ");
		System.out.println("       [][][][]                                             ");
		System.out.println("       [][][][]                                             ");
		System.out.println("/-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-\\                     ");
		System.out.println("|+  0  0  0  0  0  0  0  0  0  0  0  +|                     ");
		System.out.println("\\-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-/                     ");
		System.out.println("|H|___|H|___|H|___|H|___|H|___|H|___|H|_____________________");
		System.out.println("                                                            ");
		System.out.print("Making Box...");
		
		Thread.sleep(speed);
		
		System.out.println("\n[][][][][][][][][][][][] Making Box [][][][][][][][][][][][]");
		System.out.println("");
		System.out.println("------------------------------------------------------------");
		System.out.println("|HHHHHHHH|      ||         ||                               ");
		System.out.println("|HHHHHHHH|      ||         ||                               ");
		System.out.println("|HHHHHHHH|   ___||___   ___||___                            ");
		System.out.println("|HHHHHHHH|                                                  ");
		System.out.println("                                                            ");
		System.out.println("         [][][][]                                           ");
		System.out.println("         [][][][]                                           ");
		System.out.println("         [][][][]                                           ");
		System.out.println("/+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+\\                     ");
		System.out.println("+X  0  0  0  0  0  0  0  0  0  0  0  X+                     ");
		System.out.println("\\+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+/                     ");
		System.out.println("|H|___|H|___|H|___|H|___|H|___|H|___|H|_____________________");
		System.out.println("                                                            ");
		System.out.print("Making Box...");
		
		Thread.sleep(speed);
		
		System.out.println("\n[][][][][][][][][][][][] Making Box [][][][][][][][][][][][]");
		System.out.println("");
		System.out.println("------------------------------------------------------------");
		System.out.println("|HHHHHHHH|      ||         ||                               ");
		System.out.println("|HHHHHHHH|      ||         ||                               ");
		System.out.println("|HHHHHHHH|   ___||___   ___||___                            ");
		System.out.println("|HHHHHHHH|                                                  ");
		System.out.println("                                                            ");
		System.out.println("           [][][][]                                         ");
		System.out.println("           [][][][]                                         ");
		System.out.println("           [][][][]                                         ");
		System.out.println("/-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-\\                     ");
		System.out.println("|+  0  0  0  0  0  0  0  0  0  0  0  +|                     ");
		System.out.println("\\-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-/                     ");
		System.out.println("|H|___|H|___|H|___|H|___|H|___|H|___|H|_____________________");
		System.out.println("                                                            ");
		System.out.print("Making Box...");
		
		Thread.sleep(speed);
		
		System.out.println("\n[][][][][][][][][][][][] Making Box [][][][][][][][][][][][]");
		System.out.println("");
		System.out.println("------------------------------------------------------------");
		System.out.println("|HHHHHHHH|      ||         ||                               ");
		System.out.println("|HHHHHHHH|      ||         ||                               ");
		System.out.println("|HHHHHHHH|   ___||___   ___||___                            ");
		System.out.println("|HHHHHHHH|                                                  ");
		System.out.println("                                                            ");
		System.out.println("             [][][][]                                       ");
		System.out.println("             [][][][]                                       ");
		System.out.println("             [][][][]                                       ");
		System.out.println("/+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+\\                     ");
		System.out.println("+X  0  0  0  0  0  0  0  0  0  0  0  X+                     ");
		System.out.println("\\+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+/                     ");
		System.out.println("|H|___|H|___|H|___|H|___|H|___|H|___|H|_____________________");
		System.out.println("                                                            ");
		System.out.print("Making Box...");
		
		Thread.sleep(speed);
		
		System.out.println("\n[][][][][][][][][][][][] Making Box [][][][][][][][][][][][]");
		System.out.println("");
		System.out.println("------------------------------------------------------------");
		System.out.println("|HHHHHHHH|      ||         ||                               ");
		System.out.println("|HHHHHHHH|      ||         ||                               ");
		System.out.println("|HHHHHHHH|      ||      ___||___                            ");
		System.out.println("|HHHHHHHH|   ___||___                                       ");
		System.out.println("                                                            ");
		System.out.println("             [][][][]                                       ");
		System.out.println("             [][][][]                                       ");
		System.out.println("             [][][][]                                       ");
		System.out.println("/+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+\\                     ");
		System.out.println("+X  0  0  0  0  0  0  0  0  0  0  0  X+                     ");
		System.out.println("\\+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+/                     ");
		System.out.println("|H|___|H|___|H|___|H|___|H|___|H|___|H|_____________________");
		System.out.println("                                                            ");
		System.out.print("Making Box...");
		
		Thread.sleep(speed);
		
		System.out.println("\n[][][][][][][][][][][][] Making Box [][][][][][][][][][][][]");
		System.out.println("");
		System.out.println("------------------------------------------------------------");
		System.out.println("|HHHHHHHH|      ||         ||                               ");
		System.out.println("|HHHHHHHH|      ||         ||                               ");
		System.out.println("|HHHHHHHH|      ||      ___||___                            ");
		System.out.println("|HHHHHHHH|      ||                                          ");
		System.out.println("             ___||___                                       ");
		System.out.println("             [][][][]                                       ");
		System.out.println("             [][][][]                                       ");
		System.out.println("             [][][][]                                       ");
		System.out.println("/+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+\\                     ");
		System.out.println("+X  0  0  0  0  0  0  0  0  0  0  0  X+                     ");
		System.out.println("\\+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+/                     ");
		System.out.println("|H|___|H|___|H|___|H|___|H|___|H|___|H|_____________________");
		System.out.println("                                                            ");
		System.out.print("Making Box...");
		
		Thread.sleep(speed);
		
		System.out.println("\n[][][][][][][][][][][][] Making Box [][][][][][][][][][][][]");
		System.out.println("");
		System.out.println("------------------------------------------------------------");
		System.out.println("|HHHHHHHH|      ||         ||                               ");
		System.out.println("|HHHHHHHH|      ||         ||                               ");
		System.out.println("|HHHHHHHH|      ||      ___||___                            ");
		System.out.println("|HHHHHHHH|   ___||___                                       ");
		System.out.println("                                                            ");
		System.out.println("             [][][][]                                       ");
		System.out.println("             [][][][]                                       ");
		System.out.println("             [][][][]                                       ");
		System.out.println("/+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+\\                     ");
		System.out.println("+X  0  0  0  0  0  0  0  0  0  0  0  X+                     ");
		System.out.println("\\+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+/                     ");
		System.out.println("|H|___|H|___|H|___|H|___|H|___|H|___|H|_____________________");
		System.out.println("                                                            ");
		System.out.print("Making Box...");
		
		Thread.sleep(speed);
		
		System.out.println("\n[][][][][][][][][][][][] Making Box [][][][][][][][][][][][]");
		System.out.println("");
		System.out.println("------------------------------------------------------------");
		System.out.println("|HHHHHHHH|      ||         ||                               ");
		System.out.println("|HHHHHHHH|      ||         ||                               ");
		System.out.println("|HHHHHHHH|   ___||___   ___||___                            ");
		System.out.println("|HHHHHHHH|                                                  ");
		System.out.println("                                                            ");
		System.out.println("               [][][][]                                     ");
		System.out.println("               [][][][]                                     ");
		System.out.println("               [][][][]                                     ");
		System.out.println("/-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-\\                     ");
		System.out.println("|+  0  0  0  0  0  0  0  0  0  0  0  +|                     ");
		System.out.println("\\-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-/                     ");
		System.out.println("|H|___|H|___|H|___|H|___|H|___|H|___|H|_____________________");
		System.out.println("                                                            ");
		System.out.print("Making Box...");
		
		Thread.sleep(speed);
		
		System.out.println("\n[][][][][][][][][][][][] Making Box [][][][][][][][][][][][]");
		System.out.println("");
		System.out.println("------------------------------------------------------------");
		System.out.println("|HHHHHHHH|      ||         ||                               ");
		System.out.println("|HHHHHHHH|      ||         ||                               ");
		System.out.println("|HHHHHHHH|   ___||___   ___||___                            ");
		System.out.println("|HHHHHHHH|                                                  ");
		System.out.println("                                                            ");
		System.out.println("                 [][][][]                                   ");
		System.out.println("                 [][][][]                                   ");
		System.out.println("                 [][][][]                                   ");
		System.out.println("/+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+\\                     ");
		System.out.println("+X  0  0  0  0  0  0  0  0  0  0  0  X+                     ");
		System.out.println("\\+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+/                     ");
		System.out.println("|H|___|H|___|H|___|H|___|H|___|H|___|H|_____________________");
		System.out.println("                                                            ");
		System.out.print("Making Box...");
		
		Thread.sleep(speed);
		
		System.out.println("\n[][][][][][][][][][][][] Making Box [][][][][][][][][][][][]");
		System.out.println("");
		System.out.println("------------------------------------------------------------");
		System.out.println("|HHHHHHHH|      ||         ||                               ");
		System.out.println("|HHHHHHHH|      ||         ||                               ");
		System.out.println("|HHHHHHHH|   ___||___   ___||___                            ");
		System.out.println("|HHHHHHHH|                                                  ");
		System.out.println("                                                            ");
		System.out.println("                   [][][][]                                 ");
		System.out.println("                   [][][][]                                 ");
		System.out.println("                   [][][][]                                 ");
		System.out.println("/-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-\\                     ");
		System.out.println("|+  0  0  0  0  0  0  0  0  0  0  0  +|                     ");
		System.out.println("\\-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-/                     ");
		System.out.println("|H|___|H|___|H|___|H|___|H|___|H|___|H|_____________________");
		System.out.println("                                                            ");
		System.out.print("Making Box...");
		
		Thread.sleep(speed);
		
		System.out.println("\n[][][][][][][][][][][][] Making Box [][][][][][][][][][][][]");
		System.out.println("");
		System.out.println("------------------------------------------------------------");
		System.out.println("|HHHHHHHH|      ||         ||                               ");
		System.out.println("|HHHHHHHH|      ||         ||                               ");
		System.out.println("|HHHHHHHH|   ___||___   ___||___                            ");
		System.out.println("|HHHHHHHH|                                                  ");
		System.out.println("                                                            ");
		System.out.println("                     [][][][]                               ");
		System.out.println("                     [][][][]                               ");
		System.out.println("                     [][][][]                               ");
		System.out.println("/+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+\\                     ");
		System.out.println("+X  0  0  0  0  0  0  0  0  0  0  0  X+                     ");
		System.out.println("\\+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+/                     ");
		System.out.println("|H|___|H|___|H|___|H|___|H|___|H|___|H|_____________________");
		System.out.println("                                                            ");
		System.out.print("Making Box...");
		
		Thread.sleep(speed);
		
		System.out.println("\n[][][][][][][][][][][][] Making Box [][][][][][][][][][][][]");
		System.out.println("");
		System.out.println("------------------------------------------------------------");
		System.out.println("|HHHHHHHH|      ||         ||                               ");
		System.out.println("|HHHHHHHH|      ||         ||                               ");
		System.out.println("|HHHHHHHH|   ___||___   ___||___                            ");
		System.out.println("|HHHHHHHH|                                                  ");
		System.out.println("                                                            ");
		System.out.println("                       [][][][]                             ");
		System.out.println("                       [][][][]                             ");
		System.out.println("                       [][][][]                             ");
		System.out.println("/-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-\\                     ");
		System.out.println("|+  0  0  0  0  0  0  0  0  0  0  0  +|                     ");
		System.out.println("\\-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-/                     ");
		System.out.println("|H|___|H|___|H|___|H|___|H|___|H|___|H|_____________________");
		System.out.println("                                                            ");
		System.out.print("Making Box...");
		
		Thread.sleep(speed);
		
		System.out.println("\n[][][][][][][][][][][][] Making Box [][][][][][][][][][][][]");
		System.out.println("");
		System.out.println("------------------------------------------------------------");
		System.out.println("|HHHHHHHH|      ||         ||                               ");
		System.out.println("|HHHHHHHH|      ||         ||                               ");
		System.out.println("|HHHHHHHH|   ___||___      ||                               ");
		System.out.println("|HHHHHHHH|              ___||___                            ");
		System.out.println("                                                            ");
		System.out.println("                       [][][][]                             ");
		System.out.println("                       [][][][]                             ");
		System.out.println("                       [][][][]                             ");
		System.out.println("/-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-\\                     ");
		System.out.println("|+  0  0  0  0  0  0  0  0  0  0  0  +|                     ");
		System.out.println("\\-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-/                     ");
		System.out.println("|H|___|H|___|H|___|H|___|H|___|H|___|H|_____________________");
		System.out.println("                                                            ");
		System.out.print("Making Box...");
		
		Thread.sleep(speed);
		
		System.out.println("\n[][][][][][][][][][][][] Making Box [][][][][][][][][][][][]");
		System.out.println("");
		System.out.println("------------------------------------------------------------");
		System.out.println("|HHHHHHHH|      ||         ||                               ");
		System.out.println("|HHHHHHHH|      ||         ||                               ");
		System.out.println("|HHHHHHHH|   ___||___      ||                               ");
		System.out.println("|HHHHHHHH|                 ||                               ");
		System.out.println("                        ___||___                            ");
		System.out.println("                       [][][][]                             ");
		System.out.println("                       [][][][]                             ");
		System.out.println("                       [][][][]                             ");
		System.out.println("/-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-\\                    ");
		System.out.println("|+  0  0  0  0  0  0  0  0  0  0  0  +|                     ");
		System.out.println("\\-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-/                     ");
		System.out.println("|H|___|H|___|H|___|H|___|H|___|H|___|H|_____________________");
		System.out.println("                                                            ");
		System.out.print("Making Box...");
		
		Thread.sleep(speed);
		
		System.out.println("\n[][][][][][][][][][][][] Making Box [][][][][][][][][][][][]");
		System.out.println("");
		System.out.println("------------------------------------------------------------");
		System.out.println("|HHHHHHHH|      ||         ||                               ");
		System.out.println("|HHHHHHHH|      ||         ||                               ");
		System.out.println("|HHHHHHHH|   ___||___      ||                               ");
		System.out.println("|HHHHHHHH|              ___||___                            ");
		System.out.println("                                                            ");
		System.out.println("                       [][][][]                             ");
		System.out.println("                       [][][][]                             ");
		System.out.println("                       [][][][]                             ");
		System.out.println("/-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-\\                     ");
		System.out.println("|+  0  0  0  0  0  0  0  0  0  0  0  +|                     ");
		System.out.println("\\-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-/                     ");
		System.out.println("|H|___|H|___|H|___|H|___|H|___|H|___|H|_____________________");
		System.out.println("                                                            ");
		System.out.print("Making Box...");
		
		Thread.sleep(speed);
		
		System.out.println("\n[][][][][][][][][][][][] Making Box [][][][][][][][][][][][]");
		System.out.println("");
		System.out.println("------------------------------------------------------------");
		System.out.println("|HHHHHHHH|      ||         ||                               ");
		System.out.println("|HHHHHHHH|      ||         ||                               ");
		System.out.println("|HHHHHHHH|   ___||___   ___||___                            ");
		System.out.println("|HHHHHHHH|                                                  ");
		System.out.println("                                                            ");
		System.out.println("                         [][][][]                           ");
		System.out.println("                         [][][][]                           ");
		System.out.println("                         [][][][]                           ");
		System.out.println("/+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+\\                     ");
		System.out.println("+X  0  0  0  0  0  0  0  0  0  0  0  X+                     ");
		System.out.println("\\+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+/                     ");
		System.out.println("|H|___|H|___|H|___|H|___|H|___|H|___|H|_____________________");
		System.out.println("                                                            ");
		System.out.print("Making Box...");
		
		Thread.sleep(speed);
		
		System.out.println("\n[][][][][][][][][][][][] Making Box [][][][][][][][][][][][]");
		System.out.println("");
		System.out.println("------------------------------------------------------------");
		System.out.println("|HHHHHHHH|      ||         ||                               ");
		System.out.println("|HHHHHHHH|      ||         ||                               ");
		System.out.println("|HHHHHHHH|   ___||___   ___||___                            ");
		System.out.println("|HHHHHHHH|                                                  ");
		System.out.println("                                                            ");
		System.out.println("                           [][][][]                         ");
		System.out.println("                           [][][][]                         ");
		System.out.println("                           [][][][]                         ");
		System.out.println("/-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-\\                     ");
		System.out.println("|+  0  0  0  0  0  0  0  0  0  0  0  +|                     ");
		System.out.println("\\-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-/                     ");
		System.out.println("|H|___|H|___|H|___|H|___|H|___|H|___|H|_____________________");
		System.out.println("                                                            ");
		System.out.print("Making Box...");
		
		Thread.sleep(speed);
		
		System.out.println("\n[][][][][][][][][][][][] Making Box [][][][][][][][][][][][]");
		System.out.println("");
		System.out.println("------------------------------------------------------------");
		System.out.println("|HHHHHHHH|      ||         ||                               ");
		System.out.println("|HHHHHHHH|      ||         ||                               ");
		System.out.println("|HHHHHHHH|   ___||___   ___||___                            ");
		System.out.println("|HHHHHHHH|                                                  ");
		System.out.println("                                                            ");
		System.out.println("                             [][][][]                       ");
		System.out.println("                             [][][][]                       ");
		System.out.println("                             [][][][]                       ");
		System.out.println("/+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+\\                     ");
		System.out.println("+X  0  0  0  0  0  0  0  0  0  0  0  X+                     ");
		System.out.println("\\+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+/                     ");
		System.out.println("|H|___|H|___|H|___|H|___|H|___|H|___|H|_____________________");
		System.out.println("                                                            ");
		System.out.print("Making Box...");
		
		Thread.sleep(speed);
		
		System.out.println("\n[][][][][][][][][][][][] Making Box [][][][][][][][][][][][]");
		System.out.println("");
		System.out.println("------------------------------------------------------------");
		System.out.println("|HHHHHHHH|      ||         ||                               ");
		System.out.println("|HHHHHHHH|      ||         ||                               ");
		System.out.println("|HHHHHHHH|   ___||___   ___||___                            ");
		System.out.println("|HHHHHHHH|                                                  ");
		System.out.println("                                                            ");
		System.out.println("                               [][][][]                     ");
		System.out.println("                               [][][][]                     ");
		System.out.println("                               [][][][]                     ");
		System.out.println("/-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-\\                     ");
		System.out.println("|+  0  0  0  0  0  0  0  0  0  0  0  +|                     ");
		System.out.println("\\-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-/                     ");
		System.out.println("|H|___|H|___|H|___|H|___|H|___|H|___|H|_____________________");
		System.out.println("                                                            ");
		System.out.print("Making Box...");
		
		Thread.sleep(speed);
		
		System.out.println("\n[][][][][][][][][][][][] Making Box [][][][][][][][][][][][]");
		System.out.println("");
		System.out.println("------------------------------------------------------------");
		System.out.println("|HHHHHHHH|      ||         ||                               ");
		System.out.println("|HHHHHHHH|      ||         ||                               ");
		System.out.println("|HHHHHHHH|   ___||___   ___||___                            ");
		System.out.println("|HHHHHHHH|                                                  ");
		System.out.println("                                                            ");
		System.out.println("                                 [][][][]                   ");
		System.out.println("                                 [][][][]                   ");
		System.out.println("                                 [][][][]                   ");
		System.out.println("/+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+\\                     ");
		System.out.println("+X  0  0  0  0  0  0  0  0  0  0  0  X+                     ");
		System.out.println("\\+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+/                     ");
		System.out.println("|H|___|H|___|H|___|H|___|H|___|H|___|H|_____________________");
		System.out.println("                                                            ");
		System.out.print("Making Box...");
		
		Thread.sleep(speed);
		
		System.out.println("\n[][][][][][][][][][][][] Making Box [][][][][][][][][][][][]");
		System.out.println("");
		System.out.println("------------------------------------------------------------");
		System.out.println("|HHHHHHHH|      ||         ||                               ");
		System.out.println("|HHHHHHHH|      ||         ||                               ");
		System.out.println("|HHHHHHHH|   ___||___   ___||___                            ");
		System.out.println("|HHHHHHHH|                                                  ");
		System.out.println("                                                            ");
		System.out.println("                                   [][][][]                 ");
		System.out.println("                                   [][][][]                 ");
		System.out.println("                                   [][][][]                 ");
		System.out.println("/-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-\\                     ");
		System.out.println("|+  0  0  0  0  0  0  0  0  0  0  0  +|                     ");
		System.out.println("\\-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-/                     ");
		System.out.println("|H|___|H|___|H|___|H|___|H|___|H|___|H|_____________________");
		System.out.println("                                                            ");
		System.out.print("Making Box...");
		
		Thread.sleep(speed);
		
		System.out.println("\n[][][][][][][][][][][][] Making Box [][][][][][][][][][][][]");
		System.out.println("");
		System.out.println("------------------------------------------------------------");
		System.out.println("|HHHHHHHH|      ||         ||                               ");
		System.out.println("|HHHHHHHH|      ||         ||                               ");
		System.out.println("|HHHHHHHH|   ___||___   ___||___                            ");
		System.out.println("|HHHHHHHH|                                                  ");
		System.out.println("                                                            ");
		System.out.println("                                     [][][][]               ");
		System.out.println("                                     [][][][]               ");
		System.out.println("                                     [][][][]               ");
		System.out.println("/+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+\\                     ");
		System.out.println("+X  0  0  0  0  0  0  0  0  0  0  0  X+                     ");
		System.out.println("\\+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+/                     ");
		System.out.println("|H|___|H|___|H|___|H|___|H|___|H|___|H|_____________________");
		System.out.println("                                                            ");
		System.out.print("Making Box...");
		
		Thread.sleep(speed);
		
		System.out.println("\n[][][][][][][][][][][][] Making Box [][][][][][][][][][][][]");
		System.out.println("");
		System.out.println("------------------------------------------------------------");
		System.out.println("|HHHHHHHH|      ||         ||                               ");
		System.out.println("|HHHHHHHH|      ||         ||                               ");
		System.out.println("|HHHHHHHH|   ___||___   ___||___                            ");
		System.out.println("|HHHHHHHH|                                                  ");
		System.out.println("                                                            ");
		System.out.println("                                                            ");
		System.out.println("                                       [][][][]             ");
		System.out.println("                                       [][][][]             ");
		System.out.println("/-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-\\[][][][]             ");
		System.out.println("|+  0  0  0  0  0  0  0  0  0  0  0  +|                     ");
		System.out.println("\\-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-/                     ");
		System.out.println("|H|___|H|___|H|___|H|___|H|___|H|___|H|_____________________");
		System.out.println("                                                            ");
		System.out.print("Making Box...");
		
		Thread.sleep(speed);
		
		System.out.println("\n[][][][][][][][][][][][] Making Box [][][][][][][][][][][][]");
		System.out.println("");
		System.out.println("------------------------------------------------------------");
		System.out.println("|HHHHHHHH|      ||         ||                               ");
		System.out.println("|HHHHHHHH|      ||         ||                               ");
		System.out.println("|HHHHHHHH|   ___||___   ___||___                            ");
		System.out.println("|HHHHHHHH|                                                  ");
		System.out.println("                                                            ");
		System.out.println("                                                            ");
		System.out.println("                                                            ");
		System.out.println("                                         [][][][]           ");
		System.out.println("/+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+\\  [][][][]           ");
		System.out.println("+X  0  0  0  0  0  0  0  0  0  0  0  X+  [][][][]           ");
		System.out.println("\\+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+/                     ");
		System.out.println("|H|___|H|___|H|___|H|___|H|___|H|___|H|_____________________");
		System.out.println("                                                            ");
		System.out.print("Making Box...");
		
		Thread.sleep(speed);
		
		System.out.println("\n[][][][][][][][][][][][] Making Box [][][][][][][][][][][][]");
		System.out.println("");
		System.out.println("------------------------------------------------------------");
		System.out.println("|HHHHHHHH|      ||         ||                               ");
		System.out.println("|HHHHHHHH|      ||         ||                               ");
		System.out.println("|HHHHHHHH|   ___||___   ___||___                            ");
		System.out.println("|HHHHHHHH|                                                  ");
		System.out.println("                                                            ");
		System.out.println("                                                            ");
		System.out.println("                                                            ");
		System.out.println("                                                            ");
		System.out.println("/+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+\\    [][][][]         ");
		System.out.println("+X  0  0  0  0  0  0  0  0  0  0  0  X+    [][][][]         ");
		System.out.println("\\+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+/    [][][][]         ");
		System.out.println("|H|___|H|___|H|___|H|___|H|___|H|___|H|_____________________");
		System.out.println("                                                            ");
		System.out.print("Making Box...");
		
		Thread.sleep(speed);
		
		System.out.println("\n[][][][][][][][][][][][] Making Box [][][][][][][][][][][][]");
		System.out.println("");
		System.out.println("------------------------------------------------------------");
		System.out.println("|HHHHHHHH|      ||         ||                               ");
		System.out.println("|HHHHHHHH|      ||         ||                               ");
		System.out.println("|HHHHHHHH|   ___||___   ___||___                            ");
		System.out.println("|HHHHHHHH|                                                  ");
		System.out.println("                                                            ");
		System.out.println("                                                            ");
		System.out.println("                                                            ");
		System.out.println("                                                            ");
		System.out.println("/+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+\\                     ");
		System.out.println("+X  0  0  0  0  0  0  0  0  0  0  0  X+      [][][][]       ");
		System.out.println("\\+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+/      [][][][]       ");
		System.out.println("|H|___|H|___|H|___|H|___|H|___|H|___|H|______[][][][]_______");
		System.out.println("                                                            ");
		System.out.print("Making Box...");
		
		Thread.sleep(speed);
		
		System.out.println("\n[][][][][][][][][][][][] Making Box [][][][][][][][][][][][]");
		System.out.println("");
		System.out.println("------------------------------------------------------------");
		System.out.println("|HHHHHHHH|      ||         ||                               ");
		System.out.println("|HHHHHHHH|      ||         ||                               ");
		System.out.println("|HHHHHHHH|   ___||___   ___||___                            ");
		System.out.println("|HHHHHHHH|                                                  ");
		System.out.println("                                                            ");
		System.out.println("                                                            ");
		System.out.println("                                                            ");
		System.out.println("                                                            ");
		System.out.println("/+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+\\                     ");
		System.out.println("+X  0  0  0  0  0  0  0  0  0  0  0  X+      [][][][]       ");
		System.out.println("\\+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+/      [][][][]       ");
		System.out.println("|H|___|H|___|H|___|H|___|H|___|H|___|H|______[][][][]_______");
		System.out.println("                                                            ");
		System.out.print("Box Made! Press enter to continue.");
		
		factory.setNumbOfBoxes(factory.getNumbOfBoxes() + factory.getNumbOfBoxesMade());
		
		enterToContinue = strInput.nextLine();
		
		//return
		
		game.setFactory(factory);
		game.setCharacter(character);
		
		return(game);
		
	}
	
}
