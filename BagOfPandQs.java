
public class BagOfPandQs extends Candy{

	@Override
	protected void SetName() {
		Name = "Bag of P&Qs"; 
		
	}

	@Override
	protected void SetDescription() {
		// TODO Auto-generated method stub
		Description = "They melt in pretty much anything"; 
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
		effect[0] = 1;
		effect[1] = -1;
		effect[2] = 0;
		
	}

	@Override
	protected void setBribe() {
		// TODO Auto-generated method stub
		canBribe = false;
	}

}
