
import java.util.*;

public class StoryNode {
	private String output;
	private StoryNode next;										// intended to be for consecutive nodes
	private StoryNode a;
	private StoryNode b;
	private StoryNode c;
	private StoryNode d;
	private String optA;
	private String optB;
	private String optC;
	private String optD;
	
	private Candy[] candiesGiven = {null, null, null, null};
	private int ending = -1;
	
	public StoryNode trigger(Player p, Scanner sc){
		if(this.output().contains("startled by a mummy"))
			this.setOutput(this.output() + p.dropCandy());
		
		System.out.println(this.output());
		if(ending != -1)
		{
			return new StoryNode(Integer.toString(ending));
		}
		if(next != null)
		{
			if(candiesGiven[0] != null)
				p.addCandy(candiesGiven[0]);
			return next;
		}
		String s = "";
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
			s = sc.nextLine().toLowerCase();
			sc.close();
			valid = !((!s.equals("a") && !s.equals("b") && !s.equals("c") && !s.equals("d")) ||
					  (s.equals("c") && c == null) ||
					  (s.equals("d") && d == null));
			if(!valid)
				System.out.println("I'm sorry, I didn't understand that.");
		} while(!valid);
		
		
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
	public void setNext(StoryNode n) { next = n; }
	public void setA(StoryNode n) { a = n; }
	public void setB(StoryNode n) { b = n; }
	public void setC(StoryNode n) { c = n; }
	public void setD(StoryNode n) { d = n; }
	public void setA(StoryNode n, String opt) { a = n; optA = opt;}
	public void setB(StoryNode n, String opt) { b = n; optB = opt;}
	public void setC(StoryNode n, String opt) { c = n; optC = opt;}
	public void setD(StoryNode n, String opt) { d = n; optD = opt;}
	public void setEnding(int ending) { this.ending = ending; }
	
	public StoryNode getA() { return a; }
	public StoryNode getB() { return b; }
	public StoryNode getC() { return c; }
	public StoryNode getD() { return d; }
	public String output() { return output; }
}
