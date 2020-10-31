
public abstract class Candy {
		//attributes
		String Name;
		String Description; 
		String Effect; 
		boolean Edible; 
		int Points; 
		
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


}


