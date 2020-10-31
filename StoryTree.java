

public class StoryTree {
	private StoryNode root;
	
	Candy[] smallCandyArray = {new BagOfPandQs(), new BagOfSquirtles(), new CandyCorn(), new ChocolateRaisins(),
						  new GummyWorms(), new Rockets()};
	Candy[] largeCandyArray = {new CookiesAndCreamBar(), new LargeBitBatBar(), new LargeKwix()};
	
	public StoryNode getRoot() { return root; }
	
	public StoryTree(Player p)
	{
		// PRE-BRANCHING PATH //
		root = new StoryNode("Well, this is it, then! You've decided that you're going to be a " + p.costume + ".\n"
                		   + "You check your costume out one more time in the mirror to make sure\n"
                		   + "that you're looking like the best damn " + p.costume + " on the block.\n\n"
                		   + "You walk up to the first house on the block. It’s... kind of tacky looking. \n"
						   + "For some reason it has Christmas lights up, but it also has a carved pumpkin on the \n"
						   + "porch, as well as some fake cobwebs. At least, you think they’re fake…\n\n"
						   + "You go up to the door, knock, and yell \"Trick or treat!\" as loud as you can, so\n"
						   + "the owner is sure to hear you. An extremely pale man holding a black platter of candy\n"
						   + "comes to the door, wearing an long cape with the collar popped up. Underneath, you see\n"
						   + "a shimmering medallion hanging from his neck, as well as\n"
						   + "a white bowtie and a clean white shirt to match.\n\n"
						   + "\"Welcome, child!\" the man says. He eyes you up and down, as though he wanted\n"
						   + "to take a bite out of you. He compliments your " + p.costume + " costume,\n"
						   + "noticing the detail you put in, before asking you which you prefer:\n"
						   + "Squirtles or chocolate raisins?");
		StoryNode n1 = new StoryNode("As the man places the candy into your pillowcase, he leans down toward\n"
								   + "your neck as though to sniff it. You step away quickly, candy in tow,\n"
								   + "and thank him before power-walking away from the Christmas-Halloween hybrid house.\n\n"
								   + "The next house along is a thing of beauty - even with just a pair of\n"
								   + "giant inflatable decorations, it seems to look its best. Both are at least\n"
								   + "10 feet tall, and (in your opinion) oh so majestic.\n\n"
								   + "You rap on the door with the knocker, yelling again, \"Trick or treat!\"");
		StoryNode nOops = new StoryNode("Barely a moment after your yell, a tall woman with flowing auburn hair opens the door.\n"
								  	 + "Her pitch-black robe contrasts starkly with the cat hair that covers the\n"
								  	 + "front, likely from the pearl-white cat rubbing against her leg. A massive cauldron,\n"
								  	 + "bubbling audibly, lurked in the hallway behind her; without looking, she\n"
								  	 + "reaches back, takes a large BitBat bar out of it and drops it into your\n"
								  	 + "pillowcase.\n\n"
								  	 + "The thought flashes through your head that a bit of flattery might earn you\n"
								  	 + "some more...");
		
		root.setA(null, "A bag of Squirtles, please!");
		root.setB(null, "Chocolate-covered raisins, please!");
		root.setCandy(new BagOfSquirtles(), 0);
		root.setCandy(new ChocolateRaisins(), 1);
		root.setA(n1);
		root.setB(n1);
		n1.setCandy(new LargeBitBatBar(), 0);
		n1.setNext(nOops);
		
		StoryNode n2;		// skillcheck; init after the results
		StoryNode n3 = new StoryNode("As you finish speaking, the witch laughs slightly, and - to your surprise -\n"
								   + "reaches back into the cauldron, dumping another fistful of candy into your bag.");
		StoryNode n4 = new StoryNode("The witch raises an eyebrow as you stutter slightly, and utters a warning:\n"
								   + "\"You shouldn't mess with things you know nothing of... Be glad for what you got.\"\n");
		StoryNode n5 = new StoryNode("Ehh... why bother? You got plenty as is.\n");
		n2 = new Skillcheck("You attempt to flatter the witch!",p,0,n3,n4,10);
		
		nOops.setA(n2);
		nOops.setB(n5);
		
		StoryNode n6 = new StoryNode("The witch wishes you a spooky evening, before mist appears from nowhere to obscure\n"
								   + "her body. By the time the mist clears, she has disappeared, and the door creaks shut.\n"
								   + "Maybe you ought to move on to the next house...\n");
		n3.setNext(n6);
		n4.setNext(n6);
		n5.setNext(n6);
		
		StoryNode n7 = new StoryNode("As you walk up to the next house, you notice a massive number of pumpkins;\n"
								   + "easily around 15 of them, each looking like they'd been roughly carved by claws.\n"
								   + "Fortunately, you couldn't see any feral beasts around, so you pushed onwards.\n"
								   + "After ringing the doorbell and yelling the tried and true, \"Trick or treat\",\n"
								   + "a man - no, this is no man - answers the door covered in fur. He must be some\n"
								   + "sort of animal, but... wearing ripped jeans and flannel?\n\n"
								   + "You start to turn, meaning to run away, but you hear it speak in English and\n"
								   + "turn back around.\n\n");
		n6.setNext(n7);
		
		StoryNode n8 = new StoryNode("\"Happy Halloween!\" he says. \"I hope you're having a safe and fun night.\"\n\n"
								   + "The werewolf (you're SURE that's what he is) seems happy to see you, and \n"
								   + "not in an \"I'm-going-to-eat-you\" sort of way. You calm down and smile\n"
								   + "sheepishly at him as he continues:\n"
								   + "Well, what kind of candy would you like?");
		n8.setA(null, "Gummy worms!");
		n8.setB(null, "Rockets!");
		n8.setC(null, "P and Q's!");
		n8.setCandy(new GummyWorms(), 0);
		n8.setCandy(new Rockets(), 1);
		n8.setCandy(new BagOfPandQs(), 2);
		
		StoryNode n9 = new StoryNode("The werewolf laughs heartily, startling you. \"Those are my favorites too!\"\n"
								   + "He tosses the candy into your pillowcase, and waves at you as you walk away.\n");
		n8.setA(n9);
		n8.setB(n9);
		n8.setC(n9);
		
	}
}
