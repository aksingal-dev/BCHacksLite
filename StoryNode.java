import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import java.util.*;

public class StoryNode implements ActionListener
{
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
   
   JFrame frame;
   JPanel contentPane;
   JButton next, option1, option2, option3, option4;
   JLabel story;
   
   Font arial = new Font("Arial", Font.PLAIN, 12);
   Font mono = new Font("Monospaced", Font.PLAIN, 12);
   Font century = new Font("Century", Font.PLAIN, 12);
   
   String p1 = ("<html><div style='text-align: center;'>You yawn as you stretch, and having woken up from your nap just as your alarm starts to go off. It’s finally October 31st, Halloween! <br/> You’ve been waiting for this day for, well, since last Halloween! This year is sure to be the best. It’s 5pm, so it’s time to pick out your costume and head out! <br/> But, what to be? You’ve managed to narrow it down to four options, but they’re all so good! What should you be?</div><html>");
   String costume1 = "a pumpkin";
   String costume2 = "a dinosaur";
   String costume3 = "a blue Trayola crayon";
   String costume4 = "a banana";
   
   public StoryNode ()
   {
      //Create and set up the frame
      frame = new JFrame("Choose Your Own Candy");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setFont(arial);
      
      //Create a content pane with a BoxLayout and empty borders
      contentPane = new JPanel();
      contentPane.setBorder(BorderFactory.createEmptyBorder(100, 100, 300, 100));
      contentPane.setBackground(Color.black);
      contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.PAGE_AXIS));
		
      //Create a label that shows the story
      story = new JLabel(p1);
      story.setAlignmentX(JLabel.CENTER_ALIGNMENT);
      story.setBorder(BorderFactory.createEmptyBorder(0, 0, 10, 0));
      contentPane.add(story);
      story.setForeground(Color.white); 
      
      //Create a "next" button
      next = new JButton("next");
      next.setAlignmentX(JButton.CENTER_ALIGNMENT);
      next.addActionListener(this);
      contentPane.add(next);
      next.setBackground(Color.black);
      next.setForeground(Color.green);
      next.setFont(mono);
      next.setVisible(false); 
      
      //Create an "option 1" button
      option1 = new JButton("option 1");
      option1.setAlignmentX(JButton.CENTER_ALIGNMENT);
      option1.addActionListener(this);
      contentPane.add(option1);
      option1.setBackground(Color.black);
      option1.setForeground(Color.green);
      option1.setFont(century);
      
      //Create an "option 2" button
      option2 = new JButton("option 2");
      option2.setAlignmentX(JButton.CENTER_ALIGNMENT);
      option2.addActionListener(this);
      contentPane.add(option2);
      option2.setBackground(Color.black);
      option2.setForeground(Color.green);
      option2.setFont(century); 
      
      //Create an "option 3" button
      option3 = new JButton("option 3");
      option3.setAlignmentX(JButton.CENTER_ALIGNMENT);
      option3.addActionListener(this);
      contentPane.add(option3);
      option3.setBackground(Color.black);
      option3.setForeground(Color.green);
      option3.setFont(century);     
      
      //Create an "option 4" button
      option4 = new JButton("option 4");
      option4.setAlignmentX(JButton.CENTER_ALIGNMENT);
      option4.addActionListener(this);
      contentPane.add(option4);
      option4.setBackground(Color.black);
      option4.setForeground(Color.green);
      option4.setFont(century);         
      
      //Add content pane to frame
      frame.setContentPane(contentPane);
      
      //Size and then display the frame
      frame.pack();
      frame.setVisible(true);
   }
   
   //Handle a button
   //Pre: none
   //Post: 
   public void actionPerformed(ActionEvent event)
   {
      String eventName = event.getActionCommand();
      
      if (eventName.equals(next) || eventName.equals(option1) || eventName.equals(option2) || eventName.equals(option3) || eventName.equals(option4))
      {
         
      }
         
   }
   
	private static void runGUI()
	{
		JFrame.setDefaultLookAndFeelDecorated(true);
		StoryNode greeting = new StoryNode();
	}   
	
	public static void main(String[] args)
	//Methods that create and show a GUI should be run from
	//an event-dispatching thread.
	{
		javax.swing.SwingUtilities.invokeLater(new Runnable()
		{
			public void run()
			{
				runGUI();
			}
		});
	}
//end of my stuff
	
	public StoryNode trigger(Player p)
   {
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
	public void setSkillChecks(int[] checks) {
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
