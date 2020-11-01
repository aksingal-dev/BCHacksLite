

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
		
		nOops.setA(n2, "Go for flattery!");
		nOops.setB(n5, "Go about your night");
		
		StoryNode n6 = new StoryNode("The witch wishes you a spooky evening, before mist appears from nowhere to obscure\n"
								   + "her body. By the time the mist clears, she has disappeared, and the door creaks shut.\n"
								   + "Maybe you ought to move on to the next house...\n\n"
								   + "As you walk up to the next house, you notice a massive number of pumpkins;\n"
								   + "easily around 15 of them, each looking like they'd been roughly carved by claws.\n"
								   + "Fortunately, you couldn't see any feral beasts around, so you pushed onwards.\n"
								   + "After ringing the doorbell and yelling the tried and true, \"Trick or treat\",\n"
								   + "a man - no, this is no man - answers the door covered in fur. He must be some\n"
								   + "sort of animal, but... wearing ripped jeans and flannel?\n\n"
								   + "You start to turn, meaning to run away, but you hear it speak in English and\n"
								   + "turn back around.\n\n"
								   + "\"Happy Halloween!\" he says. \"I hope you're having a safe and fun night.\"\n\n"
								   + "The werewolf (you're SURE that's what he is) seems happy to see you, and \n"
								   + "not in an \"I'm-going-to-eat-you\" sort of way. You calm down and smile\n"
								   + "sheepishly at him as he continues:\n"
								   + "Well, what kind of candy would you like?");
		n3.setNext(n6);
		n4.setNext(n6);
		n5.setNext(n6);
		n6.setA(null, "Gummy worms!");
		n6.setB(null, "Rockets!");
		n6.setC(null, "P and Q's!");
		n6.setCandy(new GummyWorms(), 0);
		n6.setCandy(new Rockets(), 1);
		n6.setCandy(new CandyCorn(), 2);
		
		StoryNode n9 = new StoryNode("The werewolf laughs heartily, startling you. \"Those are my favorites too!\"\n"
								   + "He tosses the candy into your pillowcase, and waves at you as you walk away.\n");
		n6.setA(n9);
		n6.setB(n9);
		n6.setC(n9);
		
		// ASPHODEL MINTS
		StoryNode n10 = new StoryNode("The next house has no decorations outside - no pumpkins, not even a\n"
									+ "sheet hung up to look like a ghost. But the lights are on, so you decide\n"
									+ "to go knock anyway.\n\n"
									+ "A greasy man comes to the door; he's unshaven, and smells as though he hasn't\n"
									+ "showered in a week. Disgostang! He looks at you with an unsettling light\n"
									+ "in his eye, and doesn't react to your shaky \"Trick or treat?\"\n"
									+ "A few moments later, as you're about to turn to leave, he reaches beside the\n"
									+ "door to grab a couple of mints, which he tosses into your pillowcase lazily.\n"
									+ "Asphodel Mints,\" he mutters under his breath, before staggering back inside\n"
									+ "and slamming the door behind him.\n\n"
									+ "Somewhat shaken, you turn around and nearly sprint back down the path,\n"
									+ "eager to get back on the road.\n\n");
		n9.setNext(n10);
		n10.setCandy(new AsphodelMints());
		
		StoryNode n11 = new StoryNode("However, just as you get to the road, your stomach rumbles; the night\n"
									+ "has already been more exhausting than expected. You wanted to save\n"
									+ "your candy for when you get home... but maybe you could eat those mints?\n"
									+ "You don't think your mom would be happy to see you with them anyway...\n\n");
		n10.setNext(n11);
		n11.setA(null, "Eat the mints... what's the worst that could happen?");
		n11.setB(null, "Deal with it for a while.");
		
		StoryNode mintEnd = new StoryNode("2");
		StoryNode n12 = new StoryNode("You decide that it's probably best not to chance it, and place\n"
									+ "the mints back into your pillowcase. You'll get through it just fine.\n\n");
		
		n11.setA(mintEnd);
		n11.setB(n12);
		
		// END OF ASPHODEL MINTS
		
		// HAUNTED HOUSE
		
		StoryNode n13 = new StoryNode("As you're walking down the street, your eyes are stabbed by a flash of\n"
									+ "neon light. You look up and see a massive house, more of a mansion, at\n"
									+ "the end of the road, dressed up like a haunted house. It looks awesome;\n"
									+ "but almost a little TOO real, with kids running out from the back screaming.\n"
									+ "Still... it would be a shame to miss out on it...\n\n");
		n12.setNext(n13);
		n13.setA(null, "Brave the haunted house! In the name of good fun!");
		n13.setB(null, "Maybe next year?");
		
		// SKIP THE HAUNTED HOUSE - LAME ENDING ROUTE
		
		StoryNode n14 = new StoryNode("You look into your pillowcase and see that your candy pickings are a bit thin...\n"
									+ "You stare down at the haunted house, pondering whether your haul would be\n"
									+ "disappointing to 8-year-old you.\n"
									+ "Eventually, you decide that the haunted house is a bit more than you're ready\n"
									+ "for, this year. So, with a heavy heart, you turn around, thinking you'll hit\n"
									+ "a few more houses on the way back home and inflate the candy Wall Street a little\n"
									+ "more.\n\n");
		n13.setB(n14);
		
		StoryNode n15 = new StoryNode("On your way back, you pass by a house without any lights on. However, they have a\n"
									+ "bowl with a \"TAKE ONE\" sign attached; the bowl still has a few pieces of candy!\n"
									+ "You could probably take a few, if you wanted...\n\n");
		n14.setNext(n15);
		n15.setA(null, "Leave some for everyone else");
		n15.setB(null, "MINE! MINE! ALLLLLLLL MINE!");
		
		StoryNode n16 = new StoryNode("You decide to be courteous, and only take one bag of P&Qs... Everybody else\n"
									+ "should get some too.\n\n");
		StoryNode n17 = new StoryNode("\"Might as well take it all,\" you think, before shoveling the entire bowl\n"
									+ "into your pillowcase.\n\n");
		StoryNode add17a = new StoryNode("");
		StoryNode add17b = new StoryNode("");
		StoryNode add17c = new StoryNode("");
		n15.setA(n16);
		n15.setB(n17);
		n17.setNext(add17a);
		add17a.setNext(add17b);
		add17b.setNext(add17c);
		
		StoryNode n18 = new StoryNode("Turning to continue down the street, you're startled by a mummy jumping\n"
									+ "out at you from a bush! It starts to chase you, and you break into a sprint,\n"
									+ "desperately trying to evate it by reaching the next house over. While you're running, a");
		StoryNode bugfix18 = new StoryNode(" falls out of your pillowcase, and the mummy\n"
										 + "stops to pick it up. You accept the loss, and keep running to the next house.\n\n");
		n16.setNext(n18);
		add17c.setNext(n18);
		n18.setNext(bugfix18);
		
		StoryNode n19 = new StoryNode("The next house has a nice middle-aged couple, who watch you running up the path before\n"
									+ "falling to your hands and knees on their stairs. The man kneels down and helps you up.\n\n"
									+ "\"Are you alright?\" he asks, a note of worry in his voice.\n\n"
									+ "\"Trick... or... treat?\" you reply, out of breath. The man smiles slightly, and\n"
									+ "gestures to his wife, who steps forward with two large candy bars in her hands.\n\n"
									+ "\"Tell you what,\" she says, \"I'll give you this one for free.\" She slips the bar,"
									+ "a large Kwix, into your pillowcase. \" And if you can beat me in a race for this one,\""
									+ "you can have it too.\" While speaking, she waggles a cookies-and-cream bar in her other hand.\n\n");
		n18.setNext(n19);
		n19.setA(null, "Give it the old colledge try!");
		n19.setB(null, "I'm too tired...");
		
		StoryNode n20;		// skill check; init after results
		StoryNode n21 = new StoryNode("Your heart pounds in your ears as you line up and wait for the whistle. The moment\n"
									+ "the man tweets, you're off at breakneck pace, speeding ahead of the woman easily.\n"
									+ "You reach the finish a full second before her, and fall down again, huffing and puffing.\n"
									+ "\"Nicely done,\" she says. \"You've earned this.\" The husband tosses the\n"
									+ "cookies-and-cream bar into your pillowcase, and you clamber to your feet gladly.\n\n");
		StoryNode n22 = new StoryNode("As you're lining up, you can already tell your costume is going to be cumbersome;\n"
									+ "but when you start running, it's so much worse than you could have imagined, and you go\n"
									+ "ass-over-teakettle as she breaks ahead of you.\n\n"
									+ "");
		StoryNode n23 = new StoryNode("You smile shakily up at her, but shake your head. \"Too tired,\" you say. The lady sighs\n"
									+ "disappointedly, but smiles back at you. \"Alright then,\" she says in a friendly tone.\n"
									+ "\"Take care of yourself!\"\n\n");
		
		n20 = new Skillcheck("A smile creeps over your face, and you nod, thinking that you could easily beat the woman and\n"
				   + "get your hand on another large candy bar.", p, 1, n21, n22, 13);
		n19.setA(n20);
		n19.setB(n23);
		
		StoryNode n24 = new StoryNode("Walking toward the next house, you smile as you pass by a pumpkin carved to look\n"
									+ "like a cat. When you turn away from it, you're practically at the gate.\n"
									+ "You walk past little pumpkin decorations hanging from tree branches, and a little\n"
									+ "skeleton decoration on the door. When you reach the door, you see that she's a bit\n"
									+ "sweaty, and she explains that she took so long putting up the decorations that\n"
									+ "she didn't even have time to get her costume on. She compliments yours, though,\n"
									+ "and slips a stick of Rockets into your sack.\n"
									+ "By now, you're getting a little bit tired, so you make your way back home.\n\n");
		n24.setCandy(new Rockets());
		n21.setNext(n24);
		n22.setNext(n24);
		n23.setNext(n24);
		
		StoryNode n25 = new StoryNode("Stepping in the door of your house causes a wave of fatigue to set in. You've\n"
									+ "been out for a while, and the warmth of the heating makes you want to pack it in\n"
									+ "for the night. It was a good night, and you got a lot of candy - you'll probably\n"
									+ "have a stomach ache tomorrow. For now, though, you put your costume back on its\n"
									+ "hanger, put on your pajamas, and crawl into bed.\n\n"
									+ "This was a good Halloween. But maybe, you think, the haunted house could have\n"
									+ "made it just that little bit better...\n\n");
		n24.setNext(n25);
		
		StoryNode lameEnd = new StoryNode("1");
		n25.setNext(lameEnd);
		
		
		// END OF LAME ENDING ROUTE
		
		// ENTER THE HAUNTED HOUSE
		
		StoryNode n26 = new StoryNode("You need to beat down a \"YOLO\" (what is this, 2013?) before getting in line\n"
									+ "to enter the haunted house. A group of four nerdy-looking teenagers wearing\n"
									+ "costumes you don't recognize gather in behind you, muttering among themselves\n"
									+ "about how the house was 'scarier than Phantasma,' and how they 'didn't even want\n"
									+ "to leave their houses after that one.' You... admittedly have no idea what\n"
									+ "Phantasma is, but decide it's better not to ask.\n\n"
									+ "Finally, it's your turn to go in! A man standing at the front door hands you\n"
									+ "a walnut.\n"
									+ "...What is this? Some kind of Halloween 'treat?' More like a trick...\n\n");
		
		n13.setA(n26);
		n13.setCandy(new Walnut(), 0);
		
		StoryNode n27 = new StoryNode("Walking through the house, you're surprised to see that it isn't the bog-standard,\n"
									+ "kitschy-horror haunted house you're used to - it's impressive how the family\n"
									+ "had pulled it off. Actors reach out to grab you around every corner, and there's\n"
									+ "fake (hopefully) blood everywhere, with mannequin bodies piled up nearby.\n"
									+ "There are even shackles hanging down from the ceiling, a neat little detail\n"
									+ "However, as you're walking down a hall, a door creaks open on your left, and a trail\n"
									+ "of mist seeps out and curls up, almost mimicking a come-hither motion. It piques\n"
									+ "your curiosity, and you consider turning off what you think is the intended path.\n\n");
		
		n26.setNext(n27);
		n27.setA(null, "Walk through the door");
		n27.setB(null, "Continue down the hallway");
		
		// LOOP ENDING: https://i.redd.it/hj4dr1lonal31.png
		StoryNode n28 = new StoryNode("As you step through the door, you see that you're standing in a vast room, with\n"
									+ "nobody else to be seen; it must be the wrong path. But when you turn around to\n"
									+ "go back into the hall, you can't see the door. You can't see anything, actually -\n"
									+ "the fog has obscured your sight. You fumble at the wall, looking for an opening,\n"
									+ "but find nothing; so, with no other option, you shuffle along with your shoulder\n"
									+ "against the wall, hoping you just missed the door.\n\n");
		n27.setA(n28);
		
		StoryNode n29 = new StoryNode("As you walk along the wall, the smoke thickens even further until you can\n"
									+ "barely see your own hands when you wave them in front of your face.\n"
									+ "Colours start appearing as though there were concert floodlights -\n"
									+ "coming from overhead, in front of you, and somehow a bright green light from\n"
									+ "BELOW you? And it feels as though you've walked further than the mansion was wide...\n"
									+ "Just as you're telling yourself that it's impossible, and the house must be\n"
									+ "just as rational as everything else, your foot slides off into a void and you fall\n"
									+ "forward, flipping to fall back-first down a pit.\n"
									+ "You must scream.\n"
									+ "But you can't scream. Why can't I scream? He has no mouth. But he has feet,\n"
									+ "why can't his feet scream? Why can't the lights scream? The lights that are falling\n"
									+ "with me, following you down, the green light blasting up past our back -\n\n");
		n28.setNext(n29);
		
		StoryNode loopEnd = new StoryNode("3");
		
		n29.setNext(loopEnd);
		
		// END OF LOOP ENDING
		
		// TRUE ENDING
		
		StoryNode n30 = new StoryNode("You decide against it, guessing that the path would be more clearly marked. And\n"
									+ "as you continue down the hallway, you see an arrow marker on the wall pointing\n"
									+ "in the direction you're walking, and you sigh in relief.\n\n"
									+ "As you get near what you think is the exit door, you see a mannequin in an old-school,\n"
									+ "Jacob Woolbees-style hockey mask and holding a whirring chainsaw! As you shuffle\n"
									+ "toward it, you start thinking that it looks a little too real; just as you decide\n"
									+ "that it's probably not, the mannequin steps off of its pedestal and revs the chainsaw,\n"
									+ "turning to face you!\n\n"
									+ "You bolt away from the mannequin, hearing him lumbering after you, and desperately\n"
									+ "reach into your sack for anything that could fend him off for even a minute. But the\n"
									+ "only thing your hand closes on is the walnut from earlier! Could this even help at all?\n\n");
		n27.setB(n30);
		
		// yeet one (1) walnut
		StoryNode yeet = new StoryNode("It's not as though the walnut can do any harm; so you pull it out of the sack and\n"
									+ "throw it back toward the mannequin. Surprisingly, it shatters on the ground, and\n"
									+ "releases a cloud of smoke between you and the mannequin! You can hear his footfalls\n"
									+ "stop, and you manage to reach a door labelled 'EXIT.'\n\n");
		
		StoryNode run = new StoryNode("Deciding it would probably just anger the madman, you drop the walnut and push yourself\n"
									+ "to run even faster. Within seconds, you're screeching to a halt at a door labelled 'EXIT.'\n\n");
		
		n30.setA(yeet, "Throw the walnut!");
		n30.setB(run, "Just try to get away");
		
		StoryNode n31 = new StoryNode("Gratefully, you slam yourself against the door, falling onto the grass outside\n"
									+ "and hyperventilating.\n\n"
									+ "That was close.\n\n"
									+ "Maybe too close.\n\n"
									+ "But your thoughts drift to the group of nerds behind you: how scared will they be\n"
									+ "on their way out? Do you even want to stick around and see, or just head home\n"
									+ "and get to sleep?\n\n");
		yeet.setNext(n31);
		run.setNext(n31);
		n31.setA(null, "I wouldn't miss their reaction for the world!");
		n31.setB(null, "I really ought to get to sleep...");
		
		StoryNode seed = new StoryNode("With a sardonic smile on your face, you drag yourself away from the door\n"
									 + "to rest agaist the wall, watching the exit.\n\n"
									 + "Five minutes later, the four nerds burst through the exit, shrieking as the\n"
									 + "sound of the chainsaw buzzes behind them. As the last one slips through the door,\n"
									 + "his pillowcase tears slightly and a small, vaguely-round object drops out.\n"
									 + "He doesn't seem to notice, though, as he's already twenty feet away and\n"
									 + "rushing toward the street like a linebacker.\n\n"
									 + "You stand up and walk over to where the object seemed like it fell, and\n"
									 + "stumble over it under your feet; you pick it up, and realize it's shaped like a\n"
									 + "Wershey's hug, and extraordinarily heavy: the thing must be made out of solid metal!\n"
									 + "Even though it smells like a cow paddy, you pocket it quickly, and as\n"
									 + "you do, the words 'Yahaha!' echo in the wind...\n\n");
		n31.setCandy(new KerrickSeed(), 0);
		n31.setA(seed);
		
		StoryNode homeSeed = new StoryNode("You wander home through noisy streets, locking the door when you entered\n"
										 + "and climbing upstairs to your room. With a sigh of exhaustion, you dump your\n"
										 + "sack into a plastic bucket, spilling a bit of candy due to the sheer volume of\n"
										 + "the lump you retrieved.\n\n"
										 + "Questions, questions, questions.\n\n"
										 + "But you can leave those for tomorrow. Tonight, you just want to get to sleep.\n\n");
		
		StoryNode homeQuick = new StoryNode("You wander home through noisy streets, locking the door when you entered\n"
				 						  + "and climbing upstairs to your room. With a sigh of exhaustion, you dump your\n"
				 						  + "sack into a plastic bucket, a bit of candy overflowing onto the floor.\n"
				 						  + "But you figure you may as well clean that up in the morning; tonight, you just\n"
				 						  + "want to get to sleep.\n\n");
		
		n31.setB(homeQuick);
		seed.setNext(homeSeed);
				 
		StoryNode end = new StoryNode("You glance out the window and see the wind beginning to pick up; with that, you\n"
										 + "put your costume back on its hanger, put on your pajamas, and crawl into bed.\n"
										 + "All things considered... This was a damn good Halloween.\n\n");
		homeSeed.setNext(end);
		homeQuick.setNext(end);
		end.setNext(new StoryNode("0"));
	}
}
