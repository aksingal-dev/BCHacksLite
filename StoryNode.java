
import java.util.*;

public class StoryNode {
	private String output;
	private StoryNode a;
	private StoryNode b;
	private StoryNode c;
	private StoryNode d;
	private String optA;
	private String optB;
	private String optC;
	private String optD;
	
	private int[] skillChecks = new int[4];		//-1 for none, 0 for cha, 1 for dex, 2 for str
	private Candy[] candiesGiven = new Candy[4];
	private int ending = -1;
	
	public StoryNode trigger(Player p){
		System.out.println(this.output());
		if(ending != -1)
		{
			return new StoryNode(Integer.toString(ending));
		}
		if(b == null && c == null && d == null)					// straight-through node
		{
			p.addCandy(candiesGiven[0]);
			return a;
		}
		String s = "";
		Scanner sc = new Scanner(System.in);
		boolean valid;
		do {
			System.out.println("a: " + optA);
			System.out.println("b: " + optB);
			if(c != null)
			{
				System.out.println("c: " + optC);
				if(d != null)
					System.out.println("d: " + optD);
			}
			s = sc.next().toLowerCase();
			valid = !((!s.equals("a") && !s.equals("b") && !s.equals("c") && !s.equals("d")) ||
					  (s.equals("c") && c == null) ||
					  (s.equals("d") && d == null));
			if(!valid)
				System.out.println("I'm sorry, I didn't understand that.");
		} while(!valid);
		sc.close();
		
		if(s.equals("a"))
		{
			p.addCandy(candiesGiven[0]);
			return a;
		}
		if(s.equals("b"))
		{
			p.addCandy(candiesGiven[1]);
			return b;
		}
		if(s.equals("c"))
		{
			p.addCandy(candiesGiven[2]);
			return c;
		}
		if(s.equals("d"))
		{
			p.addCandy(candiesGiven[3]);
			return d;
		}
		
		return null;							// this can never happen, but Eclipse thinks we could get here, so...
	}
	
	public StoryNode SkillCheck(Player p, int stat, int minRoll, StoryNode success, StoryNode fail)
	{
		int roll = (int) (Math.random() * 20 + 1);	//roll 1d20
		if(stat == 0) roll += p.getCha();
		if(stat == 1) roll += p.getDex();
		if(stat == 2) roll += p.getStr();
		
		if(roll >= minRoll) return success;
		return fail;
	}
	
	public StoryNode(String str, StoryNode a, StoryNode b, StoryNode c, StoryNode d)
	{
		output = str;
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}
	
	public StoryNode(String str)
	{
		output = str;
		this.a = null;
		this.b = null;
		this.c = null;
		this.d = null;
	}
	
	public void setOutput(String out) { output = out; }
	public void setCandy(Candy c, int n) { candiesGiven[n] = c; }
	public void setA(StoryNode n) { a = n; }
	public void setB(StoryNode n) { b = n; }
	public void setC(StoryNode n) { c = n; }
	public void setD(StoryNode n) { d = n; }
	public void setA(StoryNode n, String opt) { a = n; optA = opt;}
	public void setB(StoryNode n, String opt) { b = n; optB = opt;}
	public void setC(StoryNode n, String opt) { c = n; optC = opt;}
	public void setD(StoryNode n, String opt) { d = n; optD = opt;}
	public void setSkillChecks(boolean[] checks) {
		skillChecks[0] = checks[0];
		skillChecks[1] = checks[1];
		skillChecks[2] = checks[2];
		skillChecks[3] = checks[3];
	}
	public void setEnding(int ending) { this.ending = ending; }
	
	public StoryNode getA() { return a; }
	public StoryNode getB() { return b; }
	public StoryNode getC() { return c; }
	public StoryNode getD() { return d; }
	public String output() { return output; }
}
