package main;

import java.io.IOException;

public class ChooseYourOwnCandy {
	public static void main(String[] args) throws IOException
	{
		Game g = new Game();
		int ending = g.play();
		if(ending == 3)
			g = new Game();
		else
		{
			for(int i = 0; i < 50; i++)
				System.out.println();
			if(ending == 0) { System.out.print("TRUE END"); }
			if(ending == 1) { System.out.print("LAME END"); }
		}
	}
}
