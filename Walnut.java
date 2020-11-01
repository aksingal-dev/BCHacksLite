
public class Walnut extends Candy {

	@Override
	protected void SetName() {
		Name = "Walnut"; 
		
	}

	@Override
	protected void SetDescription() {
		
		Description = "How would you even eat this? Just throw it at something.";
	}

	@Override
	protected void SetPoints() {
		// TODO Auto-generated method stub
		Points = 2; 
	}

	@Override
	protected void SetEdible() {
		// TODO Auto-generated method stub
		Edible = false; 
	}

	@Override
	protected void setEffects() {
		// TODO Auto-generated method stub
		effect[0] = 0;
		effect[1] = 0;
		effect[2] = 0;
	}

	@Override
	protected void setBribe() {
		// TODO Auto-generated method stub
		canBribe = false;
	}


}
