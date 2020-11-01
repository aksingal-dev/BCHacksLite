
import java.util.*;

public class Game {
	private StoryTree tree;
	private Player p;
	
	@SuppressWarnings("resource")
	public Game() {
		// start game; easier to do this part here than put this as part of initializeTree().
		
		System.out.println("You yawn as you stretch, and having woken up from your nap just as\n"
						 + "your alarm starts to go off. It’s finally October 31st - Halloween!\n"
						 + "You’ve been waiting for this day since... well, since last Halloween.\n"
						 + "This year is sure to be the best. It’s 5pm, so it’s time to pick out your\n"
						 + "costume and head out! But, what to be? You’ve managed to narrow it down to four options,\n"
						 + "but they’re all so good! What should you be?");
		System.out.println("a: A pumpkin\nb: A dinosaur\nc: A blue Flayola crayon\nd: A banana");
		Scanner sc = new Scanner(System.in);
		boolean valid;
		String s;
		do {
			s = sc.next().toLowerCase();
			valid = s.equals("a") || s.equals("b") || s.equals("c") || s.equals("d");
			if(!valid)
				System.out.println("I'm sorry, I didn't understand that.");
		} while(!valid);
		
		if(s.equals("a"));
			p = new Player("pumpkin");
		if(s.equals("b"))
			p = new Player("dinosaur");
		if(s.equals("c"))
			p = new Player("blue Flayola crayon");
		if(s.equals("d"))
			p = new Player("banana");
		
		tree = new StoryTree(p);
	}
	
	public int play()
	{
		/* Return integer based on ending:
		 * 0 for "True" ending;
		 * 1 for "Lame" ending;
		 * 2 for "Mint" / "Null" ending;
		 * 3 for "Loop" ending.
		 */
		StoryNode node = tree.getRoot();
		while(node != null)
		{
			if(node.output().equals("0") || node.output().equals("1") || node.output().equals("2") || node.output().equals("3"))
				return Integer.parseInt(node.output());
			if(node instanceof Skillcheck)
			{
				Skillcheck sc = (Skillcheck) node;
				node = sc.execute();
			}
			else
				node = node.trigger(p);
		}
		return -1;
	}
	
	public Player getPlayer() { return p; }
}
