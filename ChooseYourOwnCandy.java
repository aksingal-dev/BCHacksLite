

public class ChooseYourOwnCandy {
	public static void main(String[] args)
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
			if(ending == 2) {
				System.out.println("You unwrap the mint and pop it into your mouth. Almost as soon as it\n"
							   	 + "begins to dissolve, you start feeling woozy and your vision blurs.\n"
							   	 + "The thought that you have just made a H U G E mistake rushes through\n"
							   	 + "your head, but barely lasts a second before your vision goes bla\n"
							   	 + "Exception in thread \"main\" java.lang.NullPointerException\n"
							   	 + "        at Halloween.main(Halloween.java:12)\n\n\n\n"); }
		}
	}
}
