
public class AsphodelMints extends Candy {

	@Override
	protected void SetName() {
		Name = "Asphodel Mints"; 
	}

	@Override
	protected void SetDescription() {
		// TODO Auto-generated method stub
		Description = "I don't think Mom would like seeing me with these..."; 
	}

	@Override
	protected void SetPoints() {
		// TODO Auto-generated method stub
		Points = -100;
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
		effect[1] = 0;
		effect[2] = 0;
	}

	@Override
	protected void setBribe() {
		// TODO Auto-generated method stub
		canBribe = false;
	}

}
