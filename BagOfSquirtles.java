
public class BagOfSquirtles extends Candy {

	@Override
	protected void SetName() {
		// TODO Auto-generated method stub
		Name = "Bag Of Squirtles"; 
		
	}

	@Override
	protected void SetDescription() {
		// TODO Auto-generated method stub
		Description = "Taste the Jell-O!"; 
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
		effect[0] = -1;
		effect[1] = 0;
		effect[2] = 1;
		
	}

	@Override
	protected void setBribe() {
		// TODO Auto-generated method stub
		canBribe = false;
	}

}
