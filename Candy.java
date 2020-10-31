
public abstract class Candy {
		//attributes
		String Name;
		String Description; 
		String Effect; 
		boolean Edible, canBribe; 
		int Points; 
		int[] effect = new int[3];
		
		//constructors 
		public Candy() {
			SetName();
			SetDescription();
			SetEdible(); 
			SetPoints(); 
		
		}

		protected abstract void SetName();

		protected abstract void SetDescription();
		
		protected abstract void SetPoints(); 

		protected abstract void SetEdible();
		
		protected abstract void setEffects();
		protected abstract void setBribe();

		public String getName() {
			return Name;
		}


		public String getDescription() {
			return Description;
		}


		public String getEffect() {
			return Effect;
		}
	

		public boolean isEdible() {
			return Edible;
		}


		public int getPoints() {
			return Points;
		}
		
		public boolean getBribe() {
			return canBribe;
		}
	}

		 
 


