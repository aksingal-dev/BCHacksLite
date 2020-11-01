

import java.util.ArrayList;
import java.util.Scanner;

public class Player {
	private 
		int	dex; //dexterity
		int	str; //strength
		int cha; //charisma
		String costume;
		ArrayList<Candy>candies = new ArrayList<Candy>();
		
		//constructor
		public Player(String costume) {
			this.str = 3;
			this.cha = 3;
			this.dex = 3;
			this.costume = costume;
		}
		
		//getters and setters 
		public int getDex() {
			return dex;
		}
		public void setDex(int dex) {
			this.dex = dex;
		}
		public int getStr() {
			return str;
		}
		public void setStr(int str) {
			this.str = str;
		}
		public int getCha() {
			return cha;
		}
		public void setCha(int cha) {
			this.cha = cha;
		}
		
		//adding a new candy
		public void addCandy(Candy candy) {
			while((candies.size() +1) >= (getStr() + 5) ) { //if you already have the max amount you can carry
				System.out.println("You have too many candies, choose one to eat or type skip to leave this candy ");
				for (Candy candy3 : candies) {
					System.out.print(candy3.getName()+ " , ");
				} //print list of candies
				Scanner in = new Scanner(System.in); 
				String temp = in.next(); //get name of candy to eat 
				in.close();
				if(!temp.equalsIgnoreCase("skip")) { 
					for (Candy candy2 : candies) { //check for candy
						if(candy2.getName().equalsIgnoreCase(temp)) { 
							candies.remove(candy2); //remove eaten from inventory 
							break; //break for loop
						}
					}
				}
				else {
					break; //break while loop in case of skip
				}
			}
			if( !( (candies.size() +1) >= (getStr() + 5) ) ){ //add the candy
				candies.add(candy);
				System.out.println("You got a " + candy.getName() + "!\n" + candy.getDescription());
			}
		}
		
		public Candy dropCandy()
		{
			for(Candy c : candies)
			{
				if(c.getPoints() == 500)
				{
					return candies.remove(candies.indexOf(c));
					
				}
			}
			return candies.remove(0);
		}
		
		public void modifyStats(int[] stats) { //modify stats
			this.setCha(getCha()+ stats[0]);
			this.setDex(getDex()+ stats[1]);
			this.setStr(getStr()+ stats[2]);
			
		}
		
		public void eatCandy(Candy c) {
			if(c.isEdible()) {
				modifyStats(c.getEffect());
			}
			else {
				
			}
		}
	
}
