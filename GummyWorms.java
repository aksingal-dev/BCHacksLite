
public class GummyWorms extends Candy {

	@Override
	protected void SetName() {
		Name = "GummyWorms"; 
		
	}

	@Override
	protected void SetDescription() {
		// TODO Auto-generated method stub
		Description = "You should probably clean the dirt off of these..."; 
	}

	@Override
	protected void SetPoints() {
		// TODO Auto-generated method stub
		Points = 100; 
	}

	@Override
	protected void SetEdible() {
		// TODO Auto-generated method stub
		Edible = true; 
		
	}

	@Override
	protected void setEffects() {
		// TODO Auto-generated method stub
		effect[0] = 0;
		effect[1] = 1;
		effect[2] = -1;
	}

	@Override
	protected void setBribe() {
		// TODO Auto-generated method stub
		canBribe = false;
	}

}
