
public class Skillcheck extends StoryNode {
	private Player p;
	private int stat;
	private StoryNode success;
	private StoryNode fail;
	private int minRoll;
	
	public Skillcheck(String str, Player p, int stat, StoryNode s, StoryNode f, int min)
	{
		super(str);
		this.p = p;
		this.stat = stat;
		success = s;
		fail = f;
		minRoll = min;
		
	}
	
	public StoryNode execute()
	{
		int roll = (int) (Math.random() * 20 + 1);	//roll 1d20
		if(stat == 0) roll += p.getCha();
		if(stat == 1) roll += p.getDex();
		if(stat == 2) roll += p.getStr();
		System.out.print("(ROLL " + roll + ":");
		if(roll >= minRoll) { System.out.println("Success!)"); return success; }
		System.out.println("Failure...)");
		return fail;
	}
}
