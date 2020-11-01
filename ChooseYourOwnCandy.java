import java.util.*;

public class ChooseYourOwnCandy {
	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to Choose Your Own Candy!");
		System.out.println("Press 'Enter' to display instructions.");
		sc.nextLine();
		System.out.println("Whenever you're prompted to make a choice, type the corresponding letter\n"
						 + "into the console. For example, if you're given four options (a, b, c, and d),\n"
						 + "you can type 'a', 'A', 'b', 'B', and so on.\n");
		System.out.println("Having candy gives you points; some candies are worth more than others! You\n"
						 + "want to save your candy until you get home, but you can only carry so much -\n"
						 + "you'll have to eat some candy to make room for more.\n");
		System.out.println("However, candy can also boost your stats! You have three stats: CHA (charisma),\n"
						 + "DEX (dexterity), and STR (strength). CHA and DEX are used for some skill-testing,\n"
						 + "whereas STR is used to determine how much candy you can carry. Each candy will\n"
						 + "affect your stats in some way: small candies will increase one while decreasing\n"
						 + "another, and some better candies will increase a stat significantly without any\n"
						 + "penalty!\n");
		System.out.println("Press Enter to start...");
		sc.nextLine();
		System.out.println("|--------|");
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
